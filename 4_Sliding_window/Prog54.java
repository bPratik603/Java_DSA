
// max sum of 4's sub array using prefix sum
public class Prog54 {
    public static void main(String[] args) {
                int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};

        int maxSum = Integer.MIN_VALUE;
        int K = 4;
        int i = 0;
        int end = K-1;

        int prefixSum[] = new int[arr.length];

       prefixSum[0] = arr[0];
       for(int x=1;x<arr.length;x++){
         prefixSum[x] = prefixSum[x-1]+arr[x];
       }

        while (end<arr.length) {
            
            int sum = 0;

            if(i == 0){
                sum = prefixSum[i];
            }else{
                sum = prefixSum[end] - prefixSum[i-1];
            }

            if(maxSum<sum){
                maxSum = sum;
            }

            i++;
            end++;
        }
        
        System.out.println(maxSum);
    }
}
