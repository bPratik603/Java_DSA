 class Prog43 {
    
    public static void main(String[] args) {
        
        int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++)
            System.out.print(arr[i][j]+"   ");

                    System.out.println();

        }
    }
}
