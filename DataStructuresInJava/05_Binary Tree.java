/**

Binary Tree
In a binary tree, the branches of the tree are made up of up to two child nodes for each node. 
The left and right nodes are the common names for the two youngsters. 
Child nodes make references to their parents, whereas parent nodes are nodes with children.

Features of Binary Tree
Hierarchical  Data Structure
The topmost element is known as the root of the tree
Every Node can have at most 2 children in the binary tree
Can access elements randomly using index
Eg: File system hierarchy

Common traversal methods:
preorder(root) : print-left-right
postorder(root) : left-right-print 
inorder(root) : left-print-right

Binary Tree Advantages
Can represent data with some relationship
Insertion and search are much more efficient

Binary Tree Disadvantages
Sorting is difficult
Not much flexible

Binary Tree Applications
File system hierarchy
Multiple variations of the binary tree have a wide variety of applications


*/

class TLNode {
    int data;
    TLNode left,right;

    TLNode(int d) {
        data=d;
    }
}


public class BinaryTreeDemo {
    static void preorder(TLNode r) {
        if(r==null)
            return;

        System.out.print(r.data+" ");

        preorder(r.left);
        preorder(r.right);

    }
    static void inorder(TLNode r) {
        if(r==null)
            return;

        inorder(r.left);
        System.out.print(r.data+" ");
        inorder(r.right);

    }
    static void postorder(TLNode r) {
        if(r==null)
            return;


        postorder(r.left);
        postorder(r.right);
        System.out.print(r.data+" ");

    }

    public static void main(String[] args) {

        TLNode root=new TLNode(1);

        root.left=new TLNode(2);
        root.right=new TLNode(3);

        root.left.left=new TLNode(4);
        root.left.right=new TLNode(5);

        root.right.left=new TLNode(6);
        root.right.right=new TLNode(7);
        preorder(root);
        System.out.println();

        inorder(root);
        System.out.println();

        postorder(root);
        System.out.println();


    }
}

/**
TLNode class:

It represents a node in a binary tree.
It has three fields: data to store the node's data, left for the left child, and right for the right child.
It has a constructor TLNode(int d) to initialize the node with the given data.

BinaryTreeDemo class:
It contains three static methods for tree traversal: preorder, inorder, and postorder.

preorder(TLNode r): Performs a preorder traversal starting from the given node r. 
In preorder traversal, the root is visited first, then the left subtree is traversed, followed by the right subtree.

inorder(TLNode r): Performs an inorder traversal starting from the given node r. 
In inorder traversal, the left subtree is traversed first, then the root is visited, and finally, the right subtree is traversed.

postorder(TLNode r): Performs a postorder traversal starting from the given node r. 
In postorder traversal, the left subtree is traversed first, followed by the right subtree, and finally, the root is visited.
main method:

It creates a binary tree with the following structure:
markdown
    1
   / \
  2   3
 / \ / \
4  5 6  7
It then calls the three traversal methods on the root of the tree and prints the results.

Preorder: 1 2 4 5 3 6 7 
Inorder: 4 2 5 1 6 3 7 
Postorder: 4 5 2 6 7 3 1 

*/




