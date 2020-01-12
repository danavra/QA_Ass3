import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintSortedBottomUp {



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