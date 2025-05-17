
 class Prog22 {

    public static void main(String[] args) {
        char arr[] = new char[]{'a','b','c','a','b','c'};

    //    int count =0;
       int itr = 0;

       int countA = 0;
       int countB = 0;
       int countC = 0;
       for(int i=0;i<arr.length;i++){

          if(arr[i] == 'a'){
            countA++;
          }else if(arr[i] == 'b'){
            countB++;
          }else if(arr[i] == 'c'){
            if(countA >= 1 && countB >= 1){
            countC = countC+countB;

            }
          }

          itr++;
       }
        System.out.println(countC); //3
        System.out.println(itr); //6
    }
}
