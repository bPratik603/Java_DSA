
 class Prog3 {
    
    static void getNum(int arr[],int size){

        for(int i=1;i<size;i++){
            int tmp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > tmp){
                arr[j+1] = arr[j];
                 j--;
            }

            arr[j+1] = tmp;
        }

        System.out.println("smallest num = "+arr[0]+" largest num = "+arr[size-1]);
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{3,2,1,56,10000,167};
        int size = 6;

        getNum(arr, size);
    }
}
