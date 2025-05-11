 class Prog5 {
    
    static void rev(int arr[],int size){
       
        int n = size-1;
        for(int i=0;i<size/2;i++){
            int tmp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = tmp;
        }

    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{8,4,1,3,9,2,6,7};
        int size = 8;


        rev(arr,size);

       for(int i=0;i<size;i++){
        System.out.println(arr[i]);
       }
    }
}
