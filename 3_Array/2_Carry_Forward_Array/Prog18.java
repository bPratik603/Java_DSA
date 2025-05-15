 class Prog18 {
      public static void main(String[] args) {
        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        // int i = arr.length-1;

        int rightMax[] = new int[arr.length];

        rightMax[arr.length-1] = arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            if(rightMax[i+1] > arr[i]){
                rightMax[i] = rightMax[i+1];
            }else{
                rightMax[i] = arr[i];
            }
        }
        for (int j = 0; j <arr.length; j++) {
            System.out.print(rightMax[j]+" ,");
        }
     }
}
