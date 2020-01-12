import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class SortArrayBottomUp {
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
            int[] ans = Program.sortArray(arr);
            assertTrue("should be empty",ans != null && ans.length == 0);
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

}