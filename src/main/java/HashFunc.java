import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;


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

  void wwCounter(String text){
    HashMap<String, Integer> wordCounter= new HashMap<String, Integer>();

    ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(text.split(" ")));

    for (String word : wordList) {

    if(wordCounter.get(word) != null){
        wordCounter.put(word, wordCounter.get(word) + 1);
    } else {
        wordCounter.put(word, 1);
    }

    }

    System.out.println(wordCounter);

  }

  void findCommonVal(HashMap<Integer, String> hsmap1, HashMap<Integer, String> hsmap2){
    ArrayList<String> commonWordsList = new ArrayList<String>();

    for(String w1: hsmap1.values()){

      for(String w2: hsmap2.values()){

        if(w2.equals(w1)){
          commonWordsList.add(w2);
        }
      }
      
    }
  
    System.out.println(commonWordsList);
  }



  
}