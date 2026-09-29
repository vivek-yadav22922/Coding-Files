package STACKRELATEDPLM;

import java.util.Stack;

public class Suminrange {
    public long subArrayRanges(int[] arr) {

        long minSum = SumofminiumsubAarra(arr);
        long maxSum = SumofmaximumsubAarra(arr);

        return maxSum - minSum;
    }
    public  static long SumofminiumsubAarra(int[]arr){
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

        long minsum = 0;


        for(int i=0; i<n; i++){
            long left = i-pse[i];
            long right = nse[i]-i;
            minsum+= left*right*arr[i];
        }
        return minsum;

    }

    public  static long SumofmaximumsubAarra(int[]arr){
        int n= arr.length;
        int[]pge=new int[n];
        int[]nge= new int[n];

        Stack<Integer> st= new Stack<>();
        // pge calculate//

        for(int i=0; i<n; i++){
            while (!st.isEmpty() && arr[st.peek()]<=arr[i]){ // if duplicate value aaya to consider//
                st.pop();
            }
            if(st.isEmpty()){
                pge[i]= -1;
            }
            else{
                pge[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();// last may index clear karna padta hai// for next calulate nse


        // calculate nge//
        for(int i=n-1; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()]< arr[i]){// here not consider duplicate value//
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]= n;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(i);
        }

        long maxsum = 0;


        for(int i=0; i<n; i++){
            long left = i-pge[i];
            long right = nge[i]-i;
            maxsum+= left*right*arr[i];
        }
        return maxsum;

    }

    public static void main(String[] args) {
        int[]arr= {1,3,3};
        long ans1= SumofminiumsubAarra(arr);
        long ans2= SumofmaximumsubAarra(arr);

        long answer = ans2 - ans1;
        System.out.println(answer);
    }
}
