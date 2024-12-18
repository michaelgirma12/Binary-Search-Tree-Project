package binarySearchTree;

import student.TestCase;
/**
 * 
 * @author michael girma (gmichael22)
 * @version 2023.04.29
 */
public class BinarySearchTreeTest extends TestCase {
    public Lab14BinarySearchTree<String> bst; 
   
    /**
     * set up for this test class 
     */
    public  void setUp()
    {
        bst = new Lab14BinarySearchTree<>();
    }
    /**
     * testing insert 
     */
    public void testInsert()
    {
        bst.insert("apple");
        bst.insert("banana");
        bst.insert("cherry");
        bst.insert("date");

        assertEquals("apple, banana, cherr, date", bst.toString().trim());
    }
    /**
     * testing remove 
     */
    public void testRemove()
    {
        
    }
    /**
     * testing find min
     */
    public void testFindMin()
    {
        
    }
    /**
     * testing find max 
     */
    public void testFindMax()
    {
        
    }
    /**
     * testing find 
     */
    public void testFind()
    {
        
    }
    /**
     * testing make empty 
     */
    public void testMakeEmpty()
    {
        
    }
    /**
     * testing is empty 
     */
    public void testIsEmpty()
    {
        
    }
}
