package BinarySearchtreeRelatedQuestion;

public class printinRange {
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

    public static void printinRange(Node root,int x,int y){
        if(root==null){
            return;
        }

        if(root.data>= x && root.data<=y){
            printinRange(root.left,x,y);
            System.out.println(root.data+" ");
            printinRange(root.right,x,y);
        } else if (root.data>=y) {
            printinRange(root.left,x,y);

        }
        else {
            printinRange(root.right,x,y);
        }

    }


    public void main() {
        int values[]= {8,5,3,1,4,6,10,11,14};
        Node root= null;

        for(int i=0; i<values.length; i++){
            root= insert(root,values[i]);
        }
printinRange(root,0,12);
    }

}
