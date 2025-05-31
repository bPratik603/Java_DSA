// Bubble sort

public class Prog71 {
    
    void bSort1(int arr[]){

        int count = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                count++;
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("Iterations = "+count);
    }

    void bSort2(int arr[]){

        int count = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                 count++;
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("Iterations = "+count);
    }

     void bSort3(int arr[]){

        int count = 0;

       boolean swapped;
       for (int i = 0; i < arr.length-1; i++) {
        
                swapped = false;
             for (int j = 0; j < arr.length-i-1; j++) {
                  count++;
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped  = true;
                }
             }

             if(!swapped){
                break;
             }
           
       }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("Iterations = "+count);
    }

    int count = 0;
    void bSort4(int arr[],int n){

        if(count == 1){
            return;
        }

        boolean swapped = false;
        for(int j=0;j<n-1;j++){
            count++;
            if(arr[j] > arr[j+1]){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                swapped = true;
            }
        }

        if(swapped == false)
          return;

        bSort4(arr, n-1);
     
    }
    public static void main(String[] args) {
        
        int arr[] = new int[]{7,3,9,4,2,5,6};
        // int arr[] = new int[]{2,3,4,5,6,7,9};

        Prog71 obj = new Prog71();

        // obj.bSort1(arr);

        // obj.bSort2(arr);

        int n = arr.length;
        obj.bSort4(arr,n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("Iterations "+obj.count);
    }
}
