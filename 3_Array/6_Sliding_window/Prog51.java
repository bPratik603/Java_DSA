

// count number of subarray's whose length is 4
 class Prog51 {
    
    public static void main(String[] args) {
        
        int arr[] = new int[]{-3,4,-2,5,3,-2,8,2,1,4};

    
       int k = 4;
       int end = k-1;
       int count = 0;
       while (end<arr.length) {
          count++;
          end++;
       }
        System.out.println(count);

    //    or

      count =0;

      System.out.println(arr.length-k+1);

    }
}
