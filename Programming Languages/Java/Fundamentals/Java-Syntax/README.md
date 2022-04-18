# Syntax of Java language features.

## <b>Class, Constructor, Methods, variables and class variables Syntax</b>

    class ClassName{      

        //variables can have any accesss modifiers
        pubic int num = 5;

        //class variable are made using the static keyword.
        public static final String name = "Simit";

        // constructor has the same name as class name.
        public ClassName(){
            //initialization of variables goes here. 
            //Or things to be done when an instance of the class is made.
        }

        // Methods can have any access control modifiers.
        public void xyzMethod(parameters goes here){
            //method body
        }
    }

## <b>Object creation from class</b>
In Java objects are created with the help of classes.

    class RandomClass{
        // variables goes here

        // methods goes here
    }

    //Object is created use the RandomClass blueprint.
    RandomClass obj = new RandomClass();

## <b>Enhanced for loop</b>
    for(declaration: expression){
        //statements
    }

    //ex:
    for(String name: nameArray){
        //statements
    }

## <b>Conditional Operator</b>
    //if Exp1 is true than exp2 will be processed else exp3.
    Exp1 ? exp2 : exp3;

    //ex:
    20 > 40 ? "true" : "false";
    //output: false/

## <b>switch case</b>
    switch(value){
        case value1:
            //statements
            break;
        case value2: 
            //statements
            break;
        default: 
            //when none the case specified is match.
            statements
    }
    //make sure type fo value match for both switch bracket and case values.

## <b>Chaining Streams</b>
    Ex.1:
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("my.jpg"));
    
    Ex.2:
        FileInputStream fileIn = new FileInputStream("in.dat"); 
        BufferedInputStream bufferIn = new BufferedInputStream(fileIn); 
        DataInputStream dataIn = new DataInputStream(bufferIn);

## Array
    Declare array: 
        datatype[] var;
        datatype var[];

    Creating array
        var = new datatype[size];

    datatype[] var = new datatype[size];
    datatype[] var = {value1,value2,value3...}

## Methods
    public static int methodName(parameters){

    }

    public int methodName(){

    }

## Variable Arguments
    public int max(int... numbers){

    }

    this.max(1,2,3,4,5);

## Exception Handling using try/catch
    try{
        //code that may throw error.
    }catch(ExceptionName e1){
        //code what to do if exception occurred.
    }

    Multiple Catch Block
    ----------------------------
    try{
        //code that may throw error.
    }catch(ExceptionName e1){
        //code what to do if exception occurred.
    }catch(ExceptionName e2){
        //code what to do if exception occurred.
    }catch(ExceptionName e3){
        //code what to do if exception occurred.
    }    

    Finally Block
    ------------------------------
    try {
        // Protected code
    } catch (ExceptionType1 e1) {
        // Catch block
    } catch (ExceptionType2 e2) {
        // Catch block
    } catch (ExceptionType3 e3) {
        // Catch block
    }finally {
        // The finally block always executes.
    }

## Try with Resources
    try(FileReader fr = new FileReader("file path")) {
        // use the resource
    } catch () {
      // body of catch 
    }

## Inner Classes
    Inner class
    -----------------
    class Outer_Demo{
        class Inner_Demo{

        }
    }

    Accessing the private inner class.
    --------------------------------
    It is instantiated inside a method of a outer class.
    private class Inner_class{
        public void getName(){}
    }

    public void Outer_Method(){
        Inner_class inner = new Inner_class();
        inner.getName();
    }

    Accessing the private members of the outer class using inner classes.
    -------------------------------------
    Inner class should be public.

    Outer_Demo outer = new Outer_Demo();
    Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();

    Method Local Inner class
    -----------------------
    class Outer_Demo{
        void my_method{
            class Inner_Demo{
                public void print(){}
            }
            //accessing the inner class.
            Inner_Demo inner = new Inner_Demo();
            inner.print();
        }
    }

    Anonymous Inner Class
    -----------------------------
    AnonymousInner an_inner = new AnonymousInner() {
        public void my_method() {
            ........
            ........
        }   
    };
    I.E. 

    abstract class AnonymousInner {
        public abstract void mymethod();
    }

    public class Outer_class {

        public static void main(String args[]) {
            AnonymousInner inner = new AnonymousInner() {
                public void mymethod() {
                    System.out.println("This is an example of anonymous inner class");
                }
            };
            inner.mymethod();	
        }
    }

## Inheriting a class 
    class Super{
        //stats
    }
    class Sub extends Super{
        //stats
    }

## Making interface
    See properties of interface.
    interface Animal {
        public void eat();
        public void travel();
    }
    
## Implementing a interface
    public interface Face{

    }

    class Mask implements Face{
        
    }
    