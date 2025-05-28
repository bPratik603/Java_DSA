// String reverse
public class Prog65 {
    
    String rev1(String str){

        String revStr = "";

        for(int i=str.length()-1;i>=0;i--){
            revStr = revStr+str.charAt(i);
        }

        return revStr;
    }

    String rev2(String str){

        char[] charArr = str.toCharArray();

        int start = 0;
        int end = charArr.length-1;

        while (start<end) {

            char tmp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = tmp;

            start++;
            end--;
            
        }
        return new String(charArr);
    }

    String rev3(String str){

        StringBuffer str2 = new StringBuffer(str);

        return new String(str2.reverse());
    }

    public static void main(String[] args) {
        
        Prog65 obj = new Prog65();
        String revStr = obj.rev1("Core2Web");

        System.out.println(revStr);

        revStr = obj.rev2("Core2Web");

        System.out.println(revStr);

        revStr = obj.rev3("Core2Web");

        System.out.println(revStr);
    }
}
