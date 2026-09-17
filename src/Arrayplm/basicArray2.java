package Arrayplm;

public class basicArray2 {
     void printArray(){
         int [] arr= {1,2,3,4,5};

         arr[2]= 45;//update value
         arr[3]= 45;//update value
         arr[4]= 45;//update value


         System.out.println(arr[0]);
         System.out.println(arr[1]);

         System.out.println(arr[2]);

         System.out.println(arr[3]);



     }

   public static void main(String[] args) {

      basicArray2 obj= new basicArray2();
      obj.printArray();
    }
    }

