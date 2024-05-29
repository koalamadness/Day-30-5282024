// import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {

  public static void main(String[] args) {

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
  }

}