import java.nio.file.NotDirectoryException;

/**
 * Class: BinaryTree
 *
 * @author Chester Waye
 * @version 1.0 Course : ITEC 3150, Spring, 2021 Written: 4/7/2021
 * <p>
 * <p>
 * This class � Describes what the class does
 * <p>
 * Purpose: � Describe the purpose of this class.
 */
public class BinaryTree {
    //Root of Binary Tree
    Node root;

    //Constructors
    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    /* Given a binary tree, print its nodes according to the
     "bottom-up" postorder traversal. */

    void printPostOrder(Node node) {
        if (node == null) {
            return;
        }

        //First recur on left subtree
        printPostOrder(node.left);

        //then recur on right subtree
        printPostOrder(node.right);

        //now deal with the node
        System.out.print(node.key + " ");
    }

    //Given a binary tree, print its nodes in inorder
    void printInorder(Node node) {
        if (node == null) {
            return;
        }

        //first recur on left child
        printInorder(node.left);

        //then print the data of node
        System.out.print(node.key + " ");

        //now recur on right child
        printInorder(node.right);

    }

    //Given a binary tree, print its nodes in preorder
    void printPreorder(Node node) {
        if (node == null) {
            return;
        }

        //first print data of node
        System.out.printf(node.key + " ");

        //then recur on left subtree
        printPreorder(node.left);

        //now recur on right subtree
        printPreorder(node.right);
    }

    //Wrappers over above recursive functions
    void printPostorder() {
        printPostOrder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        //create root
        tree.root = new Node(1);

         /* following is the tree after above statement

              1
            /   \
          null  null     */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

         /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */

//        tree.root.left = new Node(4);

        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}
