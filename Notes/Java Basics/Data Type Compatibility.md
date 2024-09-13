# Data Type Compatibility

In Java, data type compatibility refers to the ability to perform operations between different data types.

## Widening Conversion

Widening conversion occurs when a smaller data type is converted to a larger data type automatically without loss of information. 

Example: 
```
int numInt = 10; 
double numDouble = numInt ; // Widening conversion from int to double
```
![alt text](image-1.png)


## Narrowing Conversion

- Narrowing conversion occurs when a larger data type is converted to a smaller data type. 
- It may result in loss of information and requires explicit casting. 

Example: 
```
double numDouble = 10.5; 
int numInt = (int) numDouble ; // Narrowing conversion from double to int
```
![alt text](image-2.png)
