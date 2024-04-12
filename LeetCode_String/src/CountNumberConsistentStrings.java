public class CountNumberConsistentStrings {
    public static void main(String[] args) {
        String allowed="fstqyienx";
        String[] words={"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};

        //"lhoa"
        //"kug"
        //"z"


        int result=countConsistentStrings2(allowed,words);
        System.out.println(result);

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        String word;
        for(int i=0; i<words.length; i++){
            word=words[i];
            for(int j=0; j<word.length(); j++){
                if(allowed.indexOf(word.charAt(j))==-1){
                   count++;
                   break;
                }
            }
        }
        return (words.length)-count;
    }
    public static int countConsistentStrings2(String allowed, String[] words) {
        int count=words.length;
        int store[]=new int[26];

        for (char c: allowed.toCharArray()){
            store[c-'a']=7;
        }

        for (String word:words){
            for(char c:word.toCharArray()){
                if(store[c-'a']!=7){
                    count--;
                    break;
                }
            }
        }
        return count;
    }

}
