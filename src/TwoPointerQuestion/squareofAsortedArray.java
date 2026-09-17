package TwoPointerQuestion;

import java.util.Arrays;

public class squareofAsortedArray {
    public static int[] SquareOfSortedArray(int[]nums){
        int[]ans= new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        while(i<=j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                int leftsquare = nums[i] * nums[i];
                ans[k] = leftsquare;
                i++;
            } else {

                int rightsquare = nums[j] * nums[j];
                ans[k] = rightsquare;
                j--;
            }

            k--;

        }
        return ans;
    }

    static void main(String[] args) {
        int[]arr= {-4,-1,0,3,10};
       int[] rerult =  SquareOfSortedArray(arr);
        System.out.println(Arrays.toString(rerult));
        }
    }

