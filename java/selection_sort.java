/**
 Selection Sort
**/

public class MyClass {
    public static void main(String args[]) {
    Integer[] myIntArray = {64,25,12,22,11};

    Integer lowestVal = null;
    for ( Integer i = 0; i < myIntArray.length; i++ ) {
        
        if ( lowestVal == null ) {
            lowestVal = myIntArray[i];
        }
        
        if ( lowestVal > myIntArray[i] ) {
            lowestVal = myIntArray[i];
        }
    }
    
    System.out.println(lowestVal);
    
    }
}
