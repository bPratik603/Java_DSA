
 class Prog24 {
    
    static int getEquilibriumIndex(int arr[]){

        int totalSum = 0;
        int leftSum = 0;

        for(int i=0;i<arr.length;i++){
           totalSum = totalSum+arr[i];
        }

        for(int i=0;i<arr.length;i++){

            totalSum = totalSum - arr[i];

            if(leftSum == totalSum){
                return i;
            }

            leftSum = leftSum + arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        
        // int arr[] = new int[]{-7,1,5,2,-4,3,0};
                int arr[] = new int[]{1,2,3};


        System.out.println(getEquilibriumIndex(arr));
    }
}
