package Arrayplm;

public class basicArray1 {
    public static void main(String[] args) {


        int[] age = new int[5];
        age[0] = 12;
        age[1] = 13;
        age[2] = 14;
        age[3] = 15;
        age[4] = 16;

//       for(int i=0; i< age.length; i++)// we can print all element using loop
//            System.out.println(" all elements of array is "+ age[i]);
//        }

        // without loop
        System.out.println("element of 0 index " +age[0]);
        System.out.println("element of 1 index"+age[1]);
        System.out.println("element of 2 index "+age[2]);
    }
}