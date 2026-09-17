package BinarySearchPLM;

public class smallestDivisor {
    public static int SmallastDivisor(int[]nums, int thresold){
        int low=1;
        int high=0;
        for(int value : nums) {
            low = Math.min(low, value);
            high = Math.max(high, value);
        }

        while (low<=high){
            int mid= low+(high-low)/2;
            int divisor=0;

            for(int value : nums){
               divisor+= (int)Math.ceil((double)value/mid );

            }

           if(divisor<=thresold){
               high= mid-1;
           }
            else{
                  low= mid+1;
           }

        }

return low;

    }

    public static void main(String[] args) {
        int[]nums= {1,2,5,9};
        int thresold=6;
        int ans= SmallastDivisor(nums,thresold);
        System.out.println(ans);


    }
}
