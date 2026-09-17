package TwoPointerQuestion;

public class removeDuplicateElement {
    public static int removeDuplicate(int[]nums){
        int j=0;
        for(int i=1; i<nums.length; i++){
            if (nums[i] != nums[j]) {
                j++;
                nums[j]= nums[i];
            }
        }
        return j+1;


    }

    static void main() {
      int[]  nums = {0,0,1,1,1,2,2,3,3,4};
      int result= removeDuplicate(nums);
        System.out.println(result);
    }
}
