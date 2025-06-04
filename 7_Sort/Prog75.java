// Merge sort

class Prog75 {

    void merge(int arr[],int start,int mid,int end){

        int n1 = mid-start+1;
        int n2 = end-mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i=0;i<arr1.length;i++){
            arr1[i] = arr[start+i];
        }

        for(int j=0;j<arr2.length;j++){
            arr2[j] = arr[mid+1+j];
        }

        int i=0,j=0,k=start;

        while(i<arr1.length && j<arr2.length){
            
            if(arr1[i] <arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }

            k++;
        }

        while(i<arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            arr[k]  = arr2[j];
            j++;
            k++;
        }
    }
    
    void mergeSort(int arr[],int start,int end){

        if(start < end){
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = new int[]{9,7,8,2,1,3,6,4};

        int start = 0;
        int end = arr.length - 1; 

        Prog75 obj = new Prog75();

        obj.mergeSort(arr,start,end);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
