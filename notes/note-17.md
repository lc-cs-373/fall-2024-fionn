# PLS Fall 2024 Note 17

## Eliminating the `let` construct

Once we have functions, we can entirely eliminate the `let` construct! Take the
following `let` expression, for example:

```
let
    p = 3
    q = 5
in
    +(p, q)
```

It can be rewritten as an application of an anonymous (un-named, lambda)
function as follows:

```
.proc(p, q) +(p, q) (3, 5)
```

More generally,

```
let
    v1 = e1
    v2 = e2
    ...
in
    e
```

can always be converted to

```
.proc(v1, v2, ...) e (e1, e2, ...)
```

Eliminate all the `let` expression in the following program:

```
let
    x = e1
in
    let
        y = e2
    in
        e3
```

## Recursion

In Python:

```python
def fact(x):
    return x * fact(x - 1) if x else 1

print(fact(5))
```

Let's translate this program into V4:

```
let
    fact = proc(x) if x then *(x, .fact(sub1(x))) else 1
in
    .fact(5)
```

Why doesn't it work?

All problems in computer science can be solved by adding a level of indirection:

```
let
    fact = proc(f, x) if x then *(x, .f(f, sub1(x))) else 1
in
    .fact(fact, 5)
```

Exercise: remove the `let` expression.
