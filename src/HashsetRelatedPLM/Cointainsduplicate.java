package HashsetRelatedPLM;

import java.util.HashMap;
import java.util.HashSet;

public class Cointainsduplicate {
    public static boolean cointaindub(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            if (!set.contains(el)) {
                set.add(el);

            } else {
                if (set.contains(el)) {
                    return true;

                }
            }
        }

return false;
    }

    static void main(String[] args) {
       // int[]arr= {1,2,3,4,5,6,1,2};
        int[]arr= {1,2,3,4,5,6};
        System.out.println(cointaindub(arr));
    }
}

