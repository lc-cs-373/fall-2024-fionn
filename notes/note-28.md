# PLS Fall 2024 Note 28

## Order of evaluation

Consider a `let` clause with multiple declarations, for instance,

```
let
    a = some expression...
    b = some other expression...
in
    ...
```

or the application of a function that takes more than one parameter, for
instance,

```
let
    f = proc(a, b) ...
in
    .f(some expression, some other expression...)
```

In the absence of side-effects, (e.g., our early languages without the `set`
expression) the order in which we evaluate `some expression` and `some other
expression` does not matter.

However, with a language like SET, the order matters.  Consider

```
let
    x = 3
in
    let
        y = {set x = add1(x)}
        z = {set x = add1(x)}
    in
        z
```

What is the result of evaluating the above program, if the `let` declarations
are executed in the order in which they appear in the text?

How different is the result if the declarations are executed in the reverse
order?

Does the language SET specify a specific order?

What does it say about SET?

Some programming languages | Order of evaluation
-|-
Python, Java, C# | left-to-right
OCaml | right-to-left
C, Scheme | undefined
Haskell | single-argument functions (currying)

### Currying

Transform the following program, using currying, into a sequence of
single-argument function applications.

```
let
    x = 3
    y = 5
    p = proc(t, u) +(t, u)
in
    .p(x,y)
```
