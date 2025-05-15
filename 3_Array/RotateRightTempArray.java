import java.util.Arrays;

 class RotateRightTempArray  {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;
        int[] temp = new int[n];

        k = k % n; // To handle cases where k > n
        
        // Copy last k elements to the beginning of temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Copy the first n-k elements to the rest of temp
        for (int i = k; i < n; i++) {
            temp[i] = arr[i - k];
        }

        // Copy back to original array
        System.arraycopy(temp, 0, arr, 0, n);

        System.out.println(Arrays.toString(arr)); // Output: [4, 5, 1, 2, 3]
    }
}
