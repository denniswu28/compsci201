public class TxMsg {
    public Boolean hasConsonant(String original){
        char[] word = original.toCharArray();

        for(char letter : word){
            if(letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u'){
                return true;
            }
        }
        return false;
    }

    public String convert(String original){
        if(!hasConsonant(original)){
            return original;
        }

        char[] oldWord = original.toCharArray();
        String newWord = "";

        Boolean hasConstBefore = false;
        for(char letter : oldWord){
            if(letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u'){
                if(!hasConstBefore){
                    newWord += letter;
                }
                hasConstBefore = true;
            } else{
                hasConstBefore = false;
            }
            
        }
        return newWord;
    }
    public String getMessage(String original) {
        String[] words = original.split(" ", -1);
        String finalWord = "";
        for(int i =0; i < words.length; i+=1){
            finalWord += convert(words[i]);
            if(i<words.length-1){
                finalWord += " ";
            }
        }
        return finalWord;
    }
}
