import java.util.*;

public class SimpleWordGame {
    public Boolean checkIn(String[] dict, String word){
        for(String item : dict){
            if(word.equals(item)){
                return true;
            }
        }
        return false;
    }

    public int points(String[] player, String[] dictionary) {
        Set<String> uniquePlayer = new HashSet<>(Arrays.asList(player));
        String[] uniquePlayerArray = uniquePlayer.toArray(new String[0]);
        int score = 0;

        for(String uniqueWord : uniquePlayerArray){
            if(checkIn(dictionary, uniqueWord)){
                score += uniqueWord.length()*uniqueWord.length();
            }
        }

        return score;
    }
}
