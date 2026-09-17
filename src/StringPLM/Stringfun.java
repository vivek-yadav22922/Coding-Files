package StringPLM;

import java.util.Scanner;

public class Stringfun {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String firstname = sc.next();

        System.out.println("enter the second string");
        String lastname= sc.next();

        //cancatination function//
        System.out.println("after adding firstname and lastname");
        String Fullname = firstname+lastname;
        System.out.println(Fullname);

     // length function//

        System.out.println("length of string is "+ Fullname.length());

        // charAt() //

       /* System.out.println("character of given  string index");
        System.out.println(Fullname.charAt(0));// if we want print one element in given string//*/

      /*  System.out.println("all character print one by one given string");
        for(int i=0; i<Fullname.length(); i++){
            System.out.println(Fullname.charAt(i));
        }*/


       //  CampareTo()  //

      /*  if(firstname.compareTo(lastname)==0){
            System.out.println("string are equals");
        }else {
            System.out.println("strings are not equals");

        }*/

       // substring function //

      /* String substring= Fullname.substring(5 ,Fullname.length()) ;
        System.out.println("sub string is that");
        System.out.println(substring);
*/


    }
}
