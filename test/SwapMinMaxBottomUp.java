import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class SwapMinMaxBottomUp {

    @Test
    public void swapMinMaxNULL() {
        try{
            assertEquals("should be null",null,Program.swapMinMax(null));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void swapMinMaxEMPTY() {
        try{
            int[] arr = {};
            assertNull("should be empty",Program.swapMinMax(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
    @Test
    public void swapMinMaxWORKS() {
        try{
            int[] arr = {1,2,6};
            int[] ans = Program.swapMinMax(arr);

            assertTrue("should be [6,2,1]",ans[0] == 6 && ans[1] == 2 && ans[2] == 1);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
}