package RECURSIONRELATEDPLM;

import java.util.ArrayList;

public class LinerSerchRecursion {
//    public static boolean LS(int[]arr, int target, int index){
//        if(index==arr.length-1){
//            return false;
//        }
//        return  arr[index]== target || LS(arr,target, index+1);
//
//    }
//
//    public static void main(String[] args) {
//        int[]arr= {3,2,8,19,15};
//        int target= 19;
//        System.out.println(LS(arr,target,0));
//    }


// integr value//

//    public static int LS(int[]arr, int target, int index){
//        if(index==arr.length-1){
//            return -1;
//        }
//        if(arr[index]== target  ){
//            return index;
//        }
//        else {
//            return LS(arr,target,index+1);
//        }
//
//    }




    public static ArrayList<Integer> FindAllIndexes(
            int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return FindAllIndexes(arr, target, index + 1, list);
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 8, 2, 19, 2, 15};
        int target = 2;

        ArrayList<Integer> ans =
                FindAllIndexes(arr, target, 0, new ArrayList<>());

        System.out.println(ans);

    }
}
