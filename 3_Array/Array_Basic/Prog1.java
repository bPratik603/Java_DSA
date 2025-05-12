
class Prog1 {
    
    static int find(int arr[],int size,int searchNum){

        int i;
        for(i=0;i<size;i++){
            if(arr[i] == searchNum){
                return i;
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
