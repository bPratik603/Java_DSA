import java.util.Scanner;

class Prog10 {
    
    static void getPrefixSum(int arr[],int Q){
    
        int psArr[] = new int[arr.length ];
          
        psArr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            psArr[i] = psArr[i-1]+arr[i];
        }

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<Q;i++){
            int startIndex = sc.nextInt();
            int endIndex = sc.nextInt();

            if(startIndex == 0){
                 sum = psArr[endIndex];
            }else{
                sum = psArr[endIndex] - psArr[startIndex-1];
            }

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int Q = 3;
        getPrefixSum(arr,Q);
    }
}
