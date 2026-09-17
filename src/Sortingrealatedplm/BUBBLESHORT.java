package Sortingrealatedplm;

public class BUBBLESHORT {
    public static void printArray(int[]arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }


    static void main(String[] args) {
        int[] arr= {3,2,6,4,1};
        System.out.println("before shorting array element");
        printArray(arr);

        for(int i=0; i<arr.length-1; i++){
            for(int j=0;  j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                 //swap
                 int temp= arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
            }
        }
        System.out.println("after shorting array element");
        printArray(arr);

    }
}
