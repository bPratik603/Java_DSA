// Binary search using recursion

public class Prog70 {
    
    int bSearch(int arr[],int start,int end,int search){

        if(start > end){
            return -1;
        }else{
            int mid = (start+end)/2;
            if(arr[mid] == search){
                return mid;
            }

            if(arr[mid] > search){
                return bSearch(arr, start, mid-1, search);
                // end = mid-1;
            }else{
                return bSearch(arr, mid+1, end, search);
                // start = mid+1;
            }
        }

        
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
