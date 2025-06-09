// find mid of Linked List

class Node{

    int data;
    Node next = null;

    Node(int data){

        this.data = data;

    }
}

 class LinkedList {

    Node head = null;

     void addLast(int data){
    
        Node newNode = new Node(data);

         if(head == null){
           head = newNode;
        }else{
            Node tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }

            tmp.next = newNode;
         }
    }


    int findMid1(){

        int length = countNode();
        int count = 0;

        Node tmp = head;
        while (count < length/2) {

            tmp = tmp.next;
            count++;
            
        }

        return tmp.data;
    }

    int findMid2(){
        
      if(head == null){
        return 0;
      }else{

        Node slow = head;
        Node fast = head.next;
    
        while (fast != null) {

            fast = fast.next;
            if(fast != null){
                fast = fast.next;
            }

            slow = slow.next;
        }

        return slow.data;
      }

    }
    int countNode(){

        if(head == null){
            System.out.println("Empty List");
            return 0;
        }else{

            Node tmp = head;
             int count = 0;
            while (tmp != null) {

                tmp = tmp.next;
                count++;
                
            }

            return count;
        }
    }

    void printAll(String msg){

        if(msg != ""){
            System.out.println(msg);
        }

        if(head == null){
            return;
        }else{

            Node tmp = head;

            while (tmp.next != null) {
                System.out.print(tmp.data+"->");
                tmp = tmp.next;
            }

            System.out.println(tmp.data);
        }

    }
}

class Prog80 {
    
    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.printAll("addLast()");

        System.out.println("findMid() using Iteration approch\n"+ll.findMid1());
        
        System.out.println("findMid() using slow and fast pointer approch\n"+ll.findMid2());

    }
   
}
