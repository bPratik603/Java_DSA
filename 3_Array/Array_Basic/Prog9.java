
 class Prog9 {
    
    static int getNum(int arr[]){

        int largeNum = 0;
        int place = 10;

        for(int i=1;i<arr.length;i++){
            int tmp = arr[i];
            int j = i-1;

            while(j>= 0 && arr[j]<tmp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = tmp;
        }

        for(int i=0;i<arr.length;i++){
            largeNum = largeNum*10 + arr[i];
        }

        return largeNum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{9,0,1,3};

        System.out.println(getNum(arr));
    }
}
