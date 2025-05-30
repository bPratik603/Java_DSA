
// Linear search

import java.util.Scanner;

public class Prog68 {
    
    static int find(int arr[],int search){

        for(int i=0;i<arr.length;i++){
            if(search == arr[i])
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = new int[7];

        System.out.println("Enter array data");

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }

        System.out.println("Enter search data");
        int searchData = sc.nextInt();

        int index = find(arr,searchData);

         if(index != -1){
            System.out.println("Element found at index "+index);
         }else{
            System.out.println("Element not present in array");
         }
    }
}
