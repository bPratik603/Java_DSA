//  febonacci series
 
 class Prog67 {

    int feb1(int num){

        int t1=0,t2=1,t3=0;

        System.out.print(t1+","+t2);

        for(int i=2;i<num;i++){
            t3 = t1+t2;
            System.out.print(","+t3);

            t1 = t2;
            t2 = t3;
        }

        return t3;
    }

    public static void main(String[] args) {
        
        Prog67 obj = new Prog67();

        int res = obj.feb1(8);

        System.out.println(res);
    }
}
