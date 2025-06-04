// Quick sort

import java.util.Arrays;

class Prog76 {
    
    int partition(int arr[],int start,int end){

        int pivote = arr[end];
        int i = start-1;

        for(int j = start;j<end;j++){
            if(arr[j] < pivote){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = tmp;

        return i+1;
    }

    void Quick_sort(int arr[],int start,int end){

        if(start<end){
            int pivote = partition(arr,start,end);
            Quick_sort(arr,start,pivote-1);
            Quick_sort(arr,pivote+1,end);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = new int[]{9,7,8,2,1,3,6,4};

        int start = 0;
        int end = arr.length-1;

        Prog76 obj = new Prog76();

        obj.Quick_sort(arr,start,end);

        System.out.println(Arrays.toString(arr));
    }
}
