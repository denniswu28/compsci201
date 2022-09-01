import java.util.HashSet;
import java.util.Set;

public class Starter {
    public int begins(String[] words, String first) {
        Set<String> UniqueWords = new HashSet<String>(); 
        int cnt = 0;

        for(int i = 0; i < words.length; i += 1){
            UniqueWords.add(words[i]);
        }

        String[] UniqueWordArray =  UniqueWords.toArray(new String[0]);

        for(int i = 0; i < UniqueWordArray.length; i += 1){
            if(UniqueWordArray[i].indexOf(first) == 0){
                cnt += 1;
            }
        }

        return cnt;
    }
}
