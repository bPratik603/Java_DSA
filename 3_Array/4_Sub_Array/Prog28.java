
class Prog28 {

    public static void main(String[] args) {
        
        int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum = sum + arr[k];
                }

                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
