
 class Prog9 {
    
    static void getSum(int arr[],int size){

        int low = 0;
        int high = size -1;
        while(low<=high){
            if(low == high){
                System.out.println(arr[low]);
            }else{
                System.out.println(arr[low]+arr[high]);
            }
            low++;
            high--;
        }
    }

    public static void main(String[] args){

          int arr[] = new int[]{8,4,1,3,9,2,6,7,1};
        int size = 9;

        getSum(arr, size);
    }
}
