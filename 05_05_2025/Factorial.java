class Factorial{
    public static void main(String[] args){

        int count = 0;
        int num = 15;

         for(int i=1;i<=num;i++){
            if(num % i == 0){
                count++;
                System.out.println(i);
            }
         }

         System.out.println("Total Number of Factorial  = "+count);
    }
}