public class ScoreOfString {
    public static void main(String[] args) {
        String sentence ="lbyd";
        int result= scoreOfString(sentence);
        System.out.println(result);
    }

    public static int scoreOfString(String s) {
//        char c='h';
//        int a=(int)c;
//        System.out.println(s.charAt(0));
        int x=0;
        int y=0;

        for (int i=0; i<s.length(); i++){
            System.out.println("value "+s.charAt(i+1)+" "+(int)s.charAt(i+1));
            if(i%2==1){
                System.out.println((int)s.charAt(i-1));
                System.out.println((int)s.charAt(i));
                x=x+Math.abs((int)s.charAt(i-1)-(int)s.charAt(i));
                y=y+Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
                System.out.println("sum x "+x);
                System.out.println("sum y "+y);
            }

        }
        return x+y;
    }

}
