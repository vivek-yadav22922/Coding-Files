package BinarySearchPLM;

public class Binarysearchtarget {
    public static int BinarySearch(int[]nums, int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid= low+(high-low)/2; //here calculate mid value//
            if (nums[mid]== target) {
                return mid;
            } else if (nums[mid]<target) {
                low=mid+1; // here mid value increase//
            }
            else {
                if(nums[mid]>target){
                    high=mid-1;
                }
            }
        }

        return -1;
    }

    static void main(String[] args) {
      int[]nums  =   {2,5,8,12,16,20,25};
      int target=12;
      int result= BinarySearch(nums,target);
        System.out.println(result);
    }
}
