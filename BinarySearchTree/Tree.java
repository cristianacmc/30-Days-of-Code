package BinarySearchTree;

/**
 * Created by Cristiana Costa
 * on 2019-08-12
 * Program to
 */

public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add (D elt);
}
