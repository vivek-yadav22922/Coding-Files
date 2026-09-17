package HashmAPrelatedPlm;

import java.util.HashMap;

public class largestSubarray {
    public int largestsubarrayLength(int[] arr){
        int n= arr.length;
        int maxlength=0;
        int prefix_sum=0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);// special case already put inside
        for(int i=0; i<n; i++){
            prefix_sum+=arr[i];

            if(map.containsKey(prefix_sum)){
                maxlength = Math.max(maxlength, i-map.get(prefix_sum));
            }
            else {
                map.put(prefix_sum,i);
            }

        }
        return maxlength;



    }

    static void main(String[] args) {
        largestSubarray A= new largestSubarray();
//        int arr[]= {15,-2,2,-8,1,7,10};
        int arr[]= {15,-2,2,-8,1,7,10,-25};
       int len=  A.largestsubarrayLength(arr);
        System.out.println("maximum lengthsum subarray is  "+  len  + "  length  ");

    }
}
