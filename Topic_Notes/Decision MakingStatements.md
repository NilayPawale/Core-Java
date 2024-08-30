# Decision Making Statements :

Decision making statements determine which statements to execute depending upon the outcome of a supplied condition or an expression.

There are two different decision making statements available in Java.
- if statements
- switch statements

## 1) if statements

There are three different versions of if statements available in Java.

### a) Simple if Statement
Simple if statement is the most basic of all control flow statements. It is used when you want a certain block of code or set of statements are to be executed only when a supplied condition evaluates to TRUE.
```
if (condition) 
{
    //Set of statements : These are executed only if condition is TRUE
}
```

### b)  if-else statement
It is an extension to simple if statement. It has two blocks. 
One is if-block and another one is else-block. if-block is executed if condition evaluates to TRUE and else-block is executed if condition is evaluated to FALSE.

```
if (condition) 
{
    //Set of statements : These are executed when condition is TRUE
}
else
{
    //Set of statements : These are executed when condition is FALSE
}
```
### c)  if-else-if Statement
if-else-if statement is used when more than one conditions are to be evaluated. If a particular condition evaluates to TRUE, block associated with that condition will be executed. If all the conditions are evaluated to FALSE, else-block will be executed at the end.
```
if (condition_1) 
{
    //Set of statements : These are executed if condition_1 is TRUE
} 
else if (condition_2) 
{
    //Set of statements : These are executed if condition_2 is TRUE
}
else
{
    //Set of statements : These are executed if all conditions are FALSE
}
```
## 2) Switch Statement

if statements evaluate only boolean expressions whose possible outcomes are either TRUE or FALSE. switch statement can be used to evaluate expressions who have multiple outcomes and of different types like char, byte, short, int, enum types, string literals and some wrapper classes (Character, Byte, Short and Integer).

switch statement is used when you have multiple outcomes of an expression. The result of an expression is matched with case label and statements associated with that matching case label are executed. Thus, switch statement will have multiple possible execution paths depending upon supplied key or the outcome of an expression.

```
switch (key) 
{
    case value_1 : Statement_1;
                   break;
             
    case value_2 : Statement_2;
                   break;
                 .
                 .
                 .
                 .
    default :      Default_Statement;
                   break;
};
```
