// Binary search

public class Prog69 {
    
    int bSearch(int arr[],int search){

        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            
            int mid = (start+end)/2;

            if(arr[mid] == search){
                return mid;
            }else if(arr[mid] > search){
                end = mid-1;
            }else{
                start = mid+1;
            }

         
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{1,2,3,4,5,6};

        Prog69 obj = new Prog69();

        int search = 1;

        int res = obj.bSearch(arr, search);

        if(res != -1){
            System.out.println("element found at index "+res);
        }else{
            System.out.println("Element not present in array");
        }
    }
}
