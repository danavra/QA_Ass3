import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MaxValueIndexTopDown {

    @Test
    public void maxValueIndexNULL() {
        try{
            assertEquals("should be -1", ProgramStub11.maxValueIndex(null),-1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void maxValueIndexEmpty() {
        try{
            int[] arr = {};
            assertEquals("should be -1", ProgramStub11.maxValueIndex(arr),-1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void maxValueIndexWorks() {
        int[] arr = {10,222,30};
        assertEquals("should return 1",1,ProgramStub11.maxValueIndex(arr));
    }
}



class ProgramStub11 extends Program{

    public static int maxValueIndex(int[] arr) {
        if (size(arr)<1) return -1;
        int res = arr[0];
        for (int val: arr)
            if (val>res) res = val;
        return res;
    }

    public static int size(int[] arr) {
        if(arr == null)
            return -1;
        return arr.length;
    }


}
