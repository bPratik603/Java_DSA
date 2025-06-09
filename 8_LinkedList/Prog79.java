// Reverse Singly Linked list

class Node {

    Node prev = null;
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {

    Node head = null;

    void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void revList1(){

        if(head == null){
            System.out.println("Empty List");
            return;
        }

        Node prev = null;
        Node curr = head;
        Node forward = null;

        while (curr != null) {

            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        head = prev;
    }

    void revList2(Node prev,Node curr){

        if(curr == null){
            head = prev;
            return;
        }else{

            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        revList2(prev,curr);


    }

    int countNode() {

        if (head == null) {
            System.out.println("Empty List");
            return 0;
        } else {

            Node tmp = head;

            int count = 0;
            while (tmp != null) {
                tmp = tmp.next;
                count++;
            }

            return count;
        }
    }

    void printAll(String msg) {

        if (msg != "") {
            System.out.println(msg);
        }

        if (head == null) {
            System.out.println("List is empty");
        } else {

            Node tmp = head;

            while (tmp != null) {
                if (tmp.next != null) {
                    System.out.print(tmp.data + "->");
                } else {
                    System.out.print(tmp.data);
                }

                tmp = tmp.next;
            }
            System.out.println();
        }

    }
}

class Prog79 {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.printAll("addFrist()");

        ll.revList1();
        ll.printAll("revList1()");

        Node prev = null;
        ll.revList2(prev,ll.head);
        ll.printAll("revList2()");
    }

}
