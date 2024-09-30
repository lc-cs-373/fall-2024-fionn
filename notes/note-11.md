# PLS Fall 2024 Note 11

## Variable

A *variable* in a program is a symbol that has an associated value at run-time.

## Binding

At any instance in time, the value associated with a variable is called a
*binding* of the variable to the value.

At run-time, how can you find the value bound to a variable?  There are two
basic approaches:

* if the value bound to a variable can be determined by *where* that variable
  appears in the text of a program, we call it *static* binding

* if the location of the value bound to a variable can only be determined by
  *when* the variable is accessed during program execution, we call it *dynamic*
  binding

## Scope

For a given variable, the scope of the variable is the region of code in which
that variable's binding can be determined.

### Example

```java
public class Bar {
    public static int x;

    public static void main(String [] args) {
        x = 3;
        System.out.println(x);
        { // beginning of block
            int x = 4;
            System.out.println(x);
        } // end of block
        System.out.println(x);
    }
```

This code displays `3`, `4`, and finally `3`.

We say that the inner binding of `x` *shadows* the outer binding of `x`.

## Environment

*Environment* is the framework we will use in this course to implement *static
bindings*.
