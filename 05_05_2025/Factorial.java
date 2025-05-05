class Factorial{
    public static void main(String[] args){
       int count = 0;
       
       count = fact(15);
        
         System.out.println("Total Number of Factorial  = "+count);
    }

  static int fact(int num){
  int count = 0;
    for(int i=1;i<=num;i++){
        if(num % i == 0){
            count++;
        }
     }
     return count;
  }
}

