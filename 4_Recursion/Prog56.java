// 1 to num , number print

class Prog56{

    void numPrint(int num){
  
        if(num == 0){
            return;
        }
            numPrint(num-1);
            System.out.println(num);

    }
    public static void main(String[] args) {
        
        Prog56 obj = new Prog56();
        int num = 10;
        obj.numPrint(num);
    }
}