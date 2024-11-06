# PLS Fall 2024 Note 26

## Parameter passing styles

Convention | Description | First introduced | Used in
-|-|-|-
by reference | a reference to the argument; typically its address | 1958 | Fortran II, PL/I, selectable in Pascal, Simula, Modula, Oberon, Ada, C++
by value | a copy of the argument | 1960 | Algol, C, Scheme, Java, default in Pascal, Simula, Modula, Oberon, C++
by name | replace parameters with the unevaluated argument expressions, then evaluate them in the context of caller every time that the function uses the parameters | 1960 | Algol 60, Simula, Scala
by need | replace parameters with the unevaluated argument expressions, then evaluate them in the context of caller the first time that the function uses the parameters and values stored for subsequent uses; memoized variant of call by name | 1971 | SASL, Haskell, R

## Strict evaluation

Strict evaluation order is a family of evaluation orders in which a function's
arguments are evaluated completely before the function is applied.  These types
of evaluation order have the effect of making the function strict, i.e. the
function's result is undefined if any of the arguments are undefined.

Java evaluates function arguments left-to-right.  C leaves the order undefined.
Scheme requires the execution order to be the sequential execution of an
unspecified permutation of the arguments.  All of these are strict evaluation.

Call by reference and call by value typically yields a strict evaluation.

## Non-strict evaluation

A non-strict evaluation order is an evaluation order that is not strict, that
is, a function may return a result before all of its arguments are fully
evaluated.

Haskell is non-strict.

Call by name or call by need typically yields a non-strict evaluation.

Boolean expressions in many languages use a form of non-strict evaluation called
short-circuit evaluation, where evaluation evaluates the left expression but may
skip the right expression if the result can be determined.

<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>

## REF

What is the value of the following expression?

```
let
    x = 3
    f = proc(t) +(t, t)
in
{
    .f(set x = +(x, x));
    x
}
```

`[  ]` 3

`[  ]` 9

`[  ]` 12

`[  ]` 6

What does the following evaluate to?

```
let
    y = 3
    f = proc(y) { set y = 4 }
in
    let
        x = 0
    in
    {
        .f(x);
        x
    }
```

`[  ]` 4

`[  ]` 3

`[  ]` 0

`[  ]` null

What is `x` bound to when `f` is applied?

```
let
    f = proc(x) ...
in
    .f(+(1, 2))
```

`[  ]` A thunk containing the expression +(1, 2).

`[  ]` A new reference to the value 3.

`[  ]` A shared reference to the value 3.

`[  ]` The value 3.
