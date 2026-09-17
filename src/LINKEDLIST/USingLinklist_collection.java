package LINKEDLIST;

import java.util.LinkedList;

public class USingLinklist_collection {
    static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();
        // add first//

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        System.out.println(list);

        //list.addLast("list");
        list.add("list");//  by default last may add ho hai//
        System.out.println(list);

        //size(); //
        System.out.println(list.size());

        // print all element using loop//
        for (int i=0; i< list.size(); i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("null");

        // remove element at begnning//

       /* list.removeFirst();
        System.out.println(list);*/




        // remove element at last//
        /*list.removeLast();
        System.out.println(list);*/


       // list.removeLast();// by default last wala remove hoga//
      //  System.out.println(list);

        // if we want remove particular element at index given list //
        list.remove(3);

        for (int i=0; i< list.size(); i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("null");
    }
}
