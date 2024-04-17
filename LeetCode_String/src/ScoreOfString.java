public class ScoreOfString {
    public static void main(String[] args) {
        String sentence ="hello";
        int result= scoreOfString(sentence);
        System.out.println(result);
    }

    public static int scoreOfString(String s) {
        int x=0;
        int y=0;
        for (int i=0; i<s.length(); i++){
            if(i%2==1){
                if(i+1==s.length()){
                    x=x+Math.abs((int)s.charAt(i-1)-(int)s.charAt(i));
                    y=y+0;
                }
                else{
                    x=x+Math.abs((int)s.charAt(i-1)-(int)s.charAt(i));
                    y=y+Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
                }
            }

        }
        return x+y;
    }

}
