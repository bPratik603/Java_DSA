
 class Prog2 {
    static int find(int arr[],int size,int searchNum){

        int low = 0;
        int high = size-1;
        int mid;
        while (low<=high) {
            mid = (low+high)/2;

            if(arr[mid] == searchNum){
                return mid;
            }else if(arr[mid] > searchNum){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        
        int arr[] = new int[]{1,2,3,4,5};
        int n = 5;
        int searchNum = 5;
        int ans = find(arr, n, searchNum);
        
        if(ans != -1){
            System.out.println("element found at index = "+ans);
        }else{
            System.out.println("element not present in array");
        }
    }
}
