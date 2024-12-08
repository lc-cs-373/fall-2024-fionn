# PLS Fall 2024 Note 36

## Monads

> Monadic curse:  Once you understand the concept of monads, you lose the
> ability to explain it to others.

According to
[Wikipedia](https://en.wikipedia.org/wiki/Monad_(functional_programming)),
a monad is a structure that combines program fragments (functions) and wraps
their return values in a type with additional computation.  In addition to
defining a wrapping monadic type, monads define two operators: one to wrap a
value in the monad type, and another to compose together functions that output
values of the monad type.

At heart, it is a useful programming pattern that allows composition of
functions with side effects.

### Computations that may fail

Video: [What is a Monad?
Computerphile](https://www.youtube.com/watch?v=t1e8gqXLbsU)

### Writer monad

Video: [The Absolute Best Intro to Monads For Software
Engineers](https://www.youtube.com/watch?v=C2w45qRc3aU)

### Applications

* Parsing (Parsec parser library)
* I/O
* Random number generation
* Database queries
* Concurrent programming

### Further readings

* [Haskell: Monads. A 5-minute
  introduction](https://www.youtube.com/watch?v=_Gk_lwhJMzk)
* [Brian Beckman: Don't fear the
  Monad](https://www.youtube.com/watch?v=ZhuHCtR3xq8)
* [Monads and Gonads](https://www.youtube.com/watch?v=b0EF0VTs9Dc)
