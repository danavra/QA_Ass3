import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualsArrayBottomUp {

    @Test
    public void equalArraysNull_Null() {
        assertTrue("should be true",Program.equalArrays(null,null));
    }

    @Test
    public void equalArraysNull_notNull() {
        int[] arr = {10, 222, 30};
        assertFalse("should be false",Program.equalArrays(arr,null));
    }
    @Test
    public void equalArraysEquals() {
        int[] arr1 = {10, 222, 30};
        int[] arr2 = {10, 222, 30};
        assertTrue("are equal",Program.equalArrays(arr1,arr2));
    }
    @Test
    public void equalArraysNotEquals() {
        int[] arr1 = {10, 222, 30};
        int[] arr2 = {10, 222, 31};
        assertFalse("is not equal",Program.equalArrays(arr1,arr2));
    }

    @Test
    public void equalArraysEmptyAndEquals() {
        int[] arr1 = {};
        int[] arr2 = {};
        assertTrue("are equal",Program.equalArrays(arr1,arr2));
    }

}
