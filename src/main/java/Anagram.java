import java.util.Arrays;

public class Anagram{
  public boolean isAnagram(String word1, String word2){
    String[] comparedWords1 = word1.split("");
    String[] comparedWords2 = word2.split("");
    boolean result = false;
    Arrays.sort(comparedWords1);
    Arrays.sort(comparedWords2);

     if(Arrays.equals(comparedWords1,comparedWords2)){
       result = true;
     }
     return result;
    }
  }
