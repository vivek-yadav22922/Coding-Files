package RECURSIONRELATEDPLM;

public class ArrayisSortedORnotRecursion {
    public static boolean Search(int[]arr, int index){
        if(index== arr.length-1){ //base case
            return true;  // last elemnt tak reach kar gya //
        }
        return arr[index]<arr[index+1] && Search(arr, index+1);
    }

    public static void main(String[] args) {
        int[]arr= {1,8,5,8,9,10};
        System.out.println(Search(arr, 0));
    }


}
