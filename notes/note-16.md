# PLS Fall 2024 Note 16

## Drawing more environments

Consider:

```
let
    x = 3
in
    proc(t) +(t,x)
```

Next:

```
let
    x = 3
in
    .proc(t) +(t,x) (5)
```

One more:

```
let
    x = 3
in
    let
        f = proc(t) +(t,x)
    in
        .f(5)
```
