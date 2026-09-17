package Arrayplm;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class firstnegative {
    public static int[] PrintFirstNegativeNumber(int[]arr,int k){
        int n= arr.length;
        // n-k+1; size of ans array//
        int[]ans=new int[n-k+1];

        Deque<Integer> dq= new ArrayDeque<>();// here use deque for store negative element//
        int index=0;
        //step 1 negative element ka index store//
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                dq.addLast(i); //here store index not value//
            }
            // step 2 check window size complete//
            if(i>=k-1){
                // step 3 remove karo window say bahar wala element ko//
                while(!dq.isEmpty() && dq.peekFirst()< i-3+1){
                    dq.removeFirst();
                }
                // step 4 first window nikalo //
               if(dq.isEmpty()){
                   ans[index]=0;
               }else {
                  ans[index]=arr[dq.peekFirst()];
               }
              index++;
            }
        }
     return ans;
    }

    static void main(String[] args) {
      int []arr= {12,-1,-7,8,-15,30};
      int k=3;
      int[] result= PrintFirstNegativeNumber(arr,k);
        System.out.println(Arrays.toString(result));
    }
}
