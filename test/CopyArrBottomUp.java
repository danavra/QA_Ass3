import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CopyArrBottomUp {
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


    }

