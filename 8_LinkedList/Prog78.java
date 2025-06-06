// Doubly LinkedList

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

    void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(int data) {

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

    void addAtPos(int pos, int data) {

        if (pos <= 0 && pos > countNode() + 2) {
            System.out.println("Wrong Input");
            return;
        }

        if (pos == 1) {
            addFirst(data);
        } else if (pos == countNode() + 1) {
            addLast(data);
        } else {

            Node newNode = new Node(data);
            Node tmp = head;
            while (pos - 2 != 0) {
                tmp = tmp.next;
                pos--;
            }

            newNode.next = tmp.next;
            newNode.prev = tmp;
            tmp.next.prev = newNode;
            tmp.next = newNode;
        }
    }

    void deleteFirst() {

        if (head == null) {
            System.out.println("Empty List");
        } else if (countNode() == 1) {

            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void deleteLast() {

        if (head == null) {
            System.out.println("Empty List");
        } else if (countNode() == 1) {
            head = null;
        } else {

            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }

            tmp.prev.next = null;
            tmp.prev = null;

        }

    }

    void deleteAtPos(int pos) {

        if (pos <= 0 || pos > countNode() + 1) {
            System.out.println("Wrong Input");
            return;
        }

        if (pos == 1) {
            deleteFirst();
        } else if (pos == countNode()) {
            deleteLast();
        } else {

            Node tmp = head;

            while (pos - 2 != 0) {
                tmp = tmp.next;
                pos--;
            }

            tmp.next.next.prev = tmp;
            tmp.next = tmp.next.next;

          
        

        }
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

class Prog78 {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.printAll("addFrist()");

        ll.addLast(15);
        ll.addLast(16);
        ll.addLast(17);
        ll.printAll("addLast()");

        ll.addAtPos(3, 100);
        ll.printAll("addAtPos()");

        ll.deleteFirst();
        ll.printAll("deleteFirst()");

        ll.deleteAtPos(3);
        ll.printAll("deleteAtPos()");
    }

}
