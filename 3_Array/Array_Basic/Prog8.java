 class Prog8 {
    
    static String getRange(int arr[],int start,int end){

        boolean status[] = new boolean[end-start+1];
       for(int i=0;i<arr.length;i++){
          if(arr[i] >= start && arr[i] <= end){
             status[arr[i] - start] = true;
          }
       }

       for(boolean found : status){
          if(!found){
            return "No";
          }
       }

       return "Yes";
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{1,4,5,2,7,8,3};
        int start = 2;
        int end = 5;
        System.out.println(getRange(arr, 2, 5));
    }
}
