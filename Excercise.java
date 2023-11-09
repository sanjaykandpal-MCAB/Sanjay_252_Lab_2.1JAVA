
public class Excercise {
  public static void main(String[] args) {

      String s = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative” The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";

      String s2 = "SanjayKandpal";
      char[] ch = new char[10];

      // JAVA String methods

      // Char at
      System.out.println(s.charAt(0));

      // Compare to
      System.out.println(s.compareTo(s2));

      // Concat
      System.out.println(s.concat(s2));

      // Contains
      System.out.println(s.contains(s2));

      // Ends with
      System.out.println(s.endsWith("Nano."));

      // Equals
      System.out.println(s.equals(s2));

      // Equals ignore case
      System.out.println(s2.equalsIgnoreCase("sagar"));

      // Format
      System.out.println(s.format("My name is: %s", s2));

      // Get bytes
      System.out.println(s.getBytes());

      // Get chars
      s.getChars(5, 15, ch, 0);
      System.out.println(ch);

      // Index of
      System.out.println(s.indexOf("s"));

      // Intern
      System.out.println(s.intern());

      // Is empty
      System.out.println(s.isEmpty());

      // Join
      System.out.println(s.join(s, s2));

      // Last Index of
      System.out.println(s.lastIndexOf("s"));

      // Length
      System.out.println(s.length());

      // Replace
      System.out.println(s.replace('w', 'A'));

      // Replace all
      System.out.println(s.replaceAll(s, s2));

      // Split
      // System.out.println(s.split("[^a-sA-S]"));
      //Splits the string based on whitespace using java foreach loop to print elements of string array
      String[] words = s.split("\\s");
      for (String w : words) {
          System.out.println(w);
      }

      //Starts with
      System.out.println(s.startsWith("We"));

      //Substring
      System.out.println(s.substring(8, 25));

      //To char array
      System.out.println(s.toCharArray());

      //To lower case
      System.out.println(s.toLowerCase());
      
      //To upper case
      System.out.println(s.toUpperCase());

      //Trim
      System.out.println(s.trim());

      //Value of
      System.out.println(s.valueOf(10));

  }
}
    
   

