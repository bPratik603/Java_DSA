
 class Prog8 {
    
    static int getMax(int arr[],int size,int num){

       for(int i=1;i<size;i++){

         int tmp = arr[i];
         int j = i-1;

         while(j>=0 && arr[j] > tmp){
            arr[j+1] = arr[j];
            j--;
         }

         arr[j+1] = tmp;

       }

       return arr[size-num];
    }

    
    public static void main(String[] args) {
        
        int arr[] = new int[]{8,4,1,3,9,2,6,7};
        int size = 8;
        int num = 3;
        System.out.println(getMax(arr, size,num));
    }

}
