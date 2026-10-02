package RECURSIONRELATEDPLM;

public class REverseArraytarget2Dupli {
    public static boolean search(int[] nums, int target) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        public static boolean binarySearch(int[] nums, int target, int low, int high) {

            // Base case
            if (low > high) {
                return false;
            }

            int mid = low + (high - low) / 2;

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            // Duplicates: cannot determine which side is sorted
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                return binarySearch(nums, target, low, high);
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {

                if (nums[low] <= target && target < nums[mid]) {
                    return binarySearch(nums, target, low, mid - 1);
                } else {
                    return binarySearch(nums, target, mid + 1, high);
                }
            }

            // Right half is sorted
            else {

                if (nums[mid] < target && target <= nums[high]) {
                    return binarySearch(nums, target, mid + 1, high);
                } else {
                    return binarySearch(nums, target, low, mid - 1);
                }
            }
        }

    public static void main(String[] args) {
        int[]arr= {2,5,6,0,0,1,2};
        int target=10;
        boolean ans =search(arr,target);
        System.out.println(ans);
    }
    }

