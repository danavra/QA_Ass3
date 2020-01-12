import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueIndexTopDown {
    @Test
    public void minValueIndexNULL() {
        try{
            assertEquals("should be -1", ProgramStub12.minValueIndex(null),-1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void minValueIndexEmpty() {
        try{
            int[] arr = {};
            assertEquals("should be -1", ProgramStub12.minValueIndex(arr),-1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void minValueIndexWorks() {
        int[] arr = {10,222,30};
        assertEquals("should return 0",0,ProgramStub12.minValueIndex(arr));
    }
}

class ProgramStub12 extends Program{

    public static int minValueIndex(int[] arr) {
        if (arr==null) return -1;
        int res = arr[0];
        for (int val: arr)
            if (val<res) res = val;
        return res;
    }

    public static int size(int[] arr) {
        if(arr == null)
            return -1;
        return arr.length;
    }


}
