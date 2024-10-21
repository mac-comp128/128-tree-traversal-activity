package treePractice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class TreeTraversalTest {
    private BinaryTree<String> exampleTree;

    @BeforeEach
    void init() {
        exampleTree = 
            new BinaryTree<String>("A",
                new BinaryTree<String>("B", 
                    null, 
                    new BinaryTree<String>("D", 
                        null, 
                        null)),
                new BinaryTree<String>("C", 
                    new BinaryTree<String>("E",
                        new BinaryTree<String>("G", 
                            null, 
                            null),
                        null),
                    new BinaryTree<String>("F",
                        new BinaryTree<String>("H", 
                            null, 
                            null),
                        new BinaryTree<String>("I", 
                            null, 
                            null))));
    }

    @Test
    public void testPreorderRecursiveSample() {
        assertEquals("A B D C E G F H I ", 
                     exampleTree.preOrderTraverseRecursive());
    }

    @Test
    public void testPreorderIterativeSample() {
        assertEquals("A B D C E G F H I ", 
                     exampleTree.preOrderTraverseIterative());
    }

    @Test
    public void testConstructFromTraversal() {
        String inorder = "O A F Z Q N L T M E ";
        String preorder = "Q Z A O F L N M T E ";
        BinaryTree<String> testTree = BinaryTree.constructFromTraversal(preorder, inorder);
        assertEquals(inorder, testTree.inOrderTraverseRecursive());
        assertEquals(preorder, testTree.preOrderTraverseRecursive());

    }
}
