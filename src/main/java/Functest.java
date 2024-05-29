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

  void one2tenfor(){
    for(int i=1;i<=10;i++){
      System.out.println(i);
    }
  }

  void one2tenwhile(){
    int i = 1;
    while(i<=10){
      System.out.println(i);
      i++;
      
    }
  }

  float sum2num(float n1, float n2){
    float sum = n1 + n2;
    System.out.println(sum);
    return sum;
    
  }
  
}