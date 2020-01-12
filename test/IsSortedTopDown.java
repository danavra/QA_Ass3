import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class IsSortedTopDown {
    @Test
    public void isSortedNULL() {
        try{
            ProgramStub2.isSorted(null);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void isSortedEMPTY() {
        try{
            int[] arr = {};
            ProgramStub2.isSorted(arr);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void isSortedTRUE() {
        try{
            int[] arr = {7,19,34};
            assertTrue("is sorted -> should be true",ProgramStub2.isSorted(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

    @Test
    public void isSortedFALSE() {
        try{
            int[] arr = {7,37,34};
            assertFalse("is not sorted -> should be false",ProgramStub2.isSorted(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
}


class ProgramStub2 extends Program{

    // Returns true if array "arr" is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        int[] sorted = sortArray(arr);
        return equalArrays(arr, sorted);
    }


    public static int[] sortArray(int[] arr) {
        if(arr == null)
            return null;
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        return copy;
    }

    public static boolean equalArrays(int[] arr1, int[] arr2) {
        if (arr1==null && arr2 == null) return true;
        if (arr1==null || arr2 == null) return false;
        if (arr1.length!=arr2.length) return false;
        for (int i=0; i < arr1.length; i++)
            if (arr1[i]!=arr2[i])
                return false;
        return true;
    }
}