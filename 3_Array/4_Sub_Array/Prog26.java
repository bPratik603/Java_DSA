
 class Prog26 {

    public static void main(String[] args) {
        
        int arr[] = new int[]{2,4,1,3};

        int tmp[] = new int[arr.length];

        tmp[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            tmp[i] = tmp[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
              int sum = 0;
                if(i == 0){
                    sum= tmp[j];
                }else{
                    sum = tmp[j] - tmp[i-1];
                }

                System.out.println(sum);
            }
        }
    }
}
