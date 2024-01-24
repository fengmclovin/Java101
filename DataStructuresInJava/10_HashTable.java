/**

This Java code demonstrates the use of the Hashtable class and its clone method to create a shallow copy of a hashtable. 

*/


import java.util.*;

class HashTableDemo {
  
    public static void main(String[] arg) {
      
        // Creating a hash table (Hashtable)
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();

        // Creating another hash table (Hashtable)
        Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

        // Adding key-value pairs to the original hash table (h)
        h.put(3, "Geeks");
        h.put(2, "forGeeks");
        h.put(1, "isBest");

        // Creating a clone (shallow copy) of the original hash table (h)
        h1 = (Hashtable<Integer, String>)h.clone();

        // Checking and printing the values in the clone (h1)
        System.out.println("Values in clone: " + h1);

        // Clearing the original hash table (h)
        h.clear();

        // Checking and printing the values in the original hash table (h)
        System.out.println("After clearing: " + h);

        // Checking and printing the values in the clone (h1)
        System.out.println("Values in clone: " + h1);
    }
}


/**

Explanation:

Hashtable Creation:
Two instances of the Hashtable class are created: h and h1.

Adding Key-Value Pairs:
Key-value pairs are added to the original hash table h using the put method.

Cloning the Hashtable:
The clone method is used to create a shallow copy of the original hash table h. The result is stored in the hash table h1.

Checking and Printing Values:
The values in the clone (h1) are printed to the console.

Clearing the Original Hashtable:
The clear method is used to remove all key-value pairs from the original hash table h.

Checking and Printing Values After Clearing:
The values in the original hash table (h) are printed again to show that it is now empty.

Checking and Printing Values in the Clone:
The values in the clone (h1) are printed again to show that it retains the original key-value pairs.

**
The clone method creates a shallow copy, meaning that the keys and values themselves are not cloned. 
Therefore, changes to the objects referred to by the keys or values in the original hashtable will be reflected in the clone and vice versa.

*/

// Second Example
import java.util.Hashtable;

public class HashtableDemo2 {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put(1, "Java");
        hashtable.put(2, "Python");
        hashtable.put(3, "C++");

        // Retrieving a value based on a key
        String language = hashtable.get(1);
        System.out.println("Language at key 1: " + language);

        // Iterating through the elements
        for (Integer key : hashtable.keySet()) {
            String value = hashtable.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}

