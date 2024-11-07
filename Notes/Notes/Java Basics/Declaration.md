# Declaring Variables and Methods

## What are the rules for naming variables and methods in java?

### Variables

- All variable names must begin with a letter of the alphabet, an underscore ( _ ), or a dollar sign ($). 
- Can't begin with a digit.  
- The rest of the characters may be any of those previously mentioned plus the digits 0-9.
- The convention is to always use a (lower case) letter of the alphabet. The dollar sign and the underscore are discouraged.

- In Java, variables and methods must be declared before they can be used.  
- Variables are containers for storing data values. 
- They must be declared with a data type and an optional initial value. 

Example: 
```
int num = 10; 
String name = "John"; 
```

### Methods

Methods are blocks of code that perform a specific task. They are declared within a class and can optionally return a value. 

Example: 
```
public int add(int a, int b) 
{ return a + b; }
```