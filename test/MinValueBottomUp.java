import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MinValueBottomUp {
    @Test
    public void minValueNULL() {
        try{
            Program.minValue(null);
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
    @Test
    public void minValueWorks() {
        try {
            int[] arr = {10, 222, 30};
            assertEquals("should return 10", 10, Program.minValue(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

}