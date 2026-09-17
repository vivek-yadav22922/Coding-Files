package BinarySearchPLM;

import java.util.Arrays;

public class magneticForce {
    public  static  int MagneticForceBetweenBall(int[]position, int m){
        Arrays.sort(position);
        int low = 1;
        int high= position[position.length-1]-position[0];
        int ans=0;
         while(low<=high){
             int mid= low+(high-low)/2;

             int cout=1; // this is used for cout ball are placed //
             int last= position[0];

             for(int value :position ){

                 if(value-last >= mid){
                     cout++;
                     last=value;
                 }
             }
            if(cout>=m){
                ans= mid;
                low= mid+1; // increase length//
            }
            else{
                high= mid-1;
            }
         }


        return ans;

    }

    public static void main(String[] args) {
        int[] position = {1, 2, 3, 4, 5,9};
        int m = 3; // no of balls//
        int ans = MagneticForceBetweenBall(position, m);
        System.out.println(ans);
    }
}
