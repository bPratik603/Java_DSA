//create Two stacks using one array

class TwoStack{

    int stackArr[];
    int maxSize;
    int top1;
    int top2;

    TwoStack(int size){

        stackArr = new int[size];
        maxSize = size;
        top1 = -1;
        top2 = size;
    }

    void push1(int data){

        if(top2-top1 > 1){
            top1++;
            stackArr[top1] = data; 
        }else{
            System.out.println("Stack overflow ...!");
        }
    }

    void push2(int data){

        if(top2-top1 > 1){
            top2--;
            stackArr[top2] = data;
        }else{
            System.out.println("Stack overflow");
        }
    }

    int peek1(){

        if(top1 == -1){
            System.out.println("Stack underflow");
            return -1;
        }else{
            return stackArr[top1];
        }
    }

    int peek2(){

        if(top2 == maxSize){
            System.out.println("Stack underflow");
            return -1;
        }else{
            return stackArr[top2];
        }
    }

    int pop1(){

        if(top1 == -1){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int val = stackArr[top1];
            top1--;
            return val;
        }
    }

    int pop2(){

        if(top2 == maxSize){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int val = stackArr[top2];
            top2++;
            return val;
        }
    }

    void printStack1(){

        if(top1 == -1){
            System.out.println("Empty stack");
        }else{
            for(int i=0;i<=top1;i++){
                System.out.print(stackArr[i]+" ");
            }
            System.out.println();

        }
    }

    void printStack2(){

        if(top2 == maxSize){
            System.out.println("Empty Stack");
            
        }else{
            for(int i=top2;i<maxSize;i++){
              System.out.print(stackArr[i]+" ");
            }

            System.out.println();
        }
    }
}



class Prog83 {
    public static void main(String[] args) {
        
        TwoStack s = new TwoStack(5);

        s.push1(10);
        s.push1(20);
        s.push1(30);
        // s.push1(40);
        // s.push1(50);
        // s.push1(60);
        s.printStack1();

        s.push2(11);
        s.push2(12);
        s.printStack2();

        // System.out.println(s.peek1());
        // System.out.println(s.peek2());

        System.out.println(s.pop1());
        System.out.println(s.pop2());

                s.printStack1();
                        s.printStack2();


    }
}
