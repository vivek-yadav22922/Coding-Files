package LINKEDLIST;

public class DeleteATbegANDend {
    Node head;

    private int size;  //for size
    DeleteATbegANDend(){
      this.size=size;
    }



    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }


    }
        // add node at begning //
        public void addBEBNING(String data){
        Node Newnode= new Node(data);

        if(head==null){
            head=Newnode;
            return;
        }
            Newnode.next=head;
             head= Newnode;
    }

    // insert node at last //

    public void  addLAST(String data){
        Node Newnode= new Node(data);
        if(head== null){
            head= Newnode;
            return;
        }
        Node currNode=head;
        while (currNode.next !=null){
           currNode= currNode.next;
        }
        currNode.next=Newnode;
    }

    //printelement//

    public void PrintElement(){
        if(head== null){
            System.out.println("list is empty");
            return;
        }
        Node currNode= head;

        while (currNode !=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;

        }
        System.out.println("null");

    }
    public void Deletebegninning(){  // delete method start here//
        if(head== null){
            System.out.println("list is empty");
            return;

        }
        size--;
       head=head.next;

    }
    public void DeleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;

        }
        size--;
        if (head.next == null) {
            head = null;
            return;

        }
        Node SecondLast= head;
        Node last= head.next;
        while (last.next!= null){
            last= last.next;
            SecondLast=SecondLast.next;

        }
        SecondLast.next=null;

    }

    public int getSize(){
        return size;
    }

    static void main(String[] args) {
        DeleteATbegANDend list = new DeleteATbegANDend();
        list.addBEBNING("a");
        list.addBEBNING("is");
        list.addBEBNING("this");
        list.PrintElement();
        System.out.println(list.getSize());


        list.addLAST("list");
        list.PrintElement();
        System.out.println(list.getSize());

        list.Deletebegninning();
        list.PrintElement();
        System.out.println(list.getSize());


        list.DeleteLast();
        list.PrintElement();
        System.out.println(list.getSize());



    }

    }



