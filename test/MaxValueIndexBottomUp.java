import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MaxValueIndexBottomUp {

    @Test
    public void maxValueIndexNULL() {
        try{
            assertEquals("should be -1", Program.maxValueIndex(null),-1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void maxValueIndexEmpty() {
        try{
            int[] arr = {};
            assertEquals("should be -1", Program.maxValueIndex(arr),-1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void maxValueIndexWorks() {
        int[] arr = {10,222,30};
        assertEquals("should return 1",1,Program.maxValueIndex(arr));
    }
}
