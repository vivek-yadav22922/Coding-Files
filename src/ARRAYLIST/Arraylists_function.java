package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylists_function {
    static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();// it is used Integer class for interger vale//

      /*  ArrayList<Float> list1= new ArrayList<>();//  it is used float class for float value//
        ArrayList<String> list2= new ArrayList<>();// it is used String class for string value//
        ArrayList<Boolean> list3= new ArrayList<>(); // it is used boolean class for boolean value//
*/

    // here used integers class for integers value //

        //add function//
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // get function //
         int result = list.get(2);//  here pass index value //
        System.out.println(result);

        // add element in between using add function//

        list.add(2,8); // here pass index and element //
        System.out.println(list);

        // set function //
        list.set(2,7);
        System.out.println(list);

        // remove/delete element//
        list.remove(3);
        System.out.println(list);

        // size() function //
        int size= list.size();
        System.out.println(size);


        // how iterate element in arrayList //

        for (int i=0; i< list.size(); i++){
            System.out.print(list.get(i));
            System.out.println();

        }
        // sorting function //

        Collections.sort(list);// here collections name class  are used and sort function exist inside collections class//
        System.out.println(list);





    }
}
