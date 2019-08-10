package Binary;

/**
 * Created by Cristiana Costa
 * on 2019-08-09
 * Program to create the binary tree
 */

public class BinaryTree {
    Node root;

    //methods
    public void addNode(int customKey, String customName){
        //create a new node and initialize it
        Node newNode = new Node(customKey, customName);

        // if there is no root this becomes root
        if(root == null){
            root= newNode;
        } else {
            //set root as the Node we will start
            Node focusNode = root;
            //future parent for our new Node
            Node parent;

            while (true){

                //root is the top parent so we start there
                //with as we traverse the tree
                parent = focusNode;

                // check if the new node should go on the left side of the parent node
                if(customKey < focusNode.key){

                    //switch focus to the left child
                    focusNode = focusNode.leftChild;

                    //if the left child has no children
                    if(focusNode == null){

                        //then place the new node on the left of it
                        parent.leftChild = newNode;
                        return; //all done
                    }
                } else { // put the node on the right
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){

                        //then place the new node on the right of it
                        parent.rightChild = newNode;
                        return; //all Done
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree (Node focusNode){
        if(focusNode != null){

            //traverse the left node
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preOrderTraverseTree (Node focusNode){
        if(focusNode != null){

            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree (Node focusNode){
        if(focusNode != null){

            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);

            System.out.println(focusNode);
        }
    }

    public Node findNode(int key){

        Node focusNode = root;

        while(focusNode.key != key) {

            if (key < focusNode.key) {

                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
        }

        if(focusNode == null){
            return null;
        }

        return focusNode;

    }

    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice Pres");
        theTree.addNode(15, "Office Manager");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Sales manager");
        theTree.addNode(85, "Salesman1");

        theTree.inOrderTraverseTree(theTree.root);

        System.out.println("\nNode with the key 75");


        System.out.println(theTree.findNode(85));


    } //main

} //class


