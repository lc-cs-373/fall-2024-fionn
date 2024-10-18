# PLS Fall 2024 Note 19

## Free variables and bound variables

Informal definitions.

A symbol `x` occurs free in an expression `E` if `x` appears somewhere in `E` in
a way that is not bound by any declaration of `x` in `E`.

A symbol `x` occurs bound in `E` if `x` appears in `E` in such a way that is
bound by a declaration of `x` in `E`.

It is possible for the same symbol to occur both bound and free in different
parts of an expression.

Note that the declaration itself is not considered free or bound.

Examples:

```
proc(x) x               % x occurs bound
proc(x) y               % y occurs free
.proc(x) x (x)          % first x is bound,
                        % second is free
.proc(x) x (y)          % y occurs free
proc(y) .proc(x) x (y)  % y occurs bound
proc(x) .proc(y) x (y)  % y occurs free
.t (u)                  % t and u occur free
```
