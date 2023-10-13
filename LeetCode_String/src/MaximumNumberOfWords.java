public class MaximumNumberOfWords {
    public static void main(String[] args) {
        String[] sentence= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int result=mostWordsFound(sentence);
        System.out.println(result);

    }
    public static int mostWordsFound(String[] sentences) {
        int count=1;
        int max=0;
        // StringBuilder[] stringBuilder=new StringBuilder(sentences);
       // stringBuilder.

        for (int i=0; i<sentences.length; i++){

            int current=sentences[i].split(" ").length;
            System.out.println(current);
            for (int j=0; j<sentences[i].length(); j++){
                if (sentences[i].charAt(j)==' '){
                    count++;
                }
            }

            if (count>max){
                max=count;
            }
            count=1;
        }
        return  max;
    }
}
