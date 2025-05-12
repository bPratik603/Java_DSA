
 class Prog7 {
    
    static int replace(int num,int oldData,int newData){

      int newNum = 0;
      int place = 1;
      int digit;
      while(num > 0){
        digit = num%10;
        if(digit == oldData){
            digit = newData;
        }

        newNum = newNum + (digit * place);
        place = place * 10;
        num = num/10;
      }

      return newNum;
    }

    public static void main(String[] args) {
        
        int num = 1001;

        System.out.println(replace(num, 0, 5));
    }
}
