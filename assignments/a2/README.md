# CS 373 - Assignment a2

## QUESTION 1 (LONN)

Starter file.

```
q1/lonn.grammar
```

LONN is a language for a nonempty-list-of-numbers.  Implement the minimum-value
semantics for this language.  Here is an example `rep` session.

```
--> (    3 )
3
--> (3 5    2 4)
2
--> ()
ERROR (your actual error message will be different from this)
```

You should test your implementation by running `rep` program with example input.

## QUESTION 2 (BINARY)

In `q2/binary.grammar`, write a lexical specification and semantics for unsigned
binary numbers.  The meaning of this language is the decimal value of the given
binary number.  Here is an example `rep` session.

```
--> 0
0
--> 101
5
--> 000000011
3
--> 10000
16
--> 11111
31
--> 012
ERROR
```

Your lexical specification should have exactly three tokens: `NL` (a newline)
defined as `'\n'`, and binary digits `ZERO` and `ONE`.

I've given you a start on the syntactic specification.  You will need to add two
grammar rules for the `<bit>` nonterminal, with RHS entries `ZERO` and `ONE`,
respectively, along with names of the subclasses of the `Bit` class to
accommodate the fact that there are two grammar rules with `<bit>` on their
left-hand sides.  You will need to choose those subclass names.

Once you have the lexical and syntactic specification complete, test them using
`parse -t`.

Add semantics to your grammar file by defining the following methods:

* A `$run` in `Start` that prints the results of calling `bits.eval`.
* An `eval` for `Bits` that runs through each `Bit` in `bitList`, calls their
  `eval`, calculates the decimal value, and returns the result as an `int`.
* Declare an abstract `eval` on `Bit` that returns an `int`.
* Define `eval` that returns an `int` in the two subclasses of `Bit`; one of
  these should return `0`, the other should return `1`.

Use the following algorithm to calculate the binary value of the given bits (do
not use any libraries to do the work for you).

Use an accumulator pattern to calculate the decimal value.  Initialize `sum` to
`0`.  Then loop through the bits from left to right.  On each pass of the loop,
multiply the current sum by `2` and then add the current bit to the sum.  Here's
example of converting `1011011` binary to `91` decimal:

```
running sum     =         0 (initial value)
                         /
                   _____/
                  /
1       base 10 = 0*2+1 = 1
^                     ^  /
                   _____/
                  /
10      base 10 = 1*2+0 = 2
 ^                    ^  /
                   _____/
                  /
101     base 10 = 2*2+1 = 5
  ^                   ^  /
                   _____/
                  /
1011    base 10 = 5*2+1 = 11
   ^                  ^  /
                   _____/
                  /
10110   base 10 =11*2+0 = 22
    ^                 ^  /
                   _____/
                  /
101101  base 10 =22*2+1 = 45
     ^                ^  /
                   _____/
                  /
1011011 base 10 =45*2+1 = 91
      ^               ^
```

If the `bitList` is empty (check its size), the `eval` method should throw a
`PLCCException` with a message indicating that there are no digits.

## WHAT TO HAND IN

Upload your completed `q1/lonn.grammar` and `q2/binary.grammar` files.
