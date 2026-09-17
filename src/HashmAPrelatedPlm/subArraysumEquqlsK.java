package HashmAPrelatedPlm;
import java.util.HashMap;
public class subArraysumEquqlsK {



        public static int subarraySum(int[] nums, int k) {

            HashMap<Integer, Integer> map = new HashMap<>();

            // Prefix sum 0 ek baar pehle se exist karta hai
            map.put(0, 1);

            int prefixSum = 0;
            int count = 0;

            for (int i = 0; i < nums.length; i++) {

                prefixSum += nums[i];

                if (map.containsKey(prefixSum - k)) {
                    count += map.get(prefixSum - k);
                }

                map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            }

            return count;
        }

        public static void main(String[] args) {

            int[] nums = {9,4,0,0,20,3,10,5};
            int k = 33;

            System.out.println(subarraySum(nums, k));
        }

    }
