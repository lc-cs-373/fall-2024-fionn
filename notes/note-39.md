# PLS Fall 2024 Note 39

## Polymorphism

Polymorphism is a hallmark of object-oriented programming.  But it is not the
only recognized form of polymorphism.  This note discusses three forms.

### Subtyping or subtype polymorphism

This form of polymorphism is a defining characteristics of object-oriented
programming.  It occurs when a single method is defined in different classes
related through inheritance.  If there are multiple methods, the question then
arises: which one should be called?  The process of selecting the method is
called *dispatch*.  To make polymorphism work, we want the most specific
implementation of that method to be called.  This is called dynamic dispatching.
For some language it is the default (Java, Python), in others not (C++).  Some
languages give you a choice (C++), others do not (Java).

### Parametric polymorphism

The identity function, `id = proc(x) x`, returns the value it was passed as a
parameter.  To do its job, this function does not need to know the type of the
value passed as a parameter.  An implementation of `id` that can take values of
arbitrary types as input is an example of parametric polymorphism.

More generally a function that can operate on different types is regarded as
polymorphic.  For instance, a function appending two lists together can be
defined without regard to whether it is given two lists of integers or two lists
of booleans.

This feature was first introduced in ML in 1975.  Today it is supported in many
languages (Haskell, Python, TypeScript, C++).  Java introduced *generics* to
support parametric polymorphism.

### Ad-hoc polymorphism

In procedural or objected-oriented programming languages, this feature is also
called function or operator overloading.  For instance, the `+` binary operator
in both Java and Python has defined behaviors for integers, floating-point
numbers, and strings.  In the first two cases, `+` means addition as defined for
integers and real numbers.  In third case, it means concatenating strings.

This form of polymorphism is different from parametric polymorphism in the
sense that ad-hoc polymorphism introduces *different* behaviors for each type
involved ("adding" two integers is different than "adding" two strings).  In
parametric polymorphism, on the other hand, we have a *single* behavior that
suits multiple types.

Some languages allow the programmer to overload operators (e.g., Python), to
overload functions (e.g., Java), or to overload both (e.g., C++).
