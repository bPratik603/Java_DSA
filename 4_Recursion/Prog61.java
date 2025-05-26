//  sum of digit
 
 class Prog61 {
    
    int sum1(int num){

        int sum = 0,rem;

        while (num > 0) {
            rem = num % 10;
            sum = sum +rem;
            num = num/10;
        }

        return sum;
    }

    int sum =0;
    int sum2(int num){

        if(num == 0){
            return sum;
        }

        sum = sum+num%10;
        sum2(num/10);

        return sum;
    }

    int sum3(int num){

        if(num == 0){
            return 0;
        }

        return num%10 + sum3(num/10);
    }
    public static void main(String[] args) {
        
        Prog61 obj = new Prog61();

        int  num = 123;
        int res = obj.sum1(num);

        System.out.println("sum1() : "+res);

        res = obj.sum2(num);

        System.out.println("sum2() : "+res);

        
        res = obj.sum3(num);

        System.out.println("sum3() : "+res);
    }
}
