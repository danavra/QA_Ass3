import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class MaxValueBottomUp {
    @Test
    public void maxValueNULL() {
        try{
            Program.maxValue(null);
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
    @Test
    public void maxValueWorks() {
        try {
            int[] arr = {10, 222, 30};
            assertEquals("should return 222", 222, Program.maxValue(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
}
