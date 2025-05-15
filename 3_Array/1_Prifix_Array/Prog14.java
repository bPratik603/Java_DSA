import java.util.Arrays;

class Prog14{

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int k = 2;

        int n = 5;
        int tmp[] = new int[n];

        for(int i=0;i<k;i++){
           tmp[i] = arr[n-k+i];
        }

        for(int i=k;i<n;i++){
            tmp[i] = arr[i-k];
        }

        // System.arraycopy(tmp, 0, arr, 0, n);

        for(int i=0;i<arr.length;i++){
            arr[i] = tmp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}