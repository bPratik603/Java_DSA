 class Prog29 {

    public static void main(String[] args) {
        
                int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

                int prefixSum[] = new int[arr.length];
        
                prefixSum[0] = arr[0];
                for(int i=1;i<arr.length;i++){
                    prefixSum[i] = prefixSum[i-1]+arr[i];
                }

                int maxSum = Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++){
                    for(int j=i;j<arr.length;j++){

                        int sum = 0;
                        if(i == 0){
                            sum = prefixSum[i];
                        }else{
                            sum = prefixSum[j]-prefixSum[i-1];
                        }

                        if(maxSum < sum){
                            maxSum = sum;
                        }
                    
                    }
                }

                System.out.println(maxSum);
    }
}
