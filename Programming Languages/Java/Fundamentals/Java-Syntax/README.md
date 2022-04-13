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