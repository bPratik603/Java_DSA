public class Numdifferance_1 {
   
    static int getDifferance(int start,int end){

        int count = 0;

        for(int i = start;i<=end;i++){
            count++;
        }

        return count;
    }

    public static void main(String[] args){

        int differance = getDifferance(5, 10);

        System.out.println(differance);
    }
}
