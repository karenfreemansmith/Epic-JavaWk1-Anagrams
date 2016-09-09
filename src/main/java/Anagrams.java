import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Anagrams{

  public static String checkAnagram(String testString) {
    String[] splitArray = testString.split(" "); //create array of words
    List<String> sortedArray = new ArrayList<String>();
    List<String> checkedArray = new ArrayList<String>();

    for(String currentWord : splitArray){
      char[] splitWord = currentWord.toCharArray();
      Arrays.sort(splitWord);
      String sorted = new String(splitWord);
      sortedArray.add(sorted);
    }

    for(int j = 0; j < sortedArray.size(); ++j){
      if(checkedArray.indexOf(sortedArray.get(j)) == -1){
        checkedArray.add(sortedArray.get(j));
        for(int i = j + 1; i < sortedArray.size(); i++){
          if( sortedArray.get(j).equals(sortedArray.get(i)) ){
            // uses index to find original words in "split array"
            System.out.println(splitArray[j] + " is an anagram of " + splitArray[i]);
          }
        }
      }
    }
  return testString;
  }
}
