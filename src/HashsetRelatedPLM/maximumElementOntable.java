package HashsetRelatedPLM;

import java.util.HashSet;

public class maximumElementOntable {
    int maxlenth = 0;

    public int maximumElementontable(int[] bag) {
        HashSet<Integer> table = new HashSet<>();
        for (int i = 0; i < bag.length; i++) {
            int num = bag[i];
            if (table.contains(num)) {
                table.remove(num);
            } else {
                table.add(num);
                maxlenth++;

            }
            maxlenth = Math.max(maxlenth, table.size());
        }
        return maxlenth;


    }

    static void main(String[] args) {
        int[] bag ={ 2,1,3,2,3,1};
maximumElementOntable Tab= new maximumElementOntable();
         int length= Tab.maximumElementontable(bag);
        System.out.println("maximum element on table is "+length);

    }
}