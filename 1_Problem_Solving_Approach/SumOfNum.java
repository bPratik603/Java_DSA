import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class SumOfNum{

    static int getSum(int num){
        int sum = num*(num+1)/2;

        return sum;
    }

    public static void main(String[] args) throws IOException{
       
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter Number");
        int num = Integer.parseInt(br.readLine()); 

        int sum = getSum(num);
        System.out.println("Sum = "+sum);
    }

}