# PLS Fall 2024 Note 18

## V5

V5 introduces the `letrec` expression.

```python
letrec
    fact = proc(x) if x then *(x, .fact(sub1(x))) else 1
in
    .fact(5)
```

## V6

V6 add the ability to define top-level bindings that persist from one
expression evaluation to another.
