 class Prog57 {

    void numPrint(int num){

        if(num == 0){
            return;
        }

        System.out.println(num);
        numPrint(--num);
    }
    public static void main(String[] args){

        int num = 10;

        Prog57 obj = new Prog57();
        obj.numPrint(num);
    }
}
