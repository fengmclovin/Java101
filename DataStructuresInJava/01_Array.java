/**

Array
What is an Array?
An array is the simplest data structure where a collection of similar data elements takes place and each data element can be accessed directly by only using its index number.

Array Advantages:
Random access
Easy sorting and iteration
Replacement of multiple variables

Array Disadvantages:
Size is fixed
Difficult to insert and delete
If capacity is more and occupancy less, most of the array gets wasted 
Needs contiguous memory to get allocated

Array Applications:
For storing information in a linear fashion
Suitable for applications that require frequent searching

*/

import java.util.*;

class ArrayDemo {
    public static void main (String[] args) {
        int[] priceOfCar= new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<priceOfCar.length;i++)
            priceOfCar[i]=in.nextInt();

        for(int i=0;i<priceOfCar.length;i++)
            System.out.print(priceOfCar[i]+" ");

        in.close();
    }
}

/**

In this program:

I declare an array priceOfCar of size 5 to store the prices of cars.
I create a Scanner object (in) to read input from the console.
We use a for loop to iterate through each element of the array and read an integer into it using in.nextInt().
Another for loop is used to print the values of the array to the console.

*/
