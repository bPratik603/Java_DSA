// Factorial

// note - zero's factorial is 1
public class Prog64 {
    
    int fact(int num){
        if(num == 0){
            return 1;
        }

        return num*fact(num-1);
    }

    public static void main(String[] args) {
        
        Prog64 obj = new Prog64();

        int res = obj.fact(5);

        System.out.println(res);
    }
}
