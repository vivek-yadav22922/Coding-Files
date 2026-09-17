package HashmAPrelatedPlm;

import java.util.HashMap;


public class twosumpair {
    public int[] twopairSum(int []arr, int target){
        int n= arr.length;
        int[]ans={-1};// here create answer array
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
             int partner= target-arr[i];

             if(map.containsKey(partner)){
                 ans= new int[]{i, map.get(partner)};
                 return ans;

             }
             map.put(arr[i], i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {14, 7, 10, 4, 5, 9, 1, 2};
        int target = 13;

        twosumpair S = new twosumpair();

        int[] arr1 = S.twopairSum(arr, target);

        System.out.println("["+ arr1[0] + " " + arr1[1]+"]");

    }
}
