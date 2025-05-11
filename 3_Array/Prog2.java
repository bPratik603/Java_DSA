
class Prog2 {
   
    static int graterElements(int arr[],int size){

       int count = 0;
       int max = Integer.MIN_VALUE;
       for(int i=0;i<size;i++){
          if(arr[i] > max){
             max = arr[i];
          }
       }

       for(int i=0;i<size;i++){
        if(arr[i] == max){
            count++;
        }
       }

       return size-count;
    }

    public static void main(String[] args){

        int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
        int size = 10;
        System.out.println(graterElements(arr, size));
    }
}
