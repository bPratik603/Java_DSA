import java.util.Scanner;

class Prog11 {
    
    static void getRangeSum(int arr[],int Q){


        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i=0;i<Q;i++){

            int startIndex = sc.nextInt();
            int endIndex = sc.nextInt();

            if(startIndex == 0){
                sum = arr[startIndex];
            }else{
                sum = arr[endIndex] - arr[startIndex-1];
            }

            System.out.println(sum);

        }

    }

    public static void main(String[] args){

        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int Q = 3;

        getRangeSum(arr, Q);
    }
}
