package BinarySearchtreeRelatedQuestion;
class searchkeyvalue {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node root, int val) {
        if (root == null) {
            return root = new Node(val);
        }
        if (root.data > val) {
            // left subtree //
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);//right subtree //
        }
        return root;
    }

//    public static void inorder(Node root) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left);
//        System.out.println(root.data);
//        inorder(root.right);
//    }

    public static boolean search(Node root,int key){
        if(root== null){
            return false;

        }
        if(root.data>key){
            return search(root.left,key);
        }
        if(root.data== key){
            return true;
        }
        else{
            return search(root.right,key);

        }
    }

    public void main() {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
            if(search(root,7)) {
                System.out.println("found");
            }
                else{
                    System.out.println("not found");
                }

            }
        }







