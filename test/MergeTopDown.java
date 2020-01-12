import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MergeTopDown {
    @Test
    public void mergeNULL_NULL() {
        try{
            int[] arr1 = null;
            int[] arr2 = null;
            ProgramStub3.merge(arr1,arr2);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeNULL_EMPTY() {
        try{
            int[] arr1 = {};
            int[] arr2 = null;
            ProgramStub3.merge(arr1,arr2);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeNULL_GOOD() {
        try{
            int[] arr1 = {4,6,2};
            int[] arr2 = null;
            int[] ans = ProgramStub3.merge(arr1,arr2);
            ProgramStub3.printArr(ans);
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
            int[] ans = ProgramStub3.merge(arr1,arr2);
            ProgramStub3.printArr(ans);
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
            int[] ans = ProgramStub3.merge(arr1,arr2);
            ProgramStub3.printArr(ans);
            assertTrue("should be [3,6,9,10,15]",ans.length == 5 && ans[0] == 3 && ans[1] == 6 && ans[2] == 9 && ans[3] == 10 && ans[4] == 15);
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
}

class ProgramStub3 extends Program{


    public static int[] sortArray(int[] arr) {
        if(arr == null)
            return null;
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        return copy;
    }


    public static int[] merge(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return sortArray(ar2);
        if (ar2==null) return sortArray(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return sortArray(res);
    }
}