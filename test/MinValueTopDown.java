import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueTopDown {
    @Test
    public void minValueNULL() {
        try{
            ProgramStub8.minValue(null);
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
    @Test
    public void minValueWorks() {
        try {
            int[] arr = {10, 222, 30};
            assertEquals("should return 10", 10, ProgramStub8.minValue(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

}




class ProgramStub8 extends Program{

    // Returns the minimum value in the array
    public static int minValue(int[] arr) {
        int ind = maxValueIndex(arr);
        return arr[ind];
    }

    public static int maxValueIndex(int[] arr) {
        if (arr==null || arr.length == 0) return -1;
        int ans = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++){
            if(arr[i] > max ){
                ans = i;
                max = arr[i];
            }
        }
        return ans;

    }




}
