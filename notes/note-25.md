# PLS Fall 2024 Note 25

## Sequence of expressions

Introduced in V4, a sequence of expressions is a semicolon-separated list of
expressions enclosed in a pair of curly braces.  In such a sequence, the
expressions are evaluated left-to-right and the value of the last expression
is returned.  Such sequences are not particularly useful in the V languages
because these languages lack side effects.

Example:

```
{ 1; 2; +(1, 2) }
```

## SET

What is the value of the following expression?

```
let
    t = 3
    u = 42
    v = 0
in
{
    set v = set u = set t = add1(t); +(t, +(u, v))
}
```

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

`[  ]` 12

`[  ]` 3

`[  ]` 6

`[  ]` 9

What is the value of the following expression?

```
let
    x = 3
in
    let
        f = proc(v) set v = +(v, 3)
        x = 0
    in
    {
        .f(x);
        x
    }
```

`[  ]` 6

`[  ]` 0

`[  ]` 3

`[  ]` nil

<br/><br/><br/><br/>

What is `x` bound to when `f` is applied?

```
let
    f = proc(x) ...
    y = 3
in
    .f(y)
```

`[  ]` A thunk containing the expression y.

`[  ]` The value 3.

`[  ]` A shared reference to the value 3.

`[  ]` A new reference to the value 3.

<br/><br/><br/><br/><br/>

What is `x` bound to when `f` is applied?

```
let
    f = proc(x) ...
in
    .f(3)
```

`[  ]` A thunk containing the expression 3.

`[  ]` A shared reference containing the value 3.

`[  ]` The value 3.

`[  ]` A new reference containing the value 3.

What is the value of the following expression?

```
let
    x = 3
    p = proc(t) set t = add1(t)
in
{
    .p(x);
    x
}
```

Were you expecting a different behavior?  If so, which one?
