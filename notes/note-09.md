# Note 09

## Parse trace

Entering the command `parse -t` will output a trace of the parse tree to
standard output.

## Semantic

The runtime semantics of any PLCC program is the behavior obtained by calling
the `$run` method on the parse tree.

Here is the default implementation of `$run` defined in `_Start.java`:

```java
public void $run() {} {
    System.out.println(this.toString());
}
```

## `V0`

`V0` is a small language of expressions.

For each of the following expressions, draw the parse tree and verify your
answer with the `parse -t` command:

* `sub1(x)`
* `add1(+(2, 3))`
* `-(sub1(+(4, 1)), 0)`
