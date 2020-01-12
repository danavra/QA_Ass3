import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MaxValueTopDown {
    @Test
    public void maxValueNULL() {
        try{
            ProgramStub9.maxValue(null);
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
    @Test
    public void maxValueWorks() {
        try {
            int[] arr = {10, 222, 30};
            assertEquals("should return 222", 222, ProgramStub9.maxValue(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
}


class ProgramStub9 extends Program {

    // Returns the maximum value in the array
    public static int maxValue(int[] arr) {
        int ind = maxValueIndex(arr);
        return arr[ind];
    }

    public static int maxValueIndex(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int ans = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                ans = i;
                max = arr[i];
            }
        }
        return ans;

    }
}
