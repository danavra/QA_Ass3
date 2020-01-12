import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class SortArrayTopDown {
    @Test
    public void sortArrayNULL() {
        try{
            assertEquals("should be null",null,ProgramStub7.sortArray(null));
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void sortArrayEMPTY() {
        try{
            int[] arr = {};
            int[] ans = ProgramStub7.sortArray(arr);
            assertTrue("should be empty",ans != null && ans.length == 0);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }
    @Test
    public void sortArrayWORKS() {
        try{
            int[] arr = {5,2,6,80,1};
            int[] ans = ProgramStub7.sortArray(arr);

            assertTrue("should be [1,2,5,6,80]",ans[0] == 1 && ans[1] == 2 && ans[2] == 5 && ans[3] == 6 && ans[4] == 80);
        }catch (Exception e){
            fail("should not throw exceptions");
        }
    }

}

class ProgramStub7 extends Program{

    public static int[] sortArray(int[] arr) {
        if (arr == null) return null;
        int[] res = copyArr(arr);
        for(int i=0; i<size(arr); i++)
            for (int j=0; j<size(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }

    public static int size(int[] arr) {
        if(arr == null)
            return -1;
        return arr.length;
    }

    // Returns copy of the array "arr"
    public static int[] copyArr(int[] arr) {
        if (arr == null || arr.length ==0) return null;
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        return  copy;
    }
}