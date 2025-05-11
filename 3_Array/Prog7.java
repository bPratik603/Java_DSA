
public class Prog7 {
    static int secondLarget(int arr[],int size){

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i] > max){
                sMax = max;
                max = arr[i];
            }
        }

        return sMax;
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{8,4,1,3,9,2,6,7};
        int size = 8;

        System.out.println(secondLarget(arr, size));
    }
}
