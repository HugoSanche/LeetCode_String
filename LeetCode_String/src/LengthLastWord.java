public class LengthLastWord {
    public static void main(String[] args) {
        String s="luffy is still joyboy";

        int result=lengthOfLastWord2(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String s) {
        String[] word=s.split(" ");

        int size=word[word.length-1].length();

        return size;
    }
    public static int lengthOfLastWord2(String s) {
        s=s.trim();

        int x=s.length()-s.lastIndexOf(" ")-1;

        return x;
    }
}
