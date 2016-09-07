import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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

  public List<Object> findAnagrams(String userWords) {
    List<Object> wordArray = new ArrayList<Object>();
    List<Object> results = new ArrayList<Object>();
    String[] splitWords = userWords.split(" ");
    for(String word:splitWords) {
      wordArray.add(word);
    }
    int matches=0;
    //System.out.println(wordArray.get(1));
    for (int i=0; i<wordArray.size(); i++) {
      for (int j=0; j<wordArray.size(); j++) {
        if(isAnagram((String) wordArray.get(i), (String) wordArray.get(j))){
          //take word j out and put in results
          results.add(wordArray.remove(j));
          matches++;
        }
      }
      if(matches>0) {
        //take word i out and put in results
        results.add(wordArray.remove(i));
        i--;
      }
    }

    return results;
  }
}
