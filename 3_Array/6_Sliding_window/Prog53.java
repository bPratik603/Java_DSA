
// max sum of 4's sub array
public class Prog53 {
    public static void main(String[] args) {
                int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};

        int i=0;
        int k = 4;
        int maxSum = Integer.MIN_VALUE;
        int end = k-1;
        while (end<arr.length) {
            int sum =0;

            for(int x=i;x<=end;x++){
                sum = sum+arr[x];
            }

            if(maxSum < sum){
                maxSum = sum;
            }

            i++;
            end++;
        }

        System.out.println(maxSum);
    }
}
