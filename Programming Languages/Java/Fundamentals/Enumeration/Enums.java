/**
    Enums restrict a variable to have one of only a few predefined values. 
    Values in the Enumerated list are called Enums.
 */

class EnumsTest{
    enum Types{HALF, FULL, EMPTY}
    Types type;
}

class Enums{
    public static void main(String args[]){
        EnumsTest obj = new EnumsTest();
        obj.type = EnumsTest.Types.FULL;
        System.out.println(obj.type);
    }
    
}