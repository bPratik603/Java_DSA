
 class Prog4 {
    
    static void getNum(int arr[],int size){

       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
           if(arr[i] > max){
            max = arr[i];
           }   

           if(arr[i] < min){
            min = arr[i];
           }
        }
        System.out.println("smallest num = "+min+" largest num = "+max);
    }
 
    public static void main(String[] args) {
        
        int arr[] = new int[]{3,2,1,56,999,167};
        int size = 6;

        getNum(arr, size);
    }
}
