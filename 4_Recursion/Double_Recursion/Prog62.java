
 class Prog62 {
    
    int fun(int num){
        if(num <=1){
            return 1;
        }

        return fun(num-2) + fun(num-1);
    }
    public static void main(String[] args) {
        

        Prog62 obj = new Prog62();

         int res = obj.fun(5);

         System.out.println(res);
    }
}
