import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    //Console c = System.console();
    String layout = "templates/layout.vtl";
    Anagram anagram = new Anagram();

    //anagram.findAnagrams(word1);
    //String userWords = c.readLine();
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String word1 = request.queryParams("word1");
      String word2 = request.queryParams("word2");
      if(anagram.isAnagram(word1,word2)){
        model.put("result", "Congrats, your words are anagrams!");
      } else {
        model.put("result", "Your words aren't anagrams");
      }
      model.put("template", "templates/result.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
