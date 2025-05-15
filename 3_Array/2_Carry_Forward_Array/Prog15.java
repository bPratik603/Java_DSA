 class Prog15 {

     public static void main(String[] args) {
        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int i = arr.length-1;

        int tmp[] = new int[arr.length];

       int max = Integer.MIN_VALUE;
       for(int j=0;j<arr.length;j++){
          for(int k=j;k<=i;k++){
            if(max < arr[j]){
                max = arr[j];
            }
          }

          tmp[j] = max;
       }

        for (int j = 0; j < tmp.length; j++) {
            System.out.print(tmp[j]+" ,");
        }
     }
}
