import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String s = "ABAB";
        int k = 2;
        int expected = 4;
        int actual = new Solution().characterReplacement(s, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        String s = "AABABBA";
        int k = 1;
        int expected = 4;
        int actual = new Solution().characterReplacement(s, k);

        Assert.assertEquals(expected, actual);
    }
}
