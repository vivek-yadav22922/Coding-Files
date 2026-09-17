package Arrayplm;

public class lastoccuranceofelement {


     public static void main(String[] args) {
         int x= 4;
         int[] arr={4,5,2,3,4,8,9,4,5,4};
         int ans= -1;
         for(int i=0; i<arr.length; i++){
             if(arr[i]== x){

                 ans=i;
             }
         }
         System.out.println( "element last time occur index no =="+ans);


    }
}
