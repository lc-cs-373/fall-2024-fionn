# PLS Fall 2024 Note 27

## NAME

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

`[  ]` 9

`[  ]` 3

`[  ]` 6

What is the value of the following expression?

```
let
    x = 3
    f = proc(t) { set t = +(t, t) }
in
{
    .f(x);
    x
}
```

`[  ]` 12

`[  ]` 9

`[  ]` 3

`[  ]` 6

<br/><br/><br/><br/><br/>

What is the value of this expression?

```
let
    x = 3
    p = proc(t) { t; t; t }
in
    .p(set x = add1(x))
```

`[  ]` 5

`[  ]` 3

`[  ]` 6

`[  ]` 4

What is `x` bound to when `f` is applied?

```
let
    f = proc(x) ...
in
    .f(+(1, 2))
```

`[  ]` A thunk containing the expression `+(1, 2)`.

`[  ]` A new reference to the value `3`.

`[  ]` The value `3`.

`[  ]` A shared reference to the value `3`.

<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>

## NEED

What is `x` bound to when `f` is applied?

```
let
    f = proc(x) ...
in
    .f(proc(y) +(1, 2))
```

`[  ]` A thunk containing the unevaluated proc expression.

`[  ]` A new reference to a proc value.

`[  ]` A proc value.

`[  ]` A shared reference to a proc value.

What is `x` bound to when `f` is applied?

```
let
    f = proc(x) ...
    y = 3
in
    .f(y)
```

`[  ]` A new reference to the value `3`.

`[  ]` A thunk containing the expression `y`.

`[  ]` A shared reference to the value `3`.

`[  ]` The value `3`.

What is x bound to when f is applied?

```
let
    f = proc(x) ...
in
    .f(+(1, 2))
```

`[  ]` A shared reference to the value `3`.

`[  ]` A thunk containing the expression `+(1, 2)`.

`[  ]` The value `3`.

`[  ]` A new reference to the value `3`.

What is the value of this expression?

```
let
    x = 3
    p = proc(t) { t; t; t }
in
    .p(set x = add1(x))
```

`[  ]` 4

`[  ]` 3

`[  ]` 6

`[  ]` 5

What is `x` bound to when `f` is applied?

```
let
    f = proc(x) ...
in
    .f(3)
```

`[  ]` A thunk containing the expression `3`.

`[  ]` The value `3`.

`[  ]` A new reference to the value `3`.

`[  ]` A shared reference to the value `3`.
