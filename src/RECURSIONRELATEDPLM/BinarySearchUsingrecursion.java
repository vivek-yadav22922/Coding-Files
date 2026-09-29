package RECURSIONRELATEDPLM;

public class BinarySearchUsingrecursion {
public static int BS(int[]arr, int target,int s, int e){

    int mid= s+(e-s)/2;
    if(arr[mid] == target){
        return mid;
    }
    if (target < arr[mid]) {
         return BS(arr,target,s,mid-1);
    }

    return BS(arr,target,mid+1,e);

}

    public static void main(String[] args) {
        int[]arr= {1,2,3,4,66,78,80};
        int target= 3;
        int s=0;
        int e=arr.length-1;
        System.out.println(BS(arr,target,s,e));
    }

}
