//709. To Lower Case
//Solved
//Easy
//Topics
//Companies
//Hint
//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
//
//
//
//Example 1:
//
//Input: s = "Hello"
//Output: "hello"
//Example 2:
//
//Input: s = "here"
//Output: "here"
//Example 3:
//
//Input: s = "LOVELY"
//Output: "lovely"
//
//
//Constraints:
//
//1 <= s.length <= 100
//s consists of printable ASCII characters.

public class ToLowerCase {
    public static void main(String[] args) {
        String s="LOVELY";


        String result= toLowerCase(s);
        System.out.println(result);
    }
    public static String toLowerCase(String s) {
        StringBuilder result=new StringBuilder();
        char c;
        for(int i=0; i<s.length();i++){

           if ((int)s.charAt(i)>64 && (int)s.charAt(i)<91 ){
              // c=(char)((int)s.charAt(i)+32);
               result.append((char)((int)s.charAt(i)+32));
           }else{
              // c=(char)((int)s.charAt(i));
               result.append((char)((int)s.charAt(i)));
           }
           // result.append(c);
        }

        return result.toString();
    }
}
