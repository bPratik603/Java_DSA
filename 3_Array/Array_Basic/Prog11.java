 class Prog11 {
    
    static int getMaxOccur(int arr[]){

      int count;
      int maxCount = 0;
      int maxNum = 0;
      for(int i=0;i<arr.length;i++){
        count = 0;

        for(int j=0;j<arr.length;j++){
             if(arr[i] == arr[j]){
                count++;
             }
        }

          if(count > maxCount){
            maxCount = count;
            maxNum = arr[i];
          } 
      }

      return maxNum;
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{1,1,2,3,3,3,4,5};

        System.out.println(getMaxOccur(arr));
    }
}
