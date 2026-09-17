package Arrayplm;

public class addelemement {
    void add (){
        int [] arr = {1,2,3,4,5,6};
        int sum=0;
        for(int i=0; i< arr.length; i++) {
            sum = sum + arr[i];
        }
            System.out.println("sum of all  array element is: "+ sum);
    }

      public static void main(String[] args) {
        addelemement a= new addelemement();
        a.add();

    }
}
