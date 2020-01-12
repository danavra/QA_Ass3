import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ProgramTest_BU {

    @Test //size
    public void testNullsize() {
        try{
            Program.size(null);

        }catch(Exception e){
            fail("function size should not throw exceptions");
        }
    }
    @Test //size
    public void testSizeWorks(){
        int[] arr = {1,2,3};
        assertEquals("should be three",Program.size(arr),3);
    }

    @Test
    public void printArrNULL() {
        try{
            Program.printArr(null);
        }catch(Exception e){
            fail("function size should not throw exceptions");
        }
    }

    @Test
    public void printArrWorks() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int[] arr = {1,2,3};
        Program.printArr(arr);
        assertEquals("1 2 3 \n", outContent.toString());
    }


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

    @Test
    public void maxValueNULL() {
        try{
            Program.maxValue(null);
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
    @Test
    public void maxValueWorks() {
        try {
            int[] arr = {10, 222, 30};
            assertEquals("should return 222", 222, Program.maxValue(arr));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

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

    @Test
    public void sumMinMaxNULL() {
        try{
            Program.sumMinMax(null);
        }catch (Exception e){
            fail("should not throw exception");
        }
    }
    @Test
    public void sumMinMaxEmpty() {
        try{
            int[] arr = {};
            Program.sumMinMax(arr);
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




    @Test
    public void copyArrNULL() {
        try{
            assertEquals("should be null",null,Program.copyArr(null));
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }
    @Test
    public void copyArrEMPTY() {
        int[] arr = {};
        assertEquals("should be empty array",arr.length,Program.copyArr(arr).length);
    }
    @Test
    public void copyArrWorks() {
        try {
            int[] arr = {10, 222, 30};
            int[] ans = Program.copyArr(arr);
            for (int i = 0 ; i < ans.length; i++){
                if(arr[i] != ans[i]){
                    fail("the arrays are not equal");
                }
            }
        }catch (Exception e){
            fail("no exception should be thrown");
        }
    }




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
            assertEquals("should be empty",0,Program.swapMinMax(arr).length);
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


    @Test
    public void sortArrayNULL() {
        try{
            assertEquals("should be null",null,Program.sortArray(null));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void sortArrayEMPTY() {
        try{
            int[] arr = {};
            assertEquals("should be empty",0,Program.sortArray(arr).length);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void sortArrayWORKS() {
        try{
            int[] arr = {5,2,6,80,1};
            int[] ans = Program.sortArray(arr);

            assertTrue("should be [1,2,5,6,80]",ans[0] == 1 && ans[1] == 2 && ans[2] == 5 && ans[3] == 6 && ans[4] == 80);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }


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

    @Test
    public void mergeNULL_NULL() {
        try{
            int[] arr1 = null;
            int[] arr2 = null;
            Program.merge(arr1,arr2);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeNULL_EMPTY() {
        try{
            int[] arr1 = {};
            int[] arr2 = null;
            Program.merge(arr1,arr2);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeNULL_GOOD() {
        try{
            int[] arr1 = {4,6,2};
            int[] arr2 = null;
            int[] ans = Program.merge(arr1,arr2);
            Program.printArr(ans);
            assertTrue("should be [2,4,6]",ans.length == 3 && ans[0] == 2 && ans[1] == 4 && ans[2] == 6);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeGOOD_GOOD() {
        try{
            int[] arr1 = {4,6,2};
            int[] arr2 = {30,1,4};
            int[] ans = Program.merge(arr1,arr2);
            Program.printArr(ans);
            assertTrue("should be [1,2,4,4,6,30]",ans.length == 6 && ans[0] == 1 && ans[1] == 2 && ans[2] == 4 && ans[3] == 4 && ans[4] == 6 && ans[5] == 30);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void mergeALLREADYSORTED() {
        try{
            int[] arr1 = {3,6,9};
            int[] arr2 = {10,15};
            int[] ans = Program.merge(arr1,arr2);
            Program.printArr(ans);
            assertTrue("should be [3,6,9,10,15]",ans.length == 5 && ans[0] == 3 && ans[1] == 6 && ans[2] == 9 && ans[3] == 10 && ans[4] == 15);
        }catch (Exception e){
            fail("should not throw exceptions");
        }

    }



    @Test
    public void printSortedNULL() {
        try {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            Program.printSorted(null);

            assertEquals("No array\n", outContent.toString());

        } catch (Exception e) {
            fail("Should not throw exceptions");
        }
    }
    @Test
    public void printSorted_GOOD() {
        try {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            int[] arr = {4,9,5,7};
            Program.printSorted(arr);

            assertEquals("4 9 5 7 \n4 5 7 9 \n4 9 5 7 \n", outContent.toString());

        } catch (Exception e) {
            fail("Should not throw exceptions");
        }
    }
}