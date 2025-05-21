 class Prog48 {
    
    public static void main(String[] args) {
        
        int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int N = arr.length;
        int i=0;
        int j=0;

        for(int x=0;x<N-1;x++){
            System.out.print(arr[i][j]+"  ");
            j++;
        }

        System.out.println();

        for(int x=0;x<N-1;x++){
            System.out.print(arr[i][j]+"  ");
            i++;
        }

        System.out.println();

        for(int x=0;x<N-1;x++){
            System.out.print(arr[i][j]+"  ");
            j--;
        }

        System.out.println();

        for(int x=0;x<N-1;x++){
            System.out.print(arr[i][j]+"  ");
            i--;
        }

        System.out.println();

        int k = i+1;
        int t = j+1;
        int a = 1;

        for(int x = a;x<N-2;x++){
            System.out.print(arr[k][t]+"  ");
            t++;
        }

        System.out.println();

        for(int x = a;x<N-2;x++){
            System.out.print(arr[k][t]+"  ");
            k++;
        }

        System.out.println();

        for(int x=a;x<N-2;x++){
            System.out.print(arr[k][t]+"  ");
            t--;
        }

        System.out.println();

        for(int x=a;x<N-2;x++){
            System.out.print(arr[k][t]+"  ");
            k--;
        }


    }
}
