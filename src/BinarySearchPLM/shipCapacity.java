package BinarySearchPLM;

public class shipCapacity {
    public static int shipCapacityDdays(int[]weights,int days){
        int low= 0;
        int high= 0;
        for(int weight: weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        while (low<=high){
            int mid= low+(high-low)/2;

            int NeedDays=1;
             int currentweight=0;
             for(int weight : weights) {

                 if (currentweight+weight <= mid) {
                     currentweight += weight;
                 } else {
                     NeedDays++;
                     currentweight = weight;
                 }

             }
                 if(NeedDays<=days){
                     high=mid-1;
                 }
                 else{
                     low=mid+1;
                 }



        }

      return low;
    }

    public static void main(String[] args) {
        int[]weights={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int ans = shipCapacityDdays(weights,days);
        System.out.println(ans);
    }
}
