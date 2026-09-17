package HashsetRelatedPLM;

import java.util.HashSet;

public class ImplementationofHashset {
    static void main(String[] args) {


        HashSet<String> set = new HashSet<>();
        // add element inside hashset//

set.add("vivek");
set.add("abhishek");
set.add("aarus");
set.add("shivam");
set.add("satyam");
// here we want to add duplicate element but it is not possible automatically remove and store only unique value//

        set.add("vivek");
        set.add("abhishek");
// here remove function //
        set.remove("aarus");

// here cointains function
        System.out.println(set.contains("aaarus"));// false
        System.out.println(set.contains("vivek"));// true
        System.out.println(set.size());//4
        // traversing the hasset//
        for(String s : set ){
            System.out.println(s);
        }
    }
}
