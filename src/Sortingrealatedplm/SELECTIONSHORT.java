package Sortingrealatedplm;

public class SELECTIONSHORT {

        public static void printArray(int[]arr){
            for(int i=0; i<arr.length;i++){
                System.out.println(arr[i]);

            }
        }


        static void main(String[] args) {
            int[] arr= {8,2,4,10,15,1};
            System.out.println("before shorting array element");
            printArray(arr);

            for(int i=0; i<arr.length; i++){
                int smallest = i;// here select 1 element and assume smallest element//
                for(int j=i+1;  j<arr.length; j++){
                    if(arr[smallest]>arr[j]){
                        smallest = j;// update

                        //swap
                        int temp= arr[smallest];
                        arr[smallest]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
            System.out.println("after shorting array element");
            printArray(arr);

        }
    }

