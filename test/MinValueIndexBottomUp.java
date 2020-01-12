import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueIndexBottomUp {
    @Test
    public void minValueIndexNULL() {
        try{
            assertEquals("should be -1", Program.minValueIndex(null),-1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void minValueIndexEmpty() {
        try{
            int[] arr = {};
            assertEquals("should be -1", Program.minValueIndex(arr),-1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void minValueIndexWorks() {
        int[] arr = {10,222,30};
        assertEquals("should return 0",0,Program.minValueIndex(arr));
    }
}


