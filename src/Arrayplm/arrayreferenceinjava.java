package Arrayplm;

public class arrayreferenceinjava {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(  i+" "   + "element of array is = : " + arr[i]);

        }


    }

    public void main(String[] args) {


        int[] arr_1 = {1, 2, 3, 4, 5};
        System.out.println("first array element:::");
        printArray(arr_1);

        //int[] arr_2 = arr_1;//cloning concept
        int[] arr_2= arr_1.clone();// add clone function not change in first arr1 element
        // because clone method create deep copy inside memeory//
        System.out.println("second array element ");
        printArray(arr_2);

        System.out.println("after change some element in array 2");
        arr_2[0]= 10;
        arr_2[1]=20;
        printArray(arr_1);
        printArray(arr_2);
    }
}