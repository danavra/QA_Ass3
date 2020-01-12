import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class SumMinMaxBottomUp {

    @Test
    public void sumMinMaxNULL() {
        try{
            int ans = Program.sumMinMax(null);
            assertNotEquals("should deel with null! not allow -1 -1 = -2", -2,ans);
        }catch (Exception e){
            fail("should not throw exception");
        }
    }
    @Test
    public void sumMinMaxEmpty() {
        try{
            int[] arr = {};
            int ans = Program.sumMinMax(arr);
            assertNotEquals("should deal with null! not allow -1 -1 = -2", -2,ans);
        }catch (Exception e){
            fail("should not throw exception");
        }
    }

    @Test
    public void sumMinMaxworks() {
        try{
            int[] arr = {3,6,9};
            assertEquals("shpuld be 3 + 9 = 12",12,Program.sumMinMax(arr));
        }catch (Exception e){
            fail("should not throw exception");
        }
    }
}