 ## Inheritance
 - In Java extends keyword is used to inherit propterties from a class.
 - A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass. Private properties are not inherited.
 - super keyword.
    - differentiate the members of the superclass from the member of the subclass, if they have same names.
    - used to invoke superclass constructor from the sub class.

## Polymorphism
Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.

It is important to know that the only possible way to access an object is through a reference variable. A reference variable can be of only one type. Once declared, the type of a reference variable cannot be changed.

## Abstraction
In Java abstraction is achieved Abstract classes and interface.
abstract keyword is used to make abstract classes and interfaces.
- We cannot instantiate a abstract class.
- Abstract classes may or may not contain abstract methods.
- if a class has at least one abstract method, then the class must be declared abstract
- To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
- If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.

## Encapsulation
To achieve encapsulation in Java:
- Declare the variables of a class as private.
- Provide public setter and getter methods to modify and view the variables values.