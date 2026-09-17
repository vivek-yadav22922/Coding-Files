package TreeRelatedQuestion;

public class BinaryTreeyt {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left= null;
            this.right=null;
        }
    }

    public class BinaryTree {
        static int idx = -1;  // starting may index -1 hota hai//

        public static Node BuildTree(int nodes[]) {  // here return node //
            idx++;
            if (nodes[idx] == -1) {
                 return null;
            }

            Node newNode= new Node(nodes[idx]);
            newNode.left=BuildTree(nodes); //firstly create left sub tree and then create right sub tree//
            newNode.right=BuildTree(nodes);
            return newNode;



        }

    }

    public void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.BuildTree(nodes);
        System.out.println(root.data);

    }
        }




