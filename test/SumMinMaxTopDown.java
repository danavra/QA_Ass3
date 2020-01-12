import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class SumMinMaxTopDown {

    @Test
    public void sumMinMaxNULL() {
        try{
            int ans = ProgramStub4.sumMinMax(null);
            assertNotEquals("should deel with null! not allow -1 -1 = -2", -2,ans);
        }catch (Exception e){
            fail("should not throw exception");
        }
    }
    @Test
    public void sumMinMaxEmpty() {
        try{
            int[] arr = {};
            int ans = ProgramStub4.sumMinMax(arr);
            assertNotEquals("should deal with null! not allow -1 -1 = -2", -2,ans);
        }catch (Exception e){
            fail("should not throw exception");
        }
    }

    @Test
    public void sumMinMaxworks() {
        try{
            int[] arr = {3,6,9};
            assertEquals("shpuld be 3 + 9 = 12",12,ProgramStub4.sumMinMax(arr));
        }catch (Exception e){
            fail("should not throw exception");
        }
    }
}
class ProgramStub4 extends Program{

    public static int minValue(int[] arr){
        if(arr == null || arr.length == 0)
            return -1;
        Integer[] INRTEGERArray = IntStream.of(arr).boxed().toArray(Integer[]::new);
        return  Collections.min(Arrays.asList(INRTEGERArray));
    }

    public static int maxValue(int[] arr){
        if(arr == null || arr.length == 0)
            return -1;
        Integer[] INRTEGERArray = IntStream.of(arr).boxed().toArray(Integer[]::new);
        return  Collections.max(Arrays.asList(INRTEGERArray));
    }

    public static int sumMinMax(int[] arr) {
        return minValue(arr) + maxValue(arr);
    }
}