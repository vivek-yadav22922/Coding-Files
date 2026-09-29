package BinarySearchPLM;

public class Bookallocation {
    public static int BookAllocationStudent(int[]pages,int m){
        int low=0;
        int high= 0;
        int ans=-1;
        for(int value : pages){
            low=Math.max(low, value);
            high=high+value;
        }
        while (low<=high){
            int mid= low+(high-low)/2;
            int student=1;
            int sum=0;

            for(int page: pages){
                if(sum+page<=mid){
                    sum+=page;
                }else{
                    student++;
                    sum= page;
                }
            }
           if(student<=m){
               ans=mid;
               high=mid-1;
           }else {
               low= mid+1;
           }
        }

       return ans;

    }

    public static void main(String[] args) {
        int[] pages= {12,34,67,90};
        int student= 2;

        int ans= BookAllocationStudent(pages,student);
        System.out.println(ans);
    }
}
