# CS 373 - Assignment a3

Relevant slides: Slides 3 up to and including those for V5.

Continue the practices established in the first two assignments for organizing
and submitting your work.

## ENVIRONMENT DIAGRAMS

In the first several questions you will draw environment diagrams.  You may use
a diagram editor or draw them by hand.  However you draw them, you need to
submit them as one of the following file types: `png`, `jpeg`, or `pdf`.  Each
diagram must be in a separate file.  The name of the file must start with the
question number: e.g., `1.png`, `2.png`, etc.

If you draw your answer by hand, be sure that your image is legible.  You may
want to trace over your lines using a sharpie to make the lines clear.

The defined language for all of these questions is V5.

## QUESTION 1

Draw a diagram of the all environments that are created during the evaluation of
the following expression.  You may assume that the initial environment is empty.

> TIP: Remember only `let` expressions and `proc` applications create new
> bindings and extend environments.  Primitive operations do not.

```
let
    x = 3
    y = 5
    z = 8
in
    +(x, +(y, z))
```

## QUESTION 2

Repeat the above with the following expression.

```
let
    x = 3
in
    let
        y = 5
    in
        let
            z = 8
        in
            +(x, +(y, z))
```

## QUESTION 3

Repeat the above with the following expression.

> TIP: Be sure to show the environments created by `proc` applications.

```
let
    x = 3
in
    let
        p = proc(t) +(t, x)
    in
        .p(5)
```

## QUESTION 4

Repeat the above with the following expression:

> TIP: Be sure to show the environments created by `proc` applications.

> TIP: Notice that the inner-inner `let` evaluates to a `ProcVal`!

```
let
    t = 3 
in
    let
        f = let
                x = t
            in
	              proc(t) +(t, x)
    in
        .f(5)
```

## QUESTION 5

> TIP: Be sure to show the environments created by `proc` applications, even the
> recursive calls!

```
letrec
    sumi = proc(x) {
        if x
        then +(x, .sumi(sub1(x)))
        else 0
    }
in
    .sumi(1)
```

## QUESTION 6

We have provided an algorithm that shows how a `let ... in ...` expression can
be replaced by a procedure application.  Carry out this algorithm with the
following expression by writing a procedure application that is equivalent to
the given expression.  Use the algorithm ONLY to replace all `let ... in ...`
expressions.  Do not make any other changes to the given expression.  Your
answer should not have any `let`s.

> NOTE: You are strongly encouraged to use V4 to evaluate both the original
> expression and your `let` removal conversion expression to be sure that they
> both evalulate to the same thing.

```
let
    x = 3
    y = 5
    z = 8
in
    +(x, +(y, z))
```

Copy your answer in a file called `6.txt`

## QUESTION 7

Repeat the above with the following expression:

```
let
    x = 3
in
    let
        y = 5
    in
        +(x, +(y, 2))
```

[Hint: work from the inside out.]

Copy your answer in a file called `7.txt`

## QUESTION 8

Repeat the above with the following expression:

```
let
    p = proc(t) add1(t)
in
    .p(4)
```

Copy your answer in a file called `8.txt`

## QUESTION 9 (NEG)

`./NEG` contains a copy of the V1 language.  Add a `neg` primitive that takes a
single argument and returns the value of its arithmetic negative.  For example,
the expression

```
neg(add1(3))
```

evaluates to `-4`, and

```
neg(neg(42))
```

evaluates to `42`.

You will need to modify the `grammar` file by adding a `NEGOP` token and
creating a grammar rule for the `NegPrim` primitive.  You will also need to
modify the `prim` file so that it will handle the `apply` semantics in the
`NegPrim` class.  Observe that this primitive takes a single argument.

Also, modify the specification of the `LIT` token in your NEG grammar so that a
literal can begin with an optional minus sign, with the obvious interpretation.
For example, both of the following expressions evaluate to `11`:

```
neg(-11)
add1(10)
```

## QUESTION 10 (MACRO)

`./MACRO/` contains a copy of V5. You will modify code in `./MACRO/` to answer
this question.

