import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualsArrayTopDown {

    @Test
    public void equalArraysNull_Null() {
        assertTrue("should be true",ProgramStub6.equalArrays(null,null));
    }

    @Test
    public void equalArraysNull_notNull() {
        int[] arr = {10, 222, 30};
        assertFalse("should be false",ProgramStub6.equalArrays(arr,null));
    }
    @Test
    public void equalArraysEquals() {
        int[] arr1 = {10, 222, 30};
        int[] arr2 = {10, 222, 30};
        assertTrue("are equal",ProgramStub6.equalArrays(arr1,arr2));
    }
    @Test
    public void equalArraysNotEquals() {
        int[] arr1 = {10, 222, 30};
        int[] arr2 = {10, 222, 31};
        assertFalse("is not equal",ProgramStub6.equalArrays(arr1,arr2));
    }

    @Test
    public void equalArraysEmptyAndEquals() {
        int[] arr1 = {};
        int[] arr2 = {};
        assertTrue("are equal",ProgramStub6.equalArrays(arr1,arr2));
    }

}

class ProgramStub6 extends Program{

    public static int size(int[] arr) {
        if(arr == null)
            return -1;
        return arr.length;
    }

    public static boolean equalArrays(int[] arr1, int[] arr2) {
        if (arr1==null && arr2 == null) return true;
        if (arr1==null || arr2 == null) return false;
        if (size(arr1)!=size(arr2)) return false;
        for (int i=0; i<size(arr1); i++)
            if (arr1[i]==arr2[i]) return true;
        return false;
    }
}