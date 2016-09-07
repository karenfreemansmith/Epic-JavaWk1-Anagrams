import org.junit.*;
import static org.junit.Assert.*;

public class AnagramTest{
  @Test
  public void isAnagram_confirmSame_true() {
    Anagram testAnagram = new Anagram();
    assertEquals(true, testAnagram.isAnagram("cat", "act"));
  }
}
