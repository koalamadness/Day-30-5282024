public class Functest {
  boolean check_even_num(int num){
    if (num%2 == 0) {
      System.out.println("Even num");
      return true;
    }
    else{
      System.out.println("Odd num");
      return false;
    }
  }
}