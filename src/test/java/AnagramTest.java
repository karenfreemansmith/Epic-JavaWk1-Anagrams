import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class AnagramTest{
  @Test
  public void isAnagram_confirmSame_true() {
    Anagram testAnagram = new Anagram();
    assertEquals(true, testAnagram.isAnagram("cat", "act"));
  }
  @Test
  public void findAnagrams_getOneAnagram_ArrayList () {
    Anagram testAnagram = new Anagram();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("cat");
    expectedOutput.add("act");
    assertEquals(expectedOutput, testAnagram.findAnagrams("cat, act"));
  }
}
