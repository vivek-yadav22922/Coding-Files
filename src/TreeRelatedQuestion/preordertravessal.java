package TreeRelatedQuestion;

public class preordertravessal {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data) { // constructor //
            this.data = data;
            this.left = null;
            this.right = null;
        }
        }
        public class binarytree{
           static int idx = -1;
            public  Node buildtree(int node[]){
               idx++;
                if(node[idx]== -1){
                    return null;

                }
                 Node newNode= new Node(node[idx]);
                  newNode.left = buildtree(node);// here create left subtree recursively//
                  newNode.right= buildtree(node); // here create right subtree recursively//
                  return newNode;



            }

        }
        public static void preorder(Node root){
        if(root==null){
            return;
        }
            System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

        }


        public void main(String[] args) {

            int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            binarytree tree= new binarytree();
            Node root= tree.buildtree(nodes);
           // System.out.println(root.data);
            System.out.println("preorder of tree");
            preorder(root);
        }
     }




