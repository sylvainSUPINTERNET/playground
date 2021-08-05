public class MyClass {
    public static void main(String args[]) {
    int[] myIntArray = {140, 2, 13, 67};

    for ( int i = 0; i < myIntArray.length; i++ ) {
        
        if ( i+1 <= myIntArray.length ) {
            // do nothing
        } else {
            int a = myIntArray[i];
            int b = myIntArray[i+1];
            if ( a > b ) {
                myIntArray[i] = b;
                myIntArray[i+1] = a;
            }
        }
    }
    
    // log
    // for ( int x = 0; x < myIntArray.length; x++ ) {
    //     System.out.println(myIntArray[x]);
    // }
    
    }
}
