package Arrayplm;

public class sortedORnot2 {
    static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,8,9};
for(int i=1; i< arr.length; i++){
    if (arr[i-1] < arr[i]) {
        System.out.println("array is sorted");
           break;
    }
    else{
        System.out.println("array is not sorted");
    }

}
    }


    }

