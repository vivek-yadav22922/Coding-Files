package TwoPointerQuestion;

public class removeElement {
    public int removeElements(int[] nums, int val) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    static void main(String[] args) {
        int[]nums= {3,2,2,3};
        int val=3;
        removeElement E= new removeElement();
        int result= E.removeElements(nums,val);
        System.out.println(result);
    }
}