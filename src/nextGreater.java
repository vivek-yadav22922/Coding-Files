import java.util.Arrays;
import java.util.Stack;

public class nextGreater {
    public static int[] NextGreater2(int[]nums){
        int n= nums.length;
        int[]ans= new int[n];
        Arrays.fill(ans,-1);//this method fill arrays -1//
        Stack <Integer> st= new Stack<>();
        for(int i=0; i<n*2; i++){
            int current= nums[i%n]; // here use circular loop concept //
            while (!st.isEmpty() && nums[st.peek()]< current){
                ans[st.pop()]= current;

            }
            if(i<n){
                st.push(i); // here strore index inside array//
            }
        }

return ans;

    }

    public static void main(String[] args) {
        int[] nums= {1,2,1};
        int[] ans= NextGreater2(nums);
        System.out.println(Arrays.toString(ans));
    }
}
