/**

What is a stack?
A stack is a representation of nodes. There are two components to each node: data and next (storing address of next node). 
Each node’s data portion contains the assigned value, and its next pointer directs the user to the node that has the stack’s subsequent item.
The highest node in the stack is referred to as the top. 

Features of Stack
Linear Data Structures using Java
Follows LIFO: Last In First Out
Only the top elements are available to be accessed
Insertion and deletion takes place from the top
Eg: a stack of plates, chairs, etc

4 major operations:
push(ele) – used to insert element at top
pop() – removes the top element from stack
isEmpty() – returns true is stack is empty
peek() – to get the top element of the stack

All operation works in constant time i.e, O(1)

Stack Advantages
Maintains data in a LIFO manner
The last element is readily available for use
All operations are of O(1) complexity
Stack Disadvantages
Manipulation is restricted to the top of the stack
Not much flexible

Stack Applications
Recursion
Parsing
Browser
Editors

*/


import java.util.*;

class Stack {
    int[] a;
    int top;
    Stack() {
        a=new int[100];
        top=-1;
    }

    void push(int x) {
        if(top==a.length-1)
            System.out.println("overflow");
        else
            a[++top]=x;
    }

    int pop() {
        if(top==-1)
        {System.out.println("underflow");
            return -1;
        }
        else
            return(a[top--]);
    }

    void display() {
        for(int i=0;i<=top;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    boolean isEmpty() {
        if(top==-1)
            return true;
        else
            return false;
    }

    int peek() {
        if(top==-1)
            return -1;
        return (a[top]);
    }


}

public class StackDemo {
    public static void main(String args[]) {

        Stack s=new Stack();
        Scanner in= new Scanner(System.in);

        do {
            System.out.println("\n******** MENU *******");
            System.out.println("\n1.PUSH");
            System.out.println("\n2.POP");
            System.out.println("\n3.PEEK");
            System.out.println("\n4 IS EMPTY");
            System.out.println("\n5.EXIT");
            System.out.println("\n enter ur choice : ");
            switch(in.nextInt()) {
                case 1:
                    System.out.println("\nenter the value ");
                    s.push(in.nextInt());
                    break;
                case 2:
                    System.out.println("\n popped element : "+ s.pop());
                    break;

                case 3:
                    System.out.println("\n top element : "+ s.peek());
                    break;
                case 4: System.out.println("\n is empty : "+ s.isEmpty());
                    break;
                case 5: System.exit(0);
                    break;
                default: System.out.println("\n Wrong Choice!");
                    break;
            }
            System.out.println("\n do u want to cont... ");
        }
        while(in.nextInt()==1);

    }
}
