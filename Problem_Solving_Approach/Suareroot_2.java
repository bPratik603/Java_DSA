// Square root using binary search approach

public class Suareroot_2 {
    
    static int getSqrt(int num){
        int low = 1;
        int high = num;
        int mid;
        int sqrt = 0;
        while (low <= high) {
            mid = (low+high)/2;
            
            if(mid*mid > num){
                high = mid-1;
            }else if(mid*mid < num){
                low = mid+1;
            }else{
               sqrt = mid;
            }
        }
        return sqrt;
    }

    public static void main(String[] args){
        int num = 100;

        int sqrt = getSqrt(num);

        System.out.println("Square root = "+sqrt);
    }
}
