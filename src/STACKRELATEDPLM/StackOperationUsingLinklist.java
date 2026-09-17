package STACKRELATEDPLM;

public class StackOperationUsingLinklist {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public  class stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }
        // push() operation//

        public void push(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        // pop() operation //

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }
// peek() operation //
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;

        }
    }

        public void main(String[] args) {
            stack s= new stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);

            while (!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
      }


