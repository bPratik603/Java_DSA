 class Prog6 {
    
    static void rev(int arr[],int size){
       
      int i = 0;
      int j = size-1;

      while(i<j){
         int tmp = arr[i];
         arr[i] = arr[j];
         arr[j] = tmp;

         i++;
         j--;
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
