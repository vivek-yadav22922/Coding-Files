package LINKEDLIST;

public class ReverselinkedLiist {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next= null;
        }
    }

    public void addelement(String data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void PrintLinkedList() { // this method used for print element//
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");

            currNode = currNode.next;// traverse
        }
        System.out.println("null");


    }

    public void Reverselist(){   // here use three pointer prev, current ,next //
     if(head==null || head.next==null ){
         return;
     }
     Node preNode=head;
     Node currNode=head.next;
     while (currNode != null){
         Node nextNode=currNode.next;// yaha pay hamay next node may current node k baad wala element ko store karana padayga//
         currNode.next=preNode;// here hamm reverse kar daygay ek ek karkay//
         // update//

         preNode= currNode;
         currNode= nextNode;
     }
     head.next=null;
     head=preNode;

    }

    static void main(String[] args) {
        ReverselinkedLiist list= new ReverselinkedLiist();
        list.addelement("list");
        list.addelement("a");
        list.addelement("is");
        list.addelement("this");

        list.PrintLinkedList();

        list.Reverselist();
        list.PrintLinkedList();
    }
}
