// import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;


public class Main {

  public static void main(String[] args) {

    HashMap<String, Integer> map0 = new HashMap<String, Integer>();
    map0.put("apple", 1);
    map0.put("taco", 2);
    map0.put("donut", 1);
    map0.put("cheese", 2);
    
    HashMap<Integer, String> map1 = new HashMap<Integer, String>();
    map1.put(1, "apple");
    map1.put(2, "banana");
    map1.put(3, "orange");
    map1.put(4, "grape");

    // Segundo HashMap
    HashMap<Integer, String> map2 = new HashMap<Integer, String>();
    map2.put(5, "banana");
    map2.put(6, "kiwi");
    map2.put(7, "grape");
    map2.put(8, "pear");

    Functest f =  new Functest();
    
    System.out.println("Hello world!");

    f.check_even_num(4);

    f.one2tenfor();

    f.one2tenwhile();

    f.sum2num(2.7f, 3.5f);

    Persona pablo = new Persona("Pablo", 56);
    System.out.println(pablo.edad);

    Triangulo tri = new Triangulo();
    tri.dibujar();

    Rectangulo rect = new Rectangulo();
    rect.dibujar();

    HashFunch hsmf = new HashFunch();
    hsmf.wordCounter("palabra");

    hsmf.wwCounter("matanga dijo la changa la mona la changa matanga la");

    hsmf.findCommonVal(map1, map2);


    hsmf.removeSpecificVal(map0);
  }

}