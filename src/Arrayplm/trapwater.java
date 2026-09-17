package Arrayplm;

public class trapwater {

        public static int trap(int[] height) {
            int ans=0;
            int left=0;
            int right= height.length-1;
            int lmax=0;
            int rmax=0;
            while(left<right){
                lmax= Math.max(lmax,height[left]);
                rmax= Math.max(rmax, height[right]);

                if(lmax<rmax){
                    ans+=lmax-height[left];
                    left++;
                }else{
                    ans+=rmax-height[right];
                    right--;
                }


            }
            return ans;

        }

    static void main() {
        int[]arr= {0,1,0,2,1,0,1,3,2,1,2,1};
        int result=trap(arr);
        System.out.println(result);
    }
    }

