package RECURSIONRELATEDPLM;

public class SumOfArrayElement {
    public   static int SumArray(int[]arr){

        return Sum(arr,0);
    }


    public static int Sum(int[]arr, int index){
        if(index== arr.length){
            return 0;
        }

        return arr[index]+Sum(arr,index+1);
    }

    public static void main(String[] args) {
        int []arr= {1,2,3,4};
        System.out.println(SumArray(arr));

    }
}
