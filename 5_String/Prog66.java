// String reverse
public class Prog66 {
    
    String rev1(String str){
if(str == null || str.length() <= 1){
            return str;
        }

        return rev1(str.substring(1)) + str.charAt(0);
    }



    public static void main(String[] args) {
        
        Prog66 obj = new Prog66();
        String revStr = obj.rev1("Core2Web");

        System.out.println(revStr);


    }
}
