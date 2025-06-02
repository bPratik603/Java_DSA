// Selection sort

 class Prog73 {
    
    void sSort1(int arr[]){
 
        for(int i=0;i<arr.length-1;i++){
            
            int minIndex = i;

            for(int j = i+1;j<arr.length;j++){

                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }


    void sSort2(int arr[],int start,int n){

        if( start >= n-1)
           return;

           int minIndex = start;
        for(int j = start+1;j<arr.length;j++){
           
            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }

          
        }

          int tmp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = tmp;

        sSort2(arr,start+1,n);
    }
    public static void main(String[] args) {
        
        int arr[] = new int[]{1,4,3,6,7,2,9};

        Prog73 obj = new Prog73();

        // obj.sSort1(arr);

        obj.sSort2(arr,0,arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
