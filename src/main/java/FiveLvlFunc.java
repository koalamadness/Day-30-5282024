import java.io.*;
import java.util.HashMap;

public class FiveLvlFunc {

  void combineMaps(HashMap<String, String> map1, HashMap<String, String> map2){

    HashMap<String, String> map3 = new HashMap<String, String>();

    for (String key1 : map1.keySet()) {
      if(map2.get(key1) != null){
        String combinedValue = map1.get(key1) + "+" + map2.get(key1);
        map3.put(key1, combinedValue);
      } else{
        map3.put(key1, map1.get(key1));
      }
    }

    for (String key2 : map2.keySet()) {
      if(map3.get(key2) != null){
        
      } else {
        map3.put(key2, map2.get(key2));
      }
    }
    
    System.out.println(map3);
    
  }

  
}