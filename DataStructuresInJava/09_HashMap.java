/**
This Java code defines a class HashMapDemo with a method check 
that takes a string as input and counts the occurrences of each character in the string using a HashMap. 
The HashMap is then iterated to print the count of each character.
*/

import java.util.*;

class HashMapDemo {

    static void check(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
      
        // Iterate through each character in the string
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
          
            // Update the count in the HashMap
            if(!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }

        // Iterate through the HashMap and print character counts
        Iterator<Character> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            Object x=itr.next();
            System.out.println("count of "+x+" : "+map.get(x));
        }
    }

    public static void main(String[] args) {
        String s="hello";
        check(s);
    }
}

/**
check Method:

The check method takes a string s as input.
It iterates through each character in the string.
For each character, it checks whether the character is already in the HashMap. 
If not, it adds the character with a count of 1; if yes, it increments the count.

Iteration through HashMap:

After counting the occurrences, the method uses an Iterator to iterate through the keys of the HashMap.
For each key (character), it retrieves the count from the HashMap using map.get(x) and prints the result.

*/
