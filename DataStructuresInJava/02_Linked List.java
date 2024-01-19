/**

Linked List

What is Linked List?
Linked list data structure helps the required objects to be arranged in a linear order.

Linked List Advantages
Dynamic in size
No wastage as capacity and size is always equal
Easy insertion and deletion as 1 link manipulation is required
Efficient memory allocation

Linked List Disadvantages
If head Node is lost, the linked list is lost
No random access is possible

Linked List Applications
Suitable where memory is limited 
Suitable for applications that require frequent insertion and deletion


*/

import java.util.*;

class LLNode{

	int data;
	LLNode next;
	
	LLNode(int data)
	{
		this.data=data;
		this.next=null;
		
	}
}

/**

Class Definition:
class LLNode { ... }: This declares a class named LLNode.

Instance Variables:

int data;: This variable holds the data of the node, typically an integer in this case.
LLNode next;: This variable references the next node in the linked list.
It's of the same type as the current class, allowing it to form a chain of linked nodes.

Constructor:
LLNode(int data) { ... }: This is a constructor method for the LLNode class. 
It initializes a new instance of the class with the given data value.

this.data = data;: Sets the value of the data variable for the current node to the provided data.

this.next = null;: Initializes the next variable to null because, 
initially, this node does not point to any other node in the linked list.

In summary, this class represents a node in a singly linked list, 
where each node contains an integer value (data) and a reference to the next node in the list (next). 
The constructor is responsible for initializing a new node with the provided data and a null reference to the next node. 
This structure allows you to create linked lists by connecting multiple LLNode instances.

*/

class LinkedListDemo{
	
	LLNode head;
	
	
	LLNode insertInBeg(int key,LLNode head)
	{
		LLNode ttmp=new LLNode(key);
		
		if(head==null)
			head=ttmp;
		
		else
			{
				ttmp.next=head;
				head=ttmp;
			}
		return head;
	}
	
	
	LLNode insertInEnd(int key,LLNode head)
	{
		LLNode ttmp=new LLNode(key);
		LLNode ttmp1=head;
		
		if(ttmp1==null)
			head=ttmp;
		else
		{
			while(ttmp1.next!=null)
					ttmp1=ttmp1.next;
			ttmp1.next=ttmp;
			
		}
		
		return head;
			
	}


	LLNode insertAtPos(int key,int pos,LLNode head)
	{
		LLNode ttmp=new LLNode(key);
		
		if(pos==1)
		{
			ttmp.next=head;
			head=ttmp;
		}
		else
		{
			LLNode ttmp1=head;
			for(int i=1;ttmp1!=null && i<pos;i++)
				ttmp1=ttmp1.next;
			ttmp.next=ttmp1.next;
			ttmp1.next=ttmp;
		}
		
		return head;
	}
	
	
	LLNode delete(int pos,LLNode head)
	{
		LLNode ttmp=head;
		if(pos==1)
			head=ttmp.next;
		else
		{
			for(int i=1;ttmp!=null && i<pos-1;i++)
				ttmp=ttmp.next;
			ttmp.next=ttmp.next.next;
		}
		return head;
	}
	
	int length(LLNode head)
	{
		LLNode ttmp=head;
		int c=0;
		if(ttmp==null)
			return 0;
		else
		{
		 while(ttmp!=null)
			{	ttmp=ttmp.next;
				c++;
			}
		}
		return c;
	}
	
	
	LLNode reverse(LLNode head)
	{
		LLNode prevLNode=null,curLNode=head,nextLNode=null;
		while(curLNode!=null)
		{
			nextLNode=curLNode.next;
			curLNode.next=prevLNode;
			
			prevLNode=curLNode;
			curLNode=nextLNode;
		}
		
		head=prevLNode;
		return head;
	}
	
	
	void display(LLNode head)
	{
		LLNode ttmp=head;
		while(ttmp!=null)
			{System.out.print(ttmp.data+" ");
			 ttmp=ttmp.next;
			}
	}
	
	public static void main(String[] args)
	{
		LinkedListDemo l=new LinkedListDemo();
		l.head=null;
		Scanner in=new Scanner(System.in);
		 do
	{
 System.out.println("\n********* MENU *********");
	 System.out.println("\n1.Insert In End");
	 System.out.println("\n2.Insert In Beg");
	 System.out.println("\n3.Insert At A  Particular Pos");
	 System.out.println("\n4.Delete At a Pos");
	 System.out.println("\n5.Length");
	 System.out.println("\n6.Reverse");
	 System.out.println("\n7.Display");
	 System.out.println("\n8.EXIT");
	 System.out.println("\nenter ur choice : ");
	 int n=in.nextInt();
	 switch(n)
		{case 1: System.out.println("\nenter the value ");
			  l.head=l.insertInEnd(in.nextInt(),l.head);
			 break;
		 case 2: System.out.println("\nenter the value");
			 l.head=l.insertInBeg(in.nextInt(),l.head);
			 break;
		 case 3: System.out.println("\nenter the value");
			 l.head=l.insertAtPos(in.nextInt(),in.nextInt(),l.head);
			 break;
		 case 4: 
			 l.head=l.delete(in.nextInt(),l.head);
			 break;
		 case 5: 
			System.out.println(l.length(l.head));
			 break;
		 case 6: 
			 l.head=l.reverse(l.head);
			 break;
		 case 7: 
			l.display(l.head);
		 		 break;
		 case 8: System.exit(0);
		 		 break;
		 default: System.out.println("\n Wrong Choice!");
		 		  break;
		}
	 System.out.println("\n do u want to cont... ");
	}while(in.nextInt()==1);

 }
}
