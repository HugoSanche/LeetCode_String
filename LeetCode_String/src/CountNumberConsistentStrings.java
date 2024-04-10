public class CountNumberConsistentStrings {
    public static void main(String[] args) {
        String allowed="abc";
        String[] words={"a","b","c","ab","ac","bc","abc"};

        int result=countConsistentStrings(allowed,words);
        System.out.println(result);


    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0; i<words.length; i++){
            for(int j=0; j<allowed.length(); j++){
                if(words[i].indexOf(allowed.charAt(j))==-1){
                   count++;
                }
            }
            //System.out.println("***");
        }
        return (words.length-1)-count;
    }
}
