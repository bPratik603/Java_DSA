 class Prog32 {

    public static void main(String[] args) {
        
        int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int startIdx = -1;
        int endIdx = -1;
        int x = -1;

        for(int i=0;i<arr.length;i++){
            if(sum == 0){
                x = i;
            }

            sum = sum +arr[i];
            if(sum > maxSum){
                maxSum = sum;
                startIdx = x;
                endIdx = i;
            }

            if(sum<0){
                sum = 0;
            }
        }

        for (int i = startIdx; i <= endIdx; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
