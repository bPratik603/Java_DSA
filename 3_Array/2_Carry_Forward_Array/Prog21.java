
 class Prog21 {

    public static void main(String[] args) {
        char arr[] = new char[]{'a','b','e','g','a','g'};

       int count =0;
       int itr = 0;

       int pair = 0;
       for(int i=0;i<arr.length;i++){

          if(arr[i] == 'a'){
            count++;
          }else if(arr[i] == 'g'){
            pair = pair+count;
          }

          itr++;
       }
        System.out.println(pair); //3
        System.out.println(itr); //6
    }
}
