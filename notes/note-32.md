# PLS Fall 2024 Note 32

## Review for midterm #2

The midterm covers all from languages SET through NEED.

* Sources relevant to study
  * Readings
    * Notes: All
    * Readings: Slide 3a
    * Assignments: a3 & a4
    * Your personal notes up to and including Monday November 18th
    * This review sheet
* Concepts
  * Side effects
  * Evaluation order
  * Evaluation strategy
    * Strict (e.g., C)
    * Non-strict (e.g., Haskell)
      * Short circuit (e.g., boolean expression in C)
  * Calling conventions
    * By value
    * By reference
    * By name
    * By need
    * By copy-in-copy-out
  * Currying
    *`.proc(x, y) +(x, y) (3, 4)` => `.proc(x) .proc(y) +(x, y) (3) (4)`
  * Closures
  * Thunks
  * Scope
    * Static
    * Dynamic
  * Free vs bound variables
  * Aliasing (page 3a.45)
* Languages
  * SET
    * `SetExp`
    * Side effects, mutation
    * Reference
    * Modify a captured environment (page 3a.4)
    * `ValRef` with `deref` and `setref` methods
  * REF
    * Shared reference
    * Pass by value or by reference depending on effective argument
      * L-value, R-value (page 3a.18)
  * NAME
    * Thunk, `ThunkRef`
    * Different parameter passing strategies depending on effective argument
      * New reference
      * Shared reference
      * Thunk
  * NEED
    * Memoization
    * `ThunkRef`
  * CICO
  * MACRO
    * Dynamic scoping
* Skills
  * Draw an environment diagram to show the environments created during the
    evaluation of given code in SET/REF/NAME/NEED and the environments a
    `ProcVal` captures
  * Determine the value of a program written in SET/REF/NAME/NEED
  * Write a small program in SET/REF/NAME/NEED
