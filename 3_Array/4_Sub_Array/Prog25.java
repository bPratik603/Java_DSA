 class Prog25 {

    public static void main(String[] args) {
        
        int arr[] = new int[]{1,2,3,1,2,4,6,4,3};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minLength = Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == min){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j] == max){
                        if(minLength > j-i+1){
                            minLength = j-i+1;
                        }
                    }
                }
            }else if(arr[i] == max){
                for(int j=i+1;j<arr.length;j++){
                   if(arr[j] == min){
                       if(minLength > j-i+1){
                          minLength = j-i+1;
                       }
                   }
                }
            }
        }

        System.out.println("Min Length = "+minLength);
     }
}
