package STACKRELATEDPLM;

import java.util.Stack;

public class LargestRectangeinhistogram {
    public  static int  largestRectangleArea(int[] heights) {
Stack<Integer> st= new Stack<>();
int maxArea=0;
int n= heights.length;
for(int i=0; i<=n; i++){
    int currheight;
    if(i==n){
        currheight=0;

    }else{
        currheight=heights[i];
    }

    while (!st.isEmpty() && currheight<heights[st.peek()]){
        int height= heights[st.pop()];

        int pse;

        if(st.isEmpty()){
            pse=-1;
        }else {
            pse=st.peek();
        }
        int nse=i; // next smallest element;

        int width= nse-pse-1;
        int area = width*height;
        maxArea= Math.max(maxArea,area);
    }
st.push(i);
}

return maxArea;

    }

    public static void main(String[] args) {
        //int []height= {2,1,5,6,2,3};
        int []height= {2,4};
        int ans= largestRectangleArea(height);
        System.out.println(ans);
    }

}
