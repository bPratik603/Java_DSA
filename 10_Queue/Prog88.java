// Circular Queue


class demoQueue{

    int[] queueArr;
    int front;
    int rear;
    int maxSize;

   demoQueue(int size){
     this.queueArr = new int[size];
     front = -1;
     rear = -1;
     maxSize = size;
   }

   void enqueue(int data){

      if((front == 0 && rear == maxSize-1) || ((rear+1)%maxSize == front)){
             System.out.println("Queue is full...!");
             return;
      }else if(front == -1){
        rear = front = 0;
      }else if(rear == maxSize-1 && front != 0){
         rear = 0;
      }else{
        rear ++;
      }

      queueArr[rear] = data;
   }


   int dequeue(){

      if(front == -1){
        System.out.println("Queue is empty");
        return -1;
      }else{

        int val = queueArr[front];

        if(front == rear){
            rear = front = -1;
        }else if(front == maxSize-1){
            front = 0;
        }else{
            front++;
        }

        return val;
      }


   }
   void printAll(){

      if(front == -1){
         System.out.println("Queue is empty");
         return;
      }
      
      if(front <= rear){
          for(int i=front;i<=rear;i++){
            System.out.print(queueArr[i]+" ");
          }
      }else{
         
         for(int i=front;i<maxSize;i++){
            System.out.print(queueArr[i]+" ");
         }

         for(int i=0;i<=rear;i++){
            System.out.print(queueArr[i]+" ");
         }
      }

      System.out.println();
   }
}
class Prog88 {
    
    public static void main(String[] args) {
        
        demoQueue q = new demoQueue(4);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        // q.enqueue(50);

        q.printAll();

        System.out.println(q.dequeue());
                q.printAll();

           System.out.println(q.dequeue());
                q.printAll();

        
       q.enqueue(11);
       q.enqueue(12);
              q.printAll();

       q.enqueue(13);
       q.enqueue(14);



    }
}
