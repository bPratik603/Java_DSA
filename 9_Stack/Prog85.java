// valid parenthesis or valid parenthesis checker

import java.util.Scanner;
import java.util.Stack;

class ParenthesisChecker{

    boolean parenthesisChecker(String str){

       Stack<Character> s = new Stack<Character>();

       for(int i=0;i<str.length();i++){

           char ch = str.charAt(i);
           if(ch == '{' || ch == '[' || ch == '('){
               s.push(ch);
           }else{
              if(!s.empty()){
                  char x = s.peek();
                  if((x == '{' && ch == '}') || (x == '[' && ch == ']') || (x == '(' && ch == ')')){
                     s.pop();
                  }else{
                    return false;
                  }
              }else{
                return false;
              }
           }
       }

       if(!s.empty()){
           return false;
       }else{
        return true;
       }
    }
}

class Prog85 {
  
    public static void main(String[] args) {
     
        ParenthesisChecker p = new ParenthesisChecker();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Parenthesis");
        String str = sc.next();

        System.out.println(p.parenthesisChecker(str));
    }
}
