package Arrayplm;

public class leetcode643maximumSubarray {
    public static double maximumAverageSubArray(int[]arr,int k){
        int i=0;
        int j=0;
        int max= Integer.MIN_VALUE;
        int sum=0;
        while(j<arr.length){
            sum= sum+arr[j];


            if(j-i+1<k){ //here window size if small//
                j++;
            }
            else{
              max= Math.max(max,sum);
              sum= sum-arr[i];
              i++;
              j++;
            }
        }

        double avrage = (double) max/k;
        return avrage;

    }

    static void main(String[] args) {
        int[]arr= {1,12,-5,-6,50,3};
        int k=4;
        double ans= maximumAverageSubArray(arr,k);
        System.out.println(ans);
    }
}
