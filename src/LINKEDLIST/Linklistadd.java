package LINKEDLIST;

public class Linklistadd {
    Node head;

        class Node {
            String data;
            Node next;

            Node(String data) {
                this.data = data;
                this.next = null;

            }
        }
            // insert node at behning//
            public void InsertAtbegning(String data) {

                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

            // insert node at last//
            public void InsertNodeAtlast(String data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    return;
                }

                Node currNode = head;
                while (currNode.next != null) {

                    currNode = currNode.next;// traverse
                }
                currNode.next = newNode;


            }

            public void PrintLinkedList() { // this method used for print element//
                if (head == null) {
                    System.out.println("list is empty");
                    return;
                }
                    Node currNode = head;
                    while (currNode != null) {
                        System.out.print(currNode.data + " -> ");

                        currNode = currNode.next;// traverse
                    }
                    System.out.println("null");


                }




        public static void main(String[] args) {
            Linklistadd list = new Linklistadd();
           list.InsertAtbegning("A");
            list.InsertAtbegning("B");
            list.InsertAtbegning("C");
            list.InsertAtbegning("D");
             //PRINT//
            list.PrintLinkedList();
            //IsertAt Last//
            list.InsertNodeAtlast("E");
            list.InsertNodeAtlast("F");
            list.PrintLinkedList();

        }
    }

