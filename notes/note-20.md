# PLS Fall 2024 Note 20

## Review for midterm #1

The midterm covers all content through and including language V6.

* Sources relevant to study
  * Readings
    * Notes: All
    * Readings: Slides 3
    * Assignments: a1-a3
    * Your personal notes up to and including Friday October 18th
    * This review sheet
* Language specification
    * Lexical analysis
      * Lexer/scanner
      * Tokens
      * Lexemes
      * Token rules
      * Skip rules
      * Longest-first match rule
      * Regex
    * Syntactic analysis
      * Parser
      * Start symbol
      * Terminals
      * Non-terminals
      * BNF notation
      * Mapping rules to classes and attributes/instance variables in Java
      * Naming LHS non-terminals to disambiguate
      * Naming RHS terminals and non-terminals to disambiguate
      * Repeating rules and optional separator
      * Parse tree/abstract parse tree/abstract syntax tree
      * Capturing and not capturing tokens
    * Semantic analysis
      * `rep`
        * Able to implement a polymorphic method across alternatives
        * `$run` method and the class for the start symbol
        * Able to read and write small snippets of code to walk a parse tree to
          accomplish some goal
* The V* language
  * `Env` - `EnvNode`, `EnvNull`, `Val`, `IntVal`
  * V0
    * Basic expressions: `LitExp`, `VarExp`, `PrimappExp`
    * Pretty print them with toString()
  * V1
    * Use `Env` to evaluate basic expressions
  * V2
    * `IfExp`
    * Truthiness of `Val`s.
  * V3
    * `LetExp`
  * V4
    * `ProcExp`, `AppExp`, `LetExp`-`AppExp`-identity, `SeqExp`
  * V5
    * `LetrecExp`
  * V6
    * `DefineProg` and the top-level environment
* Skills
  * Draw an environment diagram to show the environments created during the
    evaluation of given code in V6 and the environments a `ProcVal` captures
  * Determine the value of a program written in V6
  * Write a small program in V6
  * Rewrite a `LetExp` as an `AppExp`
  * Know and use PLCC commands: `plccmk`, `scan`, `parse`, and `rep`
* Terminology
  * Closure
  * Static scoping
  * Free vs bound variables for a given `proc`
