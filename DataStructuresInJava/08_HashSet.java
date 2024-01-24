/**

Hashing

Uses special Hash function
A hash function maps an element to an address for storage
This provides constant-time access
Collision resolution techniques handle collision
Collision resolution technique
Chaining
Open Addressing

Hashing Advantages
The hash function helps in fetching elements in constant time
An efficient way to store elements

Hashing Disadvantages
Collision resolution increases complexity

Hashing Applications
Suitable for the application needs constant time fetching

*/

import java.util.*;

class HashSetDemo {

    static boolean isUnique(String s) {
        HashSet<Character> set =new HashSet<Character>();

        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c==' ')
                continue;
            if(set.add(c)==false)
                return false;

        }

        return true;
    }


    public static void main(String[] args) {
        String s="abcd qwer ";
        boolean ans=isUnique(s);
        if(ans)
            System.out.println("string has unique characters");
        else
            System.out.println("string does not have unique characters");

    }

  /**

  This Java code defines a class HashSetDemo that contains a method isUnique to determine 
  whether a given string has unique characters (excluding spaces). 
  The code utilizes a HashSet to efficiently check for uniqueness.

  isUnique Method:

  The isUnique method takes a string s as input and returns a boolean indicating whether the string has unique characters (excluding spaces).
  It iterates through each character in the string, skipping spaces.
  For each character, it checks whether it can be added to the HashSet using set.add(c). 
  If add returns false, it means the character is already in the set, and the method returns false (indicating non-uniqueness).
  
  */
}
