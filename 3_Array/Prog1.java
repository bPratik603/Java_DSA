
class Prog1 {
   
    static int graterElements(int arr[],int size){

        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i] < arr[j]){
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args){

        int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
        int size = 10;
        System.out.println(graterElements(arr, size));
    }
}
