import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Anagrams newAna = new Anagrams();
    System.out.println("Enter words: ");
    String testString = myConsole.readLine().toLowerCase();
    newAna.checkAnagram(testString);
  }
}
