// Singly Linked List

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head = null;

    void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    void addAtPosition(int pos, int data) {

        if (pos > countNode() + 2 || pos <= 0) {
            System.out.println("Wrong Input...!");
            return;
        }

        if (pos == 1) {
            addFirst(data);
        } else if (pos == countNode() + 1) {
            addEnd(data);
        } else {
            Node newNode = new Node(data);

            Node tmp = head;

            while (pos - 2 != 0) {

                tmp = tmp.next;
                pos--;
            }

            newNode.next = tmp.next;
            tmp.next = newNode;

        }

    }

    void deleteFirst(){

        if(head == null){
            System.out.println("Empty List");
            return;
        }

        if(countNode() == 1){
            head = null;
        }else{
         head = head.next;
        }
    }

    void deleteLast(){

        if(head == null){
            System.out.println("Empty List");
            return;
        }

        if(countNode() == 1){
            head = null;
        }else{
            Node tmp = head;

            while(tmp.next.next != null){
                tmp = tmp.next;
            }

            tmp.next = null;
        }

    }

    void deleteAtPos(int pos){

        if(pos <= 0 || pos > countNode()+2){
            System.out.println("Wrong Input");
        }

        if(pos == 1){
            deleteFirst();
        }else if(pos == countNode()+1){
            deleteLast();
        }else{
            Node tmp = head;

            while (pos-2 != 0) {
                tmp = tmp.next;
                pos--;
            }

            tmp.next = tmp.next.next;
        }
    }
    int countNode() {

        Node tmp = head;

        if (tmp == null) {
            return -1;
        }

        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }

        return count;
    }

    void printAll(String msg) {

        if (msg != "") {
            System.out.println(msg);
        }
        if (head == null) {
            System.out.println("LinkedList is empty...!");
        } else {

            Node tmp = head;

            while (tmp != null) {
                if (tmp.next != null)
                    System.out.print(tmp.data + "->");
                else {
                    System.out.print(tmp.data);
                }
                tmp = tmp.next;
            }
        }

        System.out.println();
    }
}

class Prog77 {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        // ll.printAll("Add First");

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);

        ll.printAll(" Add Start");

        ll.addEnd(100);
        ll.addEnd(200);

        ll.printAll(" Add End");

        ll.addAtPosition(4, 15);

        ll.printAll(" Add At Position");

        ll.deleteFirst();
        ll.printAll("delete First");

        ll.deleteLast();
        ll.printAll("delete Last");

        ll.deleteAtPos(3);
        ll.printAll("delete At Position");

    }
}
