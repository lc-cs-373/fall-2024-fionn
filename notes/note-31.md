# PLS Fall 2024 Note 31

## Types

When should/can a compiler infer types?  When should it require help from the
programmer?

* What is the type of literal `42`?
* What is the type of literal `true`?
* What is the type of variable `v`?
* What is the type of `proc(x) x`?

### Our choice

* Declare
  * types of `proc` formal parameters
  * type of `proc` return
* Infer
  * Types of variables
  * All expression's types

Any issues?  Yes, what is the type of any free variable?  Here our static
scoping rule comes to the rescue.

### Example

```
let
    condition = true
    quantity = 7
    foo = proc(x : int, y : bool) : int {
        if y then add1(x) else x
    }
in
    .foo(quantity, condition)
```

## TYPE1

General design:

1. Evaluate the expression's type
2. If step 1 is okay, evaluate the expression's value

### Questions

What is the type of the following `proc`?  Check one.

```
proc(x : int, y : bool) : int if y then 0 else x
```

`[  ]` `int`

`[  ]` `[int, bool]`

`[  ]` `[int, bool] => int`

`[  ]` `[int, bool => int]`

What is the result of the following expression?  Check one.

```
if 0 then 22 else 44
```

`[  ]` `22`

`[  ]` `44`

`[  ]` `0`

`[  ]` Exception, `0` is not a boolean

Assuming the following (legal) definition of `p`

```
define p = proc(x : int, y : bool) : int { if y then add1(x) else x }
```

for each of the following expressions, determine if it passes the type check
and, if not, state the reason for the failure.

```
.p(3, false)
.p(3)
.p(3, 1)
.p(.p(3, true), false)
```

Determine if the type checker accepts any of the following expressions and, if
not, state the reason for the failure:

```
define p = proc(x : int, y : bool) : int { if y then add1(x) else x }
define q = proc(x : int) : int { zero?(x) }
define r = proc(x : int, y : bool) : int { if y then add1(x) else true }
define t = proc(x : int) : int { set x = zero?(x) }
```

Define a procedure that adheres to the type signature `[ int, [ int, bool =>
int ] => bool ]`
