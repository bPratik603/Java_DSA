
 class Prog6 {
    
    static int replace(int num,int oldData,int newData){
        
       String str = Integer.toString(num);

       String newStr =  str.replace(Integer.toString(oldData),Integer.toString(newData));

       return Integer.parseInt(newStr);
              
    }

    public static void main(String[] args) {
        int num = 1001;

        System.out.println(replace(num, 0, 5));
    }
}
