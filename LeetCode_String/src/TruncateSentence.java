//1816. Truncate Sentence
//Easy
//1K
//28
//Companies
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
//
//For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
//You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.
//
//
//
//Example 1:
//
//Input: s = "Hello how are you Contestant", k = 4
//Output: "Hello how are you"
//Explanation:
//The words in s are ["Hello", "how" "are", "you", "Contestant"].
//The first 4 words are ["Hello", "how", "are", "you"].
//Hence, you should return "Hello how are you".
//Example 2:
//
//Input: s = "What is the solution to this problem", k = 4
//Output: "What is the solution"
//Explanation:
//The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
//The first 4 words are ["What", "is", "the", "solution"].
//Hence, you should return "What is the solution".
//Example 3:
//
//Input: s = "chopper is not a tanuki", k = 5
//Output: "chopper is not a tanuki"

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        int k=4;
        String result=truncateSentence2(s,k);
        System.out.println(result);
    }
    public static String truncateSentence(String s, int k) {
        String[] truncate;
        int spaces =s.split(" ").length;
        truncate=s.split(" ",spaces);
        StringBuilder stringBuilder=new StringBuilder(s.length());
        int x=truncate.length-(spaces-k);
        for (int i=0;i<x; i++){
            stringBuilder.append(truncate[i]);
            if (i+1!=x)
                stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
    public static String truncateSentence2(String s, int k) {
        String[] array=s.split(" ");
        StringBuilder string=new StringBuilder(s.length());
        for (int i=0; i<array.length-(array.length-k); i++){
            string.append(array[i]);
            if (i+1!=array.length-(array.length-k))
                string.append(" ");
        }
        return string.toString();
    }
}
