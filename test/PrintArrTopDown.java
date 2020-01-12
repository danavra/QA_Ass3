import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PrintArrTopDown {
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
}


