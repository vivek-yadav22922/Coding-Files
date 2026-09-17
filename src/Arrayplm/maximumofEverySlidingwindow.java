package Arrayplm;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class maximumofEverySlidingwindow {
    public static int[]maximumNumberEveryWindow(int[]arr,int k){
        int index=0;
        int n= arr.length;
        int[]ans= new int[n-k+1];
        Deque<Integer> dq= new ArrayDeque<>();
        for(int j=0; j<n;j++){
            //remove small element from dequeu //
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[j]){
                dq.removeLast();
            }
        dq.addLast(j);

        while (!dq.isEmpty() && dq.peekFirst()<=j-k){
            dq.removeFirst();
        }
        if(j>=k-1){
            ans[index]= arr[dq.peekFirst()];
            index++;
        }
        }
       return ans;
    }

    static void main(String[] args) {
       int[]nums={7,2,4};
        // int[] nums = {1,3,-1,-3,5,3,6,7};
         int k=2;
        // int k = 3;
        int[] result= maximumNumberEveryWindow(nums,k);
        System.out.println(Arrays.toString(result));
    }
}
