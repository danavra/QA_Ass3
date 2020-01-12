import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MergeBottomUp {
    @Test
    public void mergeNULL_NULL() {
        try{
            int[] arr1 = null;
            int[] arr2 = null;
            Program.merge(arr1,arr2);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeNULL_EMPTY() {
        try{
            int[] arr1 = {};
            int[] arr2 = null;
            Program.merge(arr1,arr2);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeNULL_GOOD() {
        try{
            int[] arr1 = {4,6,2};
            int[] arr2 = null;
            int[] ans = Program.merge(arr1,arr2);
            assertTrue("should be [2,4,6]",ans.length == 3 && ans[0] == 2 && ans[1] == 4 && ans[2] == 6);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeGOOD_GOOD() {
        try{
            int[] arr1 = {4,6,2};
            int[] arr2 = {30,1,4};
            int[] ans = Program.merge(arr1,arr2);
            assertTrue("should be [1,2,4,4,6,30]",ans.length == 6 && ans[0] == 1 && ans[1] == 2 && ans[2] == 4 && ans[3] == 4 && ans[4] == 6 && ans[5] == 30);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeALLREADYSORTED() {
        try{
            int[] arr1 = {3,6,9};
            int[] arr2 = {10,15};
            int[] ans = Program.merge(arr1,arr2);
            assertTrue("should be [3,6,9,10,15]",ans.length == 5 && ans[0] == 3 && ans[1] == 6 && ans[2] == 9 && ans[3] == 10 && ans[4] == 15);
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
}
