package TwoPointerQuestion;

import java.util.Arrays;

public class twoSum {
    public  static int[] twoSumvalue(int[]nums, int val){
        int i=0;
        int j=nums.length-1;
        while (i<j){
            if(nums[i]+nums[j]>val){
                j--;

            } else if (nums[i]+nums[j]< val) {
                i++;

            }
else{
    if(nums[i]+nums[j]== val){
        return new int[]{i,j};
    }

            }
        }

        return new int[]{-1,-1}; // means not any value present in array equals to value//
    }

    static void main() {
       int[]arr= {3,2,4};
        //  int[]arr= {2,7,11,15};
       // int val=6;
        int val= 9;
        int[]result= twoSumvalue(arr,val);
        System.out.println(Arrays.toString(result));
    }
}
