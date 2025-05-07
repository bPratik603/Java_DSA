import java.util.Scanner;

public class Squareroot {

    static int getSquare(int num){
        int square = 0;
      for(int i=1;i*i<=num;i++){
          if(i*i == num){
             square = i;
          }
      }

      return square;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        int square = getSquare(num);

        System.out.println("Square root of "+num+" is "+square);
    }
}