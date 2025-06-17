// Binary Tree

import java.util.Scanner;

class Node{

    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree{

    Scanner sc = new Scanner(System.in);

    Node constrNode(){

        System.out.println("Enter data for node");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        System.out.println("Do you want to enter node at left side of : "+newNode.data);
        char leftNode = sc.next().charAt(0);

        if(leftNode == 'y' || leftNode == 'Y'){
            newNode.left = constrNode();
        }

        System.out.println("Do you want to enter node at right side of : "+newNode.data);
        char rightNode = sc.next().charAt(0);

        if(rightNode == 'y' || rightNode == 'Y'){
            newNode.right = constrNode();
        }

        return newNode;
    }

    void preOrderBT(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrderBT(root.left);
        preOrderBT(root.right);
    }

    void inOrderBT(Node root){

        if(root == null){
            return;
        }

        inOrderBT(root.left);
        System.out.print(root.data+" ");
        inOrderBT(root.right);
    }

    void postOrserBT(Node root){

        if(root == null){
            return;
        }

        postOrserBT(root.left);
        postOrserBT(root.right);
        System.out.print(root.data+" ");
    }
}


class Prog89 {
    
    public static void main(String[] args) {
        
        Node root = null;

        BinaryTree bt = new BinaryTree();

        root = bt.constrNode();

        System.out.println("Pre Order Tree");
        bt.preOrderBT(root);
System.out.println();

        System.out.println("In Order Tree");
        bt.inOrderBT(root);
System.out.println();

        System.out.println("Post Order Tree");
        bt.postOrserBT(root);
        System.out.println();        
    }
}
