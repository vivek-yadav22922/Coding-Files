package HashsetRelatedPLM;

import java.util.HashSet;

public class IntersectionOfTwoArray {
    static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int arr2[]={2,2,1};

        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            int num1 = arr1[i];
            set.add(num1);
        }
        HashSet<Integer> ans= new HashSet<>();
        for(int i=0; i<arr2.length; i++){
            int num2= arr2[i];

            if(set.contains(num2)){
                ans.add(num2);
                set.remove(num2);
            }

        }
        System.out.println( "intersection of both array is =="+ ans);
    }
}
