# About Java

### Java is a high level and object-oriented programming language developed by Sun MicroSystems.  

  
### Keys Notes about the Java Language.
1. <b>Object Oriented</b> - Everything is an object in Java.
1. <b>Platform Independent</b>
1. <b>Simple</b>
1. <b>Secure</b>
1. <b>Architecture Neutral</b>
1. <b>Portable</b>
1. <b>Robust</b>
1. <b>Multithreaded</b>
1. <b>High Performance</b>
1. <b>Interpreted Language</b>


### Basic Rules
1. Rules of naming convention to class and identifiers.
1. Know difference between Inheriting a class and implementing a interface.

### Variables in Java
In Java class can contain any of these variables:
1. Local Variable -> specific to a method and cannot be accessed outside the method.
1. Instance Variable -> variable outside the method but inside the class. They get intialized when the class object is initialized. Available to all the method inside the class but not outside the class.
1. Class Variable -> variable specific to the class and are declared with the "static" keyword.

### Packages in Java
- It is nothing but a way to categorize classes and Interfaces.
- If a package is present it is always the first line in the class. If import statement is present than if comes after package line and before tha class start.

### Modifiers in Java
<b>Access Control Modifiers</b>
- public -> visible to world
- protected -> visible to package and all sub classes
- private -> visible to class
- default -> visible to package no modifers needed.

<b>Non-Access Modifiers</b>
- static -> for creating class methogs and variables
- final -> finalizing the implementation of class, variable and methods
- abstract -> for creating the abstract classes and methods
- synchronized and volatile -> used for threads

### Wrapper Classes
Wrapper classes provides us the way to use primitive type (int, float, byte, long, double, short, char) as an object. All wrapper classes Integer, Float, Long, Byte, Short, Double, Character are subclasses of abstract Number class.

### Buffering and Buffering Classes
Buffering, which reads/writes a block of bytes from the external device into/from a memory buffer in a single I/O operation, is commonly applied to speed up the I/O. Default size: 8192bytes.  
  
- Buffering only provides buffering as its core functionality.
- Works with or chained with another stream.
- To chain stream together, simply pass an instance of one stream into the constructor of another stream. 
<b>BufferedInputStream in = new BufferedInputStream(new FileInputStream("my.jpg"));</b> 

### Iterator and ListIterator
Iterator enables you to cycle through a collection, obtaining or removing elements. ListIterator extends Iterator to allow bidirectional traversal of a list and the modification of elements.