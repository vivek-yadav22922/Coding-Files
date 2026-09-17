package StringPLM;

public class stringplm3 {
    // we know that in java  string are immutable //
    //means we can't update but it is possible using string builder class//
    // using stringBuilder we can modify string in java///

    static void main(String[] args) {
        System.out.println("this is real String");
        StringBuilder sb= new StringBuilder("vivek");
        System.out.println(sb);

        // set function //

      /*  sb.setCharAt(0,'B');// which index want set value//
        System.out.println("after changing real string");
        System.out.println(sb);*/

       // insert function //

        /*sb.insert(0,'V'); // we can insert new character//
        System.out.println("after changing real string using insert method");
        System.out.println(sb);
*/
        // delete function //

        /*sb.delete(1,4); // hera strating index is inclusive but last index is exclusive//
        System.out.println("after changing real string using delete method");
        System.out.println(sb);*/

     // here  we can use charAt function //


     /*   System.out.println("here we access a character");
        System.out.println(sb.charAt(3));
*/

     // append function //
        System.out.println("after using append method new string is that");
        sb.append('y');
        sb.append('a');
        sb.append('d');
        sb.append('a');
        sb.append('v');

        System.out.println(sb);


    }

}
