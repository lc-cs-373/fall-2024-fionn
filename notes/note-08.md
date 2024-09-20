# Note 08

## Sync your repo

On `github.com`, go to your forked repo and click on the `sync fork` button.
Then, if necessary, synchronize the copy in your gitpod instance with the
command `git pull`.  Make sure you issue this command from the `main` branch
(when you type the command `git status` the first line of the output should say

```
On branch main
```
).

## Play the computer

Let us look how the parser handles the output below with our binary tree
language.

```
( bar 1 ( foo 1 2 ) )
```

## Grammar to Java class

Make sure you understand how a grammar production, such as

```
 <tree> ::= LPAREN <TAG> <tree> <tree> RPAREN
```

gets translated into Java code with its instance variables and constructors.

## BNF extension

We saw that a list of numbers separated by spaces can be written with the
following two grammar productions:

```
<nums>:NumsNode ::= <NUM> <nums>
<nums>:NumsNull ::=
```

This type of repetition occurs frequently in grammar productions (e.g., list
of arguments, list literals, etc.).  PLCC has a way to encode this structure
with a single production:

```
<nums> **= <NUM>
```

Check how use of this notation affects the generated Java code.
