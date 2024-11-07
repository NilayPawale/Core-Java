# Packages in Java

- In Java, a package is a namespace used to group related classes and interfaces together. 
- Packages help in organizing code, making it modular, reusable, and easier to manage. 
- They also provide access control and help avoid name conflicts.

- Packages in java are used to organize related or similar classes, interfaces and enumerations into one group. 
- For example, java.sql package has all classes needed for database operation. java.io package has classes related to input-output operation.
- Packages are also used to avoid naming conflict between the classes. 
- Using packages, you can give same name to different classes.

## package Keyword

- Packages are declared using keyword ‘package’. 
- They should be declared in the first statement in a java file. 
- If you try to declare packages at any other statements, you will get compile time error.
```
package com;
class A
{
     //Some statements
}
//package com; If you declare here, it gives compile time error
```

- Only alphabets, numbers and an underscore are allowed in naming the packages. 
- By convention, names of package should start with lowercase although it is not a condition. 
- Package name should start with a alphabets or underscore but not with a number.
- To avoid name conflicts, Java package names often use the reverse domain name of an organization (e.g., com.companyname.project).
```
package javaConcept;      //Valid package name
package java_Concept;     //Valid package name
package java_12;          //Valid package name
package 12_java;          //Invalid package name, should not start with a number.
package _java12           //Valid package Name
package JAVA;            //Valid package name but not recommended.
```

- When you declare a package name in your java file, and after compiling it with -d option, a folder with the same name is created in the specified location and all generated .class files will be stored in that folder.
- You can give same name to more than one classes in different packages.
```
package pack1;
class A
{
     //Some statements
} 
 
package pack2;
class A
{
     //Some statements
}
```

## Types of Packages

1) Built-in Packages 

- Java provides a large number of built-in packages that are part of the Java API. 
- These include commonly used packages such as:
    - java.lang: Contains fundamental classes like String, Math, Integer, and exception handling classes.
    - java.util: Provides utility classes such as ArrayList, HashMap, Date, etc.
    - java.io: Contains classes for input-output operations (e.g., FileReader, BufferedWriter).
    - java.net: Includes classes for network operations (e.g., Socket, URL).

2) User-defined Packages

- Developers can create their own packages to logically group related classes. 
- This is particularly useful in large projects where you want to keep related code together.

## How to Create a Package

You can define a package by using the package keyword at the top of your Java file. For example:
```
package com.example.mypackage;

public class MyClass {
    public void display() {
        System.out.println("This is MyClass in com.example.mypackage");
    }
}
```
In this case, com.example.mypackage is a user-defined package. It is a hierarchical naming convention, where com is the top-level domain, followed by example, and mypackage.

## How to Use a Package

Once you create a package, you can use the classes in that package by importing them into other Java files.

1) Importing a specific class:
```
import com.example.mypackage.MyClass;

public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
```

2) Importing all classes from a package:
```
import com.example.mypackage.*;

public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
```

## Access Control and Packages

Java packages also control the accessibility of classes, interfaces, and members. Access control is defined by access modifiers:
- public: Accessible from any other class.
- protected: Accessible within the same package and by subclasses.
- Package-private (default, no modifier): Accessible only within the same package.
- private: Accessible only within the class itself.

## Benefits of Using Packages

1) Code Organization: Packages provide a structured way to organize large projects by grouping related classes.
2) Namespace Management: Packages prevent name conflicts by providing a unique namespace for classes.
3) Reusability: Once classes are grouped in packages, they can be easily reused in other projects or parts of the same project.
4) Access Control: Packages support encapsulation by restricting access to certain classes or members based on their access modifiers.

## Core Java Packages

1) java.lang:

- Contains fundamental classes such as String, Math, Integer, Thread, Exception, etc. It is automatically imported into every Java program.

2) java.util:

- Contains utility classes such as collections framework (e.g., ArrayList, HashMap, Set), Date, Calendar, and Random.

3) java.io:

- Provides classes for input and output operations such as FileReader, BufferedReader, InputStream, OutputStream, and PrintWriter.

4) java.nio:

- Contains classes for non-blocking I/O operations, which offer more scalable and efficient I/O than traditional I/O classes in java.io.

5) java.net:

- Contains classes for networking operations like creating sockets (Socket, ServerSocket), HTTP connections, and URL handling (URL, URLConnection).

6) java.math:

- Provides classes for performing large numerical computations such as BigInteger and BigDecimal.

7) java.text:

- Contains classes for text processing, formatting, and parsing such as SimpleDateFormat, NumberFormat, MessageFormat.

8) java.sql:

- Contains classes for JDBC (Java Database Connectivity), such as Connection, Statement, ResultSet, and DriverManager for working with relational databases.

9) javax.sql:

- An extension of java.sql that provides more advanced database features such as connection pooling, row sets, and distributed transactions.

10) java.security:

- Contains classes for security operations such as encryption, key generation, and digital signatures (e.g., MessageDigest, Signature, KeyStore).

11) java.time:

- Contains the new date and time API introduced in Java 8, which provides classes like LocalDate, LocalTime, ZonedDateTime, and Duration.

12) java.awt:

- Provides classes for creating Graphical User Interface (GUI) applications in Java. It includes classes like Frame, Panel, Button, and Graphics.

13) javax.swing:

- An extension of AWT, it provides a richer set of GUI components such as JButton, JFrame, JPanel, and JTable.

14) java.applet:

- Contains classes for creating applets, small applications that can run in a web browser. This package is now largely deprecated due to the decline in applet usage.

15) java.beans:

- Contains classes for developing JavaBeans components, which are reusable software components. It includes classes such as BeanInfo, PropertyDescriptor, and BeanDescriptor.

16) java.rmi:

- Provides classes and interfaces for Remote Method Invocation (RMI), which allows Java objects to communicate across a network.

17) javax.naming:

- Contains classes for directory and naming services, including InitialContext, Name, Context, used in JNDI (Java Naming and Directory Interface).

18) javax.management:

- Provides classes for managing and monitoring resources such as applications, devices, services, etc. Used primarily in JMX (Java Management Extensions).

19) javax.xml:

- Contains classes for parsing and working with XML documents, including DocumentBuilder, Transformer, SAXParser, and XPath.

20) javax.servlet:

- Provides classes for creating web applications in Java, specifically for handling HTTP requests and responses (e.g., HttpServlet, ServletRequest, ServletResponse).

21) javafx.*:

- A set of packages that provide JavaFX, a modern UI toolkit for building rich client applications. Includes javafx.application, javafx.stage, javafx.scene, etc.

22) javax.crypto:

- Provides classes and interfaces for cryptographic operations like encryption and decryption.

23) javax.annotation:

- Contains annotations that can be used to provide metadata for classes and methods (e.g., @PostConstruct, @PreDestroy).

24) javax.ejb:

- Provides classes for working with Enterprise Java Beans (EJB) for developing scalable, distributed enterprise applications.

25) javax.mail:

- Contains classes for sending and receiving email, handling MIME messages, and working with SMTP, POP3, and IMAP protocols.

26) javax.websocket:

- Contains classes for developing WebSocket-based applications, enabling two-way communication over a single, long-lived connection.

27) javax.validation:

- Provides annotations and interfaces for bean validation (e.g., @NotNull, @Size, Validator).

28) javax.persistence:

- Contains classes for object-relational mapping (ORM) using JPA (Java Persistence API). It includes EntityManager, Query, EntityTransaction.

29) javax.faces:

- Contains classes for JavaServer Faces (JSF), a Java framework for building component-based web applications.