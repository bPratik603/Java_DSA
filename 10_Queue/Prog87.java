// Queue implementaion using Array


class demoQueue{

    int[] queueArr;
    int front;
    int rear;
    int maxSize;

    demoQueue(int size){
        queueArr = new int[size];
        front = -1;
        rear = -1;
        maxSize = size;
    }

    void enqueue(int data){

        if(rear == maxSize-1){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1){

            front = rear = 0;
        }else{
            rear++;
        }

        queueArr[rear] = data;
    }

   int dequeue(){
      
       if(front == -1){
         System.out.println("Queue is empty");
         return -1;
       }else{
        int val = queueArr[front];
        front++;
        return val;
        
       }
   }

   boolean isEmpty(){

       if(front == -1){
        return true;
       }else{
        return false;
       }
   }

   int front(){

      if(front == -1){
        System.out.println("Queue is empty");
        return -1;
      }else{
        return queueArr[front];
      }
   }

   int rear(){

    if(front == -1){
        System.out.println("Queue is empty");
        return -1;
    }else{
        return queueArr[rear];
    }
   }

    void printAll(){

        if(front == -1){
            System.out.println("Queue is empty");
        }else{
           for(int i = front;i<=rear;i++){
            System.out.print(queueArr[i]+" ");
           }
        }
        System.out.println();
    }
}
class Prog87 {
    
    public static void main(String[] args) {
        
        demoQueue q = new demoQueue(4);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        q.printAll();

        System.out.println(q.dequeue());

        q.printAll();

        System.out.println(q.isEmpty());

        System.out.println(q.front());

        System.out.println(q.rear());
    }
}
