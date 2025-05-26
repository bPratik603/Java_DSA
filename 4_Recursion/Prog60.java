//  sum of number
 
 class Prog60 {

    int sum1(int num){
        
        int sum = 0;
        for(int i=1;i<=num;i++){
           sum = sum + i;
        }

        return sum;
    }

    int sum2(int num){

        if(num == 1){
            return 1;
        }

        return num+sum2(--num);
    }

    public static void main(String[] args) {
        
        int num = 5;

        Prog60 obj = new Prog60();

        int res = obj.sum1(num);

        System.out.println("sum1() : "+res);

        res = obj.sum2(num);

        System.out.println("sum2() : "+res);
    }
}
