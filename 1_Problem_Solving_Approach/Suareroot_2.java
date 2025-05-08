// Square root using binary search approach
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Suareroot_2 {
    static int getSqrt(int num){
        int low = 1;
        int high = num;
        int mid;
        int sqrt = 0;
        while (low <= high) {
            mid = (low+high)/2;
            
            if(mid == num){
                high = mid-1;
            }else if(mid*mid < num){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return sqrt;
    }
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter Number");
        int num = Integer.parseInt(br.readLine()); 
        int sqrt = getSqrt(num);

        System.out.println("Square root = "+sqrt);
    }
}
