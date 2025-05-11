 class Prog4 {

    static int  getCount(int arr[],int size,int num){
        
        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i] + arr[j] == num && i!=j) {
                    count++;
                }
            }
        }

        return count*2;
    }

    public static void main(String[] args){

        int arr[] = new int[]{3,5,2,1,-3,7,8,15,6,13};
        int size = 10;
        int num = 10;

        System.out.println(getCount(arr,size,num));
    }
}
