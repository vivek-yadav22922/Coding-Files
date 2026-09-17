package Arrayplm;

public class varialbleSlidingWindow1 {
    public static int maximumsizeOfWindowSumequalTo(int[]arr, int k){ // here k is condition//
        int i=0;
        int j=0;
        int sum= 0;
        int max= Integer.MIN_VALUE;
        while(j<arr.length) {
            sum = sum + arr[j];

            while (sum > k) {  //here window ko valid bannao//
                sum = sum - arr[i];
                i++;
            }
            if(sum==k){
                max= Math.max(max, j-i+1);
            }
          j++;
        }

return max;
    }

    static void main(String[] args) {
        int[]arr= {4,1,1,1,1,1,1,2,3,};
        int k= 5;
        int maximumWindowSize= maximumsizeOfWindowSumequalTo(arr,k);
        System.out.println("maximum size of array which is equal to k "   +maximumWindowSize);
    }
}
