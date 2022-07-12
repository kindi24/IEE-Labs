
package gentest;

public class GenericMethodTest
{
   // generic method printArray                         
   public static < E > void printArray( E[] inputArray )
   {
      // Display array elements              
         for ( E element : inputArray ){                    
            if (element instanceof Foititis) {
                Foititis temp = (Foititis)element;
                System.out.println(temp);
            }
            else 
                System.out.printf( "%s ", element );
         }
         System.out.println();
    }

    public static void main( String args[] )
    {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        Foititis foit [] = { new Foititis("ΓΕΩΡΓΙΟΥ", 511020), new Foititis("ΔΗΜΗΤΡΙΟΥ", 170012) };

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // pass a Character array
        
        System.out.println( "\nArray Foitites contains:" );
        printArray( foit ); // pass a Character array
    } 
}
