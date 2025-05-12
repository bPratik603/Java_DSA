
 class Prog5 {
    
    static int getProduct(int arr[],int start,int end){

        int mul = 1;
        for(int i=start;i<end;i++){
            mul = mul * arr[i];
        }

        return mul;
    }

   public static void main(String[] args) {
      int arr[] = new int[]{1,2,3,4,5,6};

      System.out.println(getProduct(arr, 1, 4));
   }
}
