import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class myBinarySearchTreeNodeTest {
    @Test
    public void test0(){ //I chose this test case as just a basic test to see if my size would work
                            //it is essential because it shows the average case
        int[] testA = {4,3,5};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(testA);
        assertEquals(3,test.size()); //passed
    }

    @Test
    public void test1(){ //chose this test to show what my code would do when faced with a duplicate
                            //it is essential because it shows an edge case in the duplicate
        int[] testB = {1};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(testB);
        test.insert(1); //passed because my message printed out
    }

    @Test
    public void test2(){ //chose this test to test an edge case of when the tree only has leaves on one side
                        //essential because it test all of the aspects of height
        int[] testC = {1,2,3,4,5,6,7,8,9};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(testC);
        assertEquals(8, test.height()); //passed
    }

    @Test
    public void test3(){ //chose this test to see how my code would act when there were still more leaves to be search
                            //essential because it shows my code knows where to stop and returns the right values
        int[] testD = {1,2,3,0,7,9};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(testD);
        assertEquals(1, test.depth(2)); //passed
    }

    @Test
    public void test4(){ //chose this test to see what my code would do when there was not left side of the tree
                         // and because i wanted to test my 3rd scenario
                        //essential because it shows what happens when the node is not in the tree
        int[] testE = {19,67,55,43,78,292,476,29};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(testE);
        assertEquals(-1,test.depth(4)); //passed
    }


}