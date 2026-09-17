package BinarySearchtreeRelatedQuestion;

import java.util.ArrayList;

public class RoottoLeafpath     {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public Node insert(Node root, int val){
        if(root == null){
            return root = new Node(val);
        }
        if(root.data>val){
            // left subtree //
            root.left= insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);//right subtree //
        }
        return root;
    }


    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");

        }
        System.out.println();
    }
    public static void printRoot2leaf(Node root,ArrayList<Integer> path){
       if(root==null){
           return;
       }
        path.add(root.data);

       // for leaf node //
        if(root.left==null && root.right==null){
            printpath(path);
        }
        // non leaf //
        else {
            printRoot2leaf(root.left,path);
            printRoot2leaf(root.right,path);

        }
        path.remove(path.size()-1); // remove
    }



    public void main() {
        int values[]= {8,5,3,6,10,11,14};
        Node root= null;

        for(int i=0; i<values.length; i++){
            root= insert(root,values[i]);
        }
        printRoot2leaf(root,new ArrayList<>());

    }
}
