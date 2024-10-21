package treePractice;

import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayDeque;

/**
 * Class for a binary tree that stores type E objects.
 *
 * @author Adapted from Koffman and Wolfgang
 * @author Modified by Suhas Arehalli FA24
 **/
public class BinaryTree<E> {

    /**
     * Class to encapsulate a tree node.
     */
    protected static class Node<E> {
        // Data Fields

        /**
         * The information stored in this node.
         */
        public E data;
        /**
         * Reference to the left child.
         */
        public Node<E> left;
        /**
         * Reference to the right child.
         */
        public Node<E> right;

        /**
         * Reference to the parent
         */
        public Node<E> parent;

        // Constructors

        /**
         * Construct a node with given data and no children.
         *
         * @param data The data to store in this node
         */
        public Node(E data) {
            this.data = data;
            left = null;
            right = null;
            parent = null;
        }

        // Methods

        /**
         * Returns a string representation of the node.
         *
         * @return A string representation of the data fields
         */
        @Override
        public String toString() {
            return data.toString();
        }
    }

    // Data Field
    /**
     * The root of the binary tree
     */
    protected Node<E> root;

    /**
     * Construct an empty BinaryTree
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Construct a BinaryTree with a specified root.
     * Should only be used by subclasses.
     *
     * @param root The node that is the root of the tree.
     */
    protected BinaryTree(Node<E> root) {
        this.root = root;
    }

    /**
     * Constructs a new binary tree with data in its root,leftTree
     * as its left subtree and rightTree as its right subtree.
     */
    public BinaryTree(E data, BinaryTree<E> leftTree,
                      BinaryTree<E> rightTree) {
        root = new Node<E>(data);
        if (leftTree != null) {
            root.left = leftTree.root;
            leftTree.root.parent = root;
        } else {
            root.left = null;
        }
        if (rightTree != null) {
            root.right = rightTree.root;
            rightTree.root.parent = root;
        } else {
            root.right = null;
        }
    }

    /**
     * Return the left subtree.
     *
     * @return The left subtree or null if either the root or
     * the left subtree is null
     */
    public BinaryTree<E> getLeftSubtree() {
        if (root != null && root.left != null) {
            return new BinaryTree<E>(root.left);
        } else {
            return null;
        }
    }

    /**
     * Return the right sub-tree
     *
     * @return the right sub-tree or
     * null if either the root or the
     * right subtree is null.
     */
    public BinaryTree<E> getRightSubtree() {
        if (root != null && root.right != null) {
            return new BinaryTree<E>(root.right);
        } else {
            return null;
        }
    }

    /**
     * Return the data field of the root
     *
     * @return the data field of the root
     * or null if the root is null
     */
    public E getData() {
        if (root != null) {
            return root.data;
        } else {
            return null;
        }
    }

    /**
     * Determine whether this tree is a leaf.
     *
     * @return true if the root has no children
     */
    public boolean isLeaf() {
        return (root == null || (root.left == null && root.right == null));
    }

    /**
     * Perform a inorder traversal using a recursive helper method.
     *
     * @return A string encoding the preorder traversal of the tree
     */
    public String inOrderTraverseRecursive() {
        StringBuilder sb = new StringBuilder();
        inOrderTraverseRecursive_helper(root, sb);
        return sb.toString();
    }
    /**
     * A recursive helper method to perform a inorder traversal.
     *
     * @param node  The local root
     * @param sb    The string buffer to save the output
     */
    public void inOrderTraverseRecursive_helper(Node<E> node,
                                                StringBuilder sb) {
        //TODO: Complete this when instructed!
    }

    /**
     * Perform a preorder traversal using a recursive helper method.
     *
     * @return A string encoding the preorder traversal of the tree
     */
    public String preOrderTraverseRecursive() {
        StringBuilder sb = new StringBuilder();
        preOrderTraverseRecursive_helper(root, sb);
        return sb.toString();
    }
    /**
     * A recursive helper method to perform a preorder traversal.
     *
     * @param node  The local root
     * @param sb    The string buffer to save the output
     */
    public void preOrderTraverseRecursive_helper(Node<E> node,
                                  StringBuilder sb) {
        //TODO: Complete This!
    }
    /**
     * Perform a preorder traversal using an iterative method.
     *
     * @return A string encoding the preorder traversal of the tree
     */
    public String preOrderTraverseIterative() {
        Deque<BinaryTree<E>> stack = new ArrayDeque<BinaryTree<E>>();
        StringBuilder sb = new StringBuilder();

        //TODO: Complete this!

        return sb.toString();
    }

    /**
     * Construct a BinaryTree from space-separated preorder and inorder traversals
     *
     * @param preorder  a space-separated string representing a preorder traversal
     * @param inorder   a space-separated string representing an inorder traversal
     * @return A BinaryTree<String> if the traversals encode valid binary tree
     */
    public static BinaryTree<String> constructFromTraversal(String preorder, String inorder) {
        assert(preorder.length() == inorder.length());
        String[] preorder_split = preorder.split(" ");
        String[] inorder_split = inorder.split(" ");
        return constructFromTraversal(preorder_split, 0, preorder_split.length,
                                      inorder_split, 0, inorder_split.length);
    }

    /**
     * Construct a BinaryTree from space-separated preorder and inorder traversals
     *
     * @param preorder  an array containing a preorder linearization of a binary tree's data
     * @param pre_left  the left index of the subarray of preorder to construct a tree from (inclusive)
     * @param pre_right the right bound of the subarray of preorder to construct a tree from (exclusive)
     * @param inorder   an array containing an inorder linearization of a binary tree's data
     * @param in_left  the left index of the subarray of preorder to construct a tree from (inclusive)
     * @param in_right the right bound of the subarray of preorder to construct a tree from (exclusive)
     * @return A BinaryTree<String> if the traversals encode valid binary tree
     */
    public static BinaryTree<String> constructFromTraversal(String[] preorder, int pre_left, int pre_right,
                                                            String[] inorder, int in_left, int in_right) {
        // TODO: Complete this when instructed

        return new BinaryTree<String>();
    }

}
