import java.util.HashMap;

class HashFunch{

  void wordCounter(String word){
    HashMap<Character, Integer> letterCounter= new HashMap<Character, Integer>();

    for (char ch : word.toCharArray()) {
        System.out.println(ch);

      if(letterCounter.get(ch) != null){
        letterCounter.put(ch, letterCounter.get(ch) + 1);
      } else {
        letterCounter.put(ch, 1);
      }
      
      
    }

    System.out.println(letterCounter);
  }
  
}