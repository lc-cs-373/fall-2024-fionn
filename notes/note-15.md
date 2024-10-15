# PLS Fall 2024 Note 15

## Language V4

So far our languages do not provide any mechanism for repetition.  In an
expression-based language (ours fall into this category), repetition is
typically accomplished through recursion, and recursion depends on the ability
to apply procedures recursively.

To *define* a procedure means to describe how it behaves.  To *apply* a
procedure means to give the procedure the proper number of inputs and to receive
its result.

Using mathematical notation, we can define a function *f* with

*f(x) = x + 3*

and we can apply the function *f* with

*f(5)*

The result of this particular application is 8.

Here is how function *f* is *defined* and *applied* in V4:

```
let
    f = proc(x) +(x, 3)
in
    .f(5)
```

### Examples

```
let
    f = proc(x, y) +(x, y)
in
    .f(3, 8)
```

```
let
    f = proc(z, y) +(10, y)
let
    .f(3, 8)
```

```
let x = 10
in
    let
        x = 7
        f = proc(y) +(x, y)
    in
        .f(8)
```

### Three more examples

What is happening with the following three examples?  Hint: They all evaluate to
`5`.

```
let
    app = proc(f, x) .f(x)
    add2 = proc(y) add1(add1(y))
in
    .app(add2, 3)
```

```
let
    app = proc(f, x) .f(x)
in
    .app(proc(y) add1(add1(y)), 3)
```

```
.proc(f, x) .f(x) (proc(y) add1(add1(y)), 3)
```
