import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintSortedTopDown {



    @Test
    public void printSortedNULL() {
        try {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            ProgramStub1.printSorted(null);

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
            ProgramStub1.printSorted(arr);

            assertEquals("4 9 5 7 \n4 5 7 9 \n4 9 5 7 \n", outContent.toString());

        } catch (Exception e) {
            fail("Should not throw exceptions");
        }
    }

}

class ProgramStub1 extends Program{

    // Prints the array
    public static void printArr(int[] arr) {
        if(arr == null)
            return;
        for(int val: arr)
            System.out.print(val+" ");
        System.out.println();
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

    public static void printSorted(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        printArr(arr);
        arr = sortArray(arr);
        printArr(sortArray(arr));
        printArr(arr);
    }




}





