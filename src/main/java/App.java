import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    Anagram anagram = new Anagram();
    String word1 = c.readLine("Enter word 1: ");
    String word2 = c.readLine("Enter word 2: ");
    if(anagram.isAnagram(word1,word2)){
      System.out.println("Congrats, your words are anagrams!");
    } else {
      System.out.println("Your words aren't anagrams");
    }
  }
}
