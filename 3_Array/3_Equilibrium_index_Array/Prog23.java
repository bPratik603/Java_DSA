
 class Prog23 {
    
    static int getEuilibriumIndex(int arr[]){

        int sumL = 0;
        int sumR = 0;        
        for(int i=0;i<=arr.length;i++){
            
            sumL = 0;
            sumR = 0;
    
            for(int j=0;j<i;j++){
                sumL = sumL+arr[j];
            }

            for(int j = i+1;j<arr.length;j++){
                sumR = sumR+arr[j];
            }

            if(sumL == sumR){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{-7,1,5,2,-4,3,0};
                // int arr[] = new int[]{1,2,3};


        System.out.println(getEuilibriumIndex(arr));
    }
}
