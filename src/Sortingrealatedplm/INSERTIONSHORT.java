package Sortingrealatedplm;

public class INSERTIONSHORT {
    public static void printArray(int[]arr){
            for(int i=0; i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }


        static void main(String[] args) {
            int[] arr= {3,2,6,4,1};
            System.out.println("before shorting array element");
            printArray(arr);

            for(int i=1; i<arr.length; i++){
                int current= arr[i];
                int j= i-1;
                while(j>=0 && current < arr[j]) {

                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1]=current;

            }
            System.out.println("after sorted array element");

    printArray(arr);
    }
            }