From our Chapter 3 class notes, you have seen that a procedure expression (a
`ProcExp`) evaluates to a closure (a `ProcVal`) that captures the environment in
which the procedure is evaluated (i.e., defined).  Consider this example:


```
let
    x = 3
in
    let
        p = proc(t) +(t, x)
    in
        let
            x = 42
        in
            .p(5)
```

Using static scope rules, the `x` variable that occurs free in the `proc` body
will evaluate to `3` when the body is evaluated, since the body is evaluated in
the environment captured where the procedure is defined, which has `x` bound to
3.

Another approach to dealing with variables that occur free in a procedure body
is to use their bindings where the procedure is *applied* rather than where the
procedure is *defined*.  This approach is called dynamic scope rules, to
distinguish it from static scope rules.

We want to maintain the static scoping behavior of procedures, so to implement
dynamic scope rules we will introduce the notion of a "macro".  A macro
application behaves exactly like a procedure application except that the
bindings of variables that occur free in the body of a macro are obtained in
the environment in which the macro is applied instead of the environment in
which the macro is defined.  Considering this, the following example evaluates
to `47`:

```
let
    x = 3
in
    let
        m = macro(t) +(t, x)
    in
        let
            x = 42
        in
            .m(5)
```

Specifically, the procedure application `.m(5)` appears in an environment where
`x` is bound to `42`, so the variable `x` that occurs free in the body of `m`
therefore evaluates to `42` in this application.  The entire expression evalutes
to `47`.

Now let's discuss the implementation of this macro feature (remember you'll be
modifying the code in `./MACRO/`).

Since a macro doesn't capture the environment in which it is defined (unlike a
procedure), we can define a `MacroVal` object to be exactly like a `ProcVal`
object, except that it does not have an `Env` field.  Modify your `val` file to
add a `MacroVal` class to do this — copy the `ProcVal` class, re-name it to
`MacroVal`, remove the `Env` field, and appropriately modify the constructor.

You will need to modify your grammar so that its lexical specification includes
the `MACRO` token.  Add an `<exp>` grammar rule that is exactly like a `ProcExp`
except that it is named `MacroExp` and it has `<macro>` on its right-hand side.
Simliarly, add a `<macro>` grammar rule that looks exactly like the `<proc>`
grammar rule except that its right-hand side starts with `MACRO` instead of
`PROC`.

In your code file, add a `MacroExp` section that behaves exactly like the
`ProcExp` section except that you call `macro.makeMacro()` instead of
`proc.makeClosure(env)`.  The reason that you don't pass `env` in the
`makeMacro` method is that a `MacroVal` doesn't capture its defining
environment.

In your code file, add a `Macro` section that looks exactly like the `Proc`
section except that it defines the `makeMacro` method.  This method has no
parameters and simply returns a new `MacroVal` object, passing it the `formals`
and `exp` fields — remember, there's no `Env` parameter for a `MacroVal`.

The only place that now needs fixing is the apply method in the `MacroVal`
class.  Assuming that you copied the apply method from the `ProcVal` class into
the `MacroVal` class, you need to see how to modify this so that apply will
properly behave as a macro.  You will need to modify ONLY TWO CHARACTERS in this
definition to make it work properly.

At this point you should be able to compile everything and test your new
language.  Use the above examples to make sure it works as advertised.

Here's another observation that should cement the difference between procedures
and macros.  Since a macro application uses current bindings for variables that
occur free in its body, a macro can refer to itself without having to use the
"`letrec` trick" for procedure bindings.  Thus the following definition works:

```
let
    f = macro(t) if t then *(t, .f(sub1(t))) else 1
in
    .f(5) % returns 120
```

Although `f` occurs free in the macro body, by the time `.f(5)` is evaluated,
`f` is bound to the macro, and the occurrence of `f` in the macro body is now
(dynamically) bound.

Macros are inherently dangerous, however, since it's hard to reason about
programs that use dynamic scope rules — you can never depend on what value
might be bound to a variable that occurs free in the macro body by examining
the static properties of the code.

You can test your implementation using the expressions above.  You should
create other examples of test expressions that show the differences between
procedure and macro applications.
