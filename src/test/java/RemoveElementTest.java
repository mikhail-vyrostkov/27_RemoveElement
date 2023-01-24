import junit.framework.TestCase;

public class RemoveElementTest extends TestCase {
    public void testProfit1(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int actual = Main.Solution.removeElement(nums, val);
        int expected = 5;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        int[] nums = {3,2,2,3};
        int val = 3;
        int actual = Main.Solution.removeElement(nums, val);
        int expected = 2;
        assertEquals(expected, actual);
    }
}
