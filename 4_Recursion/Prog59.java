 class Prog59 {

    int fun(int num){

        if(num == 1){
            return 1;
        }

        return fun(--num)+3;
    }

    public static void main(String[] args) {
        
        System.out.println("Start Main");

        Prog59 obj = new Prog59();
        int ret = obj.fun(2);
        System.out.println(ret);
        System.out.println("End Main");
    }
}
