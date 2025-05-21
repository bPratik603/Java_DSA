class Prog47 {

    public static void main(String[] args) {
        
         int arr[][] = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

         int M = 5;
         int N = 5;

        
         for(int j=0;j<M-1;j++){
            System.out.print(arr[0][j]+"  ");
         }
         System.out.println();

         for(int i=0;i<N-1;i++){
            System.out.print(arr[i][N-1]+"  ");
         }
         System.out.println();

         for(int j=N-1;j>0;j--){
            System.out.print(arr[N-1][j]+"  ");
         }

        System.out.println();

        for(int i=N-1;i>0;i--){
            System.out.print(arr[i][0]+"  ");
        }
    }
}
