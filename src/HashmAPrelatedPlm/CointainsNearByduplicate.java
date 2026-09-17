package HashmAPrelatedPlm;

import HashsetRelatedPLM.Cointainsduplicate;

import java.util.HashMap;

public class CointainsNearByduplicate {
    public boolean nearBYelement(int[]arr, int k){

        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int current= arr[i];

            if(!map.containsKey(current)){
                map.put(current,i);
            }
            else {
                int previous= map.get(current);
                int ans= i-previous;
                if(ans<=k){
                    return true;
                }
            }
          map.put(current,i);// update map value
        }
        return false;

    }

    static void main(String[] args) {
        CointainsNearByduplicate D= new CointainsNearByduplicate();
//        int arr[]= {5,1,5,5};
        int arr[]= {1,0,1,1};

        int k=1;
        System.out.println(D.nearBYelement(arr,k));
    }
}
