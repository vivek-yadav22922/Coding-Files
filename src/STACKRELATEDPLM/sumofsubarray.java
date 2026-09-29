package STACKRELATEDPLM;

import java.util.Stack;

public class sumofsubarray {
    public  static long SumofminiumsubAarray(int[]arr){
        int n= arr.length;
        int[]pse=new int[n];
        int[]nse= new int[n];

        Stack<Integer> st= new Stack<>();
        // pse calculate//

        for(int i=0; i<n; i++){
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]){ // if duplicate value aaya to consider//
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]= -1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();// last may index clear karna padta hai// for next calulate nse


        // calculate nse//
        for(int i=n-1; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()]> arr[i]){// here not consider duplicate value//
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]= n;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }

        long ans = 0;
        int mod = 1_000_000_007;// this use because value will be big//

        for(int i=0; i<n; i++){
            long left = i-pse[i];
            long right = nse[i]-i;
            ans = (ans + (arr[i] * left % mod) * right) % mod;
        }
return (int)ans;

    }

    public static void main(String[] args) {
        int[]arr= {2,6,2,4,2};
        long ans= SumofminiumsubAarray(arr);
        System.out.println(ans);
    }
}
