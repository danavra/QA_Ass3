import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class SwapMinMaxTopDown {

    @Test
    public void swapMinMaxNULL() {
        try{
            assertEquals("should be null",null,ProgramStub5.swapMinMax(null));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void swapMinMaxEMPTY() {
        try{
            int[] arr = {};
            assertNull("should be empty",ProgramStub5.swapMinMax(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
    @Test
    public void swapMinMaxWORKS() {
        try{
            int[] arr = {1,2,6};
            int[] ans = ProgramStub5.swapMinMax(arr);

            assertTrue("should be [6,2,1]",ans[0] == 6 && ans[1] == 2 && ans[2] == 1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
}



class ProgramStub5 extends Program{

    public static int[] swapMinMax(int[] arr) {
        int[] res = copyArr(arr);
        int minInd = minValueIndex(arr);
        int maxInd = maxValue(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    // Returns copy of the array "arr"
    public static int[] copyArr(int[] arr) {
        if (arr == null || arr.length ==0) return null;
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        return  copy;
    }

    public static int minValueIndex(int[] arr) {
        if (arr==null || arr.length == 0) return -1;
        int ans = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++){
            if(arr[i] < min ){
                ans = i;
                min = arr[i];
            }
        }
        return ans;
    }



    public static int maxValue(int[] arr){
        if(arr == null || arr.length == 0)
            return -1;
        Integer[] INRTEGERArray = IntStream.of(arr).boxed().toArray(Integer[]::new);
        return  Collections.max(Arrays.asList(INRTEGERArray));
    }



}