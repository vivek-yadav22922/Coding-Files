package TwoPointerQuestion;

import java.util.Arrays;

public class mergeAndSorted88 {
    public static void mergeSorted(int[] nums1, int n, int[] nums2, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {  // here if nums[i] k elements big ho to nums[j] k element bachay rahay gay/
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int n = 3;
        int[] nums2 = {2, 5, 6};
        int m = 3;

        mergeSorted(nums1,n,nums2,m);
        for(int i=0; i<nums1.length; i++){
            System.out.println(nums1[i]);


        }
    }
}