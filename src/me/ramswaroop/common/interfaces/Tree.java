package me.ramswaroop.common.interfaces;

import me.ramswaroop.common.Node;

/**
 * Created by IntelliJ IDEA.
 * User: ramswaroop
 * Date: 4/5/15
 * Time: 5:16 PM
 * To change this template go to Preferences | IDE Settings | File and Code Templates
 */
public interface Tree<E> {

    /**
     * Inserts a node to the tree.
     *
     * @param node
     */
    public void insert(Node<E> node);


    /**
     * Deletes a particular node from the tree.
     *
     * @param node
     */
    public void delete(Node<E> node);


    /**
     * Prints the pre-order traversal of the tree.
     *
     */
    public void preOrder();


    /**
     * Prints the in-order traversal of the tree.
     *
     */
    public void inOrder();


    /**
     * Prints the post-order traversal of the tree.
     *
     */
    public void postOrder();


    /**
     * Returns the number of nodes currently in the tree.
     *
     * @return
     */
    public int size();


    /**
     * Tests if this tree is empty.
     *
     * @return
     */
    public boolean isEmpty();

}
