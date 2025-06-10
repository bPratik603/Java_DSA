// Reverse String using stack

import java.util.*;

import java.util.Stack;
class ReverseString{

   String revString(String str){

     Stack<Character> s = new Stack<Character>();

     char[] charArr = new char[str.length()];

     for(int i = 0;i<str.length();i++){
        s.push(str.charAt(i));
     }

     int i=0;
     while(!s.empty()){
        charArr[i] = s.pop();
        i++;
     }

     return new String(charArr);

   }

   
}
class Prog82 {
    
    public static void main(String[] args) {
        
      ReverseString r = new ReverseString();

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter String");
      String str = sc.next();

       String revStr = r.revString(str);

       System.out.println(revStr);
    }
}
