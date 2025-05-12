 class Prog10 {
    
    static void getEvenCount(int arr[]){
     
        int count;

        for(int i=0;i<arr.length;i++){
            count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(arr[i]);
            }
        }
        
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{1,1,2,3,3,4,5,5};

        getEvenCount(arr);

    }
}
