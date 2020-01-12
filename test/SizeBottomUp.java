import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SizeBottomUp {
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

}
