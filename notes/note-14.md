# PLS Fall 2024 Note 14

## Drawing environments

Consider:

```
let
    x = 3
    y = 5
in
    +(x, y)
```

A little more involved:

```
let
    x = 3
    y = 3
in
    let
        x = +(x, y)
        z = x
    in
        +(x, y)
```

Caution, subtlety ahead:

```
let
    x = 3
    y = 5
in
    let
        x = let y = x in +(x, y)
        y = let x = y in +(y, x)
    in
        +(x, y)
```
