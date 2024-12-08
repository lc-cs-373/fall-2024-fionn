# PLS Fall 2024 Note 37

## Software crisis

From [Wikipedia](https://en.wikipedia.org/wiki/Software_crisis):

[I]n the early days, [...] difficulty of writing useful and efficient computer
programs in the required time.

* Projects running over-budget
* Projects running over-time
* Software was very inefficient
* Software was of low quality
* Software often did not meet requirements
* Projects were unmanageable and code difficult to maintain
* Software was never delivered

Various processes and methodologies have been developed [...] to improve
software quality [...] such as *procedural* programming and *object-oriented*
programming.

## Class

A *type* can be

* A set of values (denotational)
* A set of legal operations (abstraction)
* A representation (constructive)

A *class* adds

* A set of operations

## Cluster, module, class

### Clu (1975)

complex_number = cluster is
    add, subtract, multiply, ...
    rep = record [
        real_part: real,
         imag_part: real ]
    add = proc ... end add;
    subtract = proc ... end subtract;
    multiply = proc ... end multiply;
    ...
end complex_number;

### Modula-2 (1977)

DEFINITION MODULE ComplexNumber;

TYPE ComplexNumber = RECORD
                        realPart : REAL;
                        imagPart : REAL
                     END;

PROCEDURE add(a : ComplexNumber; b ComplexNumber) : ComplexNumber;
...

### Simula (1960s)

Begin
    Class ComplexNumber;
        Real realPart;
        Real imagPart;
    Begin
        ComplexNumber Procedure add(a, b);
            ComplexNumber a, b;
        Begin
            ...
        End;
    End;
End;
