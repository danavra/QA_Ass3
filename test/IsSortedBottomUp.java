import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class IsSortedBottomUp {
    @Test
    public void isSortedNULL() {
        try{
            Program.isSorted(null);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void isSortedEMPTY() {
        try{
            int[] arr = {};
            Program.isSorted(arr);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void isSortedTRUE() {
        try{
            int[] arr = {7,19,34};
            assertTrue("is sorted -> should be true",Program.isSorted(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void isSortedFALSE() {
        try{
            int[] arr = {7,37,34};
            assertFalse("is not sorted -> should be false",Program.isSorted(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
}