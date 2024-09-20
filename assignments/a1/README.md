# CS 373 - Assignment a1

## QUESTION 1

`a1/q1` contains the following starter files.

- `q1-grammar` - An empty file which you will modify.
- `input.txt` - Sample input for the scanner. (Do not modify)
- `expected.txt` - Expected output when scanner is given `input.txt`. (Do not modify)

In `q1-grammar`, write a lexical specification acceptable to PLCC that skips over
whitespace and skips all characters from a '#' character to the end of the line.
The lexical specification should accept the following strings as specific
tokens:

```
this
that
the
other
thing
```

All other strings consisting of letters, digits, and underscores should be
returned as a single ID token.  You should use appropriate token class names for
the other tokens. If you encounter anything that does not conform to these
specifications, it's an error.

`input.txt` contains the following input for the scanner (Scan):

```
# example input
this that # the other thing
otherwise the thing
that is another thing
other#other#other#other
thisthat the end99 12345xxx _!
```

`expected.txt` contains the expected output when the scanner is run on
`input.txt`.

```
   2: THIS 'this'
   2: THAT 'that'
   3: ID 'otherwise'
   3: THE 'the'
   3: THING 'thing'
   4: THAT 'that'
   4: ID 'is'
   4: ID 'another'
   4: THING 'thing'
   5: OTHER 'other'
   6: ID 'thisthat'
   6: THE 'the'
   6: ID 'end99'
   6: ID '12345xxx'
   6: ID '_'
   6: ERROR '!'
```

> **DEVELOPMENT LOOP**
>
> To set up, position your terminal in the directory that contains the grammar
> file you want to work on.
>
> Use Visual Studio Code to edit the grammar file.
>
> After each change, do the following:
>
> 1. Remove files generated in the last cycle so they don't interfere with this
>    cycle.
>    ```bash
>    rm -rf Java
>    ```
>
> 2. Compile the grammar.
>    ```bash
>    plccmk q1-grammar
>    ```
>
> 3. Test using manual input.
>    ```bash
>    scan
>    type some test
>    input and see what happens
>    press CTRL+D to send EOF when you are done
>    ^D
>    ```
> 4. Test using input from a file.
>    ```
>    scan < input-file
>    ```

## QUESTION 2

In `q2/q2-grammar` write a lexical specification for PLCCs lexical specification.
We are getting "meta" here. We want a scanner that can identify the tokens for
PLCC's lexical specification language. For example:

```
token HI 'hi'
skip BYE 'bye'
# comments too
```

## QUESTION 3

Consider the following grammar rule in a PLCC file:

```
<blah>:Goo ::= THIS <VAR> IS <silly>
```

What (non-abstract) Java class does this grammar rule define, and what are its
instance variables (a.k.a. fields) and types?  Write your answer in the form of
a Java signature for the constructor for the class:

```
XXX(AAA aaa, BBB bbb, ...)
```

Here `XXX` is the class name, and the instance variables are `aaa` of type
`AAA`, `bbb` of type `BBB`, and so forth.

### ANSWER

In a separate text file (e.g., `a1.txt`), write "QUESTION 3" followed by your
answer (a single line) on its own line.

## QUESTION 4

Repeat the question above, except use the following grammar rule:

```
<many> **= THIS <rule> HAS MULTIPLE OCCURRENCES <OF> <stuff>
```

### ANSWER

In `a1.txt`, write "QUESTION 4" followed your answer (a single line).

## QUESTION 5

Repeat the question above, except use the following grammar rule:

```
<classes> ::= I AM TAKING <CSIT>c1 <CSIT>c2 AND <CSIT>c3
```

### ANSWER

In `a1.txt`, write "QUESTION 5" followed your answer (a single line).

## QUESTION 6

Consider what is wrong with the following grammar rule in a PLCC file.  You can
assume that this is part of a larger PLCC grammar file in which other token
specifications and grammar rules may appear.  Your answer should be a grammar
rule that fixes all of the obvious errors on this line and that will be
acceptable to PLCC. Your answer should keep the essential nature of the original
grammar rule.

Do *not* add or remove any of the '<' or '>' characters. Do *not* try to
explain your answer -- just give the corrected grammar rule.

```
<VAR> := token <foo>
```

### ANSWER

In `a1.txt`, write "QUESTION 6" followed your answer (a single line).

## QUESTION 7

In `q7/q7-grammar`, define a grammar that generates a parser that accepts strings
that only contain a balanced set of parentheses, and end in an at-sign.

For example, the following are legal sentences in the proposed language.

```
@
()@
()(()(()))@
```

The following are illegal sentences in the proposed language.

```
())@
(@
)(@
(()@
()
```

`q7/q7-grammar` contains a partial implementation of the language. So far, it
contains a complete lexical specification. Your job is to complete the syntactic
specification.

Your first rule should begin...

```
<balanced> ::=
```

The legal and illegal input files have been provided for your convenience in
`a1/q7/input/`.

> **Development Cycle**
>
> Same as in q1, but this time you need to test the parser.
>
> ```bash
> # Test all the illegal strings and make sure they fail.
> parse < input/illegal-01
> parse < input/illegal-02
> ...
> # Test all the legal strings and make sure they pass.
> parse < input/legal-01
> ...
> ```
>
> If you get tired of repeating these tests over and over again. Consider
> writing a script to do it for you.

* Constraint: ***Do not*** use the repeating rule (`**=`).
* Tip: You should be able to define your grammar in just three BNF lines using
  two non-terminals.
* Tip: You may need to provide PLCC with class names and/or instance variable
  names to avoid collisions.
* Tip: Consider looking at languages/LON/grammar for some ideas.

## QUESTION 8

Going meta again... In `q8/q8-grammar`, build a grammar for PLCC's lexical
specification.  Please ensure that your grammar embodies the following
structure.

* Each line is either a comment or a rule.
* Each rule is either a skip rule or a token rule.
* The keyword "token" in a token rule is optional.

## QUESTION 9

Continuing from question 8, in `q9/q9-grammar` add a semantic specification, that
creates a pretty-printer for a lexical specification. Your pretty-printer will
reproduce the original input without comments, and with any `token` keywords
that were not present. For example, if the input was

```
skip WS '\s+'
# I have too much to do, so I'm not going to use the token keyword.
HI 'hi'
# OK, I have time to type this one.
token BYE 'bye'
```

When you run this through your interpreter (pretty-printer), it would produce.

```
skip WS '\s+'
token HI 'hi'
token BYE 'bye'
```

Reminder: for polymorphism to work, the base-class must have at least an
abstract method as a placeholder.
