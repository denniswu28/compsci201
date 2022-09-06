import java.util.*;


public class Common {

    public int countMatches(String text, String str)
    {
        return text.split(str, -1).length - 1;
    }

    public int count (String a, String b) {
        char[] aWord = a.toCharArray();

        Set<String> uniqueAWord = new HashSet<>();

        for (char c : aWord){
            uniqueAWord.add(""+c);
        }

        String[] uniqueA = uniqueAWord.toArray(new String[0]);

        int num = 0;
        for(String letterA : uniqueA){
            int cntA = countMatches(a, letterA);
            int cntB = countMatches(b, letterA);
            if(cntA < cntB){
                num += cntA;
            } else{
                num += cntB;
            }
        }

        return num;
    }

  //  public static void main(String[] args) {
  //      Common tester = new Common();
  //      System.out.println(tester.count("toots", "stout"));
  //  }

}
