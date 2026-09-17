package TreeRelatedQuestion;

public class Inordertraversal {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    public class BinaryTree{
        static int idx= -1;
        public Node buildtree (int node[]){
          idx++;
          if(node[idx]== -1){
              return null;
          }
          Node newNode= new Node(node[idx]);
           newNode.left= buildtree(node);
           newNode.right= buildtree(node);
          return newNode;

        }

    }
      public static void inorder(Node root){
        if(root== null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);


    }

     void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildtree(nodes);
         System.out.println("inorder");
         inorder(root);



    }

}
