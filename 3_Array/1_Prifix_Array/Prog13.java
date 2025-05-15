 class Prog13 {

    public static void main(String[] args) {
        
                int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
      
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(max == arr[i]){
              count++;
            }
        }

        System.out.println(arr.length-count);
    }
}
