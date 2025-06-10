// Stack implementation using array


class Stack{

    int maxSize;
    int stackArr[];
    int top = -1;

    Stack(int size){
        this.stackArr = new int[size];
        this.maxSize = size;
    }

    void push(int data){

        if(top == maxSize-1){
            System.out.println("Stack Overflow...!");
            return;
        }else{
          top++;

          stackArr[top] = data;
        }
    }

    int pop(){

        if(empty()){
            System.out.println("Empty Stack...!");
            return -1;
        }else{
          int val = stackArr[top];
          top--;
          return val;
        }
    }

    int peek(){

        if(top == -1){
            System.out.println("Empty Stack...!");
            return -1;
        }else{
            return stackArr[top];
        }
    }
    boolean empty(){
        if(top == -1)
        return true;
        else
         return false;
    }
    void printAll(){

        if(empty()){
            System.out.print("Stack is Empty...!");
        }else{
            System.out.print("[ ");
            for(int val = 0;val<=top;val++){
                System.out.print(stackArr[val]+" ");
            }
            System.out.println(" ]");
        }
    }
}



class Prog81 {
    
    public static void main(String[] args){

       Stack s = new Stack(3);

       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);
       s.printAll();

        int val = s.pop();
        if(val != -1){
            System.out.println(val);
        }

        
        // val = s.pop();
        // if(val != -1){
        //     System.out.println(val);
        // }

        // val = s.pop();
        // if(val != -1){
        //     System.out.println(val);
        // }

        // val = s.pop();
        // if(val != -1){
        //     System.out.println(val);
        // }

        val = s.peek();
        if(val != -1){
            System.out.println(val);
        }

        val = s.peek();
        if(val != -1){
            System.out.println(val);
        }

        s.printAll();
    }
}
