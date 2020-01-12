import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CopyArrTopDown {
    @Test
    public void copyArrNULL() {
        try{
            assertEquals("should be null",null,ProgramStub13.copyArr(null));
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
    @Test
    public void copyArrEMPTY() {
        int[] arr = {};
        assertEquals("should be empty array",arr.length,ProgramStub13.copyArr(arr).length);
    }
    @Test
    public void copyArrWorks() {
        try {
            int[] arr = {10, 222, 30};
            int[] ans = ProgramStub13.copyArr(arr);
            for (int i = 0 ; i < ans.length; i++){
                if(arr[i] != ans[i]){
                    fail("the arrays are not equal");
                }
            }
        }catch (Exception e){
            fail("no exception should be thrown");
        }
    }


}
class ProgramStub13 extends Program{

    public static int[] copyArr(int[] arr) {
        if (arr == null) return null;
        int[] res = new int[size(arr)];
        for(int i=0; i<size(arr); i++)
            res[i] = arr[0];
        return res;
    }

    public static int size(int[] arr) {
        if(arr == null)
            return -1;
        return arr.length;
    }


}