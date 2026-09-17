package TreeRelatedQuestion;

public class postorder {
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
    public static void postorde(Node root) {
        if (root == null) {
            return;
        }
        postorde(root.left);
        postorde(root.right);
        System.out.println(root.data);

    }


    void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildtree(nodes);
        System.out.println("postorder");
        postorde(root);

    }
}