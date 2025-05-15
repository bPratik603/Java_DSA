 class Prog17 {
      public static void main(String[] args) {
        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        // int i = arr.length-1;

        int leftMax[] = new int[arr.length];

         
        leftMax[0] = arr[0];

        for(int i=1;i<arr.length;i++){
          if(leftMax[i-1] > arr[i]){
            leftMax[i] = leftMax[i-1];
          }else{
            leftMax[i] = arr[i];
          }
        }
        for (int j = 0; j <arr.length; j++) {
            System.out.print(leftMax[j]+" ,");
        }
     }
}
