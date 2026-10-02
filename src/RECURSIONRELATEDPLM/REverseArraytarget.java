package RECURSIONRELATEDPLM;

public class REverseArraytarget {
        public static int search(int[] nums, int target, int low, int high) {
            if(low>high) {
                return -1;
            }
                int mid= low+(high-low)/2;
                if(nums[mid] ==target){
                    return mid;
                }

                if(nums[low]<=nums[mid]){  //left sorted//
                    if(nums[low]<= target && target< nums[mid]){
                        return search(nums,target,low,mid-1);
                    }else{
                        return search(nums,target,mid+1,high);

                    }
                }
                else{

                    if(nums[mid]< target && target<= nums[high]){ //right side sorted//
                        return search(nums,target,mid+1,high);
                    }else{
                        return search(nums,target,low,mid-1);                    }
                }
            }

    static void main() {
        int []arr= {5,6,7,8,9,1,2,3};
        int target=2;
        int ans= search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
        }



