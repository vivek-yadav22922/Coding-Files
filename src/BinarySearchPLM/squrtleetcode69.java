package BinarySearchPLM;

public class squrtleetcode69 {
    public static int mySqrt(int x) {
        int low=0;
        int high=x;
        int ans=0;
        while(low<=high){
            int mid= low +(high-low)/2;

            long midsquare= (long)mid*mid;
            if(midsquare<= x){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;

            }

        }
        return ans;
    }

    static void main(String[] args) {
        int x= 5;
        int result= mySqrt(x);
        System.out.println(result);
    }
}
