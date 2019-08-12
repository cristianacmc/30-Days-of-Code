package BinarySearchTree;

/**
 * Created by Cristiana Costa
 * on 2019-08-12
 * Program to
 */

public class EmptyBST<D extends Comparable> implements Tree<D>{

    public EmptyBST(){

    }

    public boolean isEmpty(){
        return true;
    }

    public int cardinality(){
        return 0;
    }


    public boolean member(D elt) {
        return false;   //if there is nothing inside of the tree, it has to return false
    }

    public NonEmptyBST<D> add (D elt){
        return new NonEmptyBST<D>(elt);
    }

} //class
