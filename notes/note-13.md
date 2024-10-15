# PLS Fall 2024 Note 13

## Language V3

### `let` expressions

Syntax:

```
let
    x = 3
    y = 8
in
    +(x, y)
```

### Examples

```
let
    x = 10
in
    let
        z = 3
        y = 8
    in
        +(x, y)
```

```
let
    x = 3
in
    let
        x = add1(x)
        y = add1(x)
    in
        +(x, y)
```

```
let
    x = 3
in
    let
        x = add1(x)
    in
        +(x, x)
```

```
let
    x = 3
in
    +(let x = add1(x) in x, x)
```

```
let
    p = 4
in
    let
        p = 42
        x = p
    in
        x
```
