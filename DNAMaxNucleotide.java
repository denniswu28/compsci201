
public class DNAMaxNucleotide {

    public int countMatches(String text, String str)
    {
        return text.split(str, -1).length - 1;
    }
    
    public String max(String[] strands, String nuc) {
        String bestString = new String("");
        int bestCount = 0;
        for(int i = 0; i < strands.length; i+=1){
            int currentCount = countMatches(strands[i], nuc);
            if(currentCount == 0){
                continue;
            }
            if((currentCount > bestCount) || ((strands[i].length() > bestString.length()) && (currentCount == bestCount))){
                bestString = strands[i];
                bestCount = currentCount;
            }
        }
        return bestString;
    }


}
