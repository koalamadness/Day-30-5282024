import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class PlayerScore{
  
  private Scanner scanner = new Scanner(System.in);
  //private String userName = scanner.nextLine(); 
  
  private HashMap<String, ArrayList<Double>> playerScoreMap = new HashMap<String, ArrayList<Double>>();
  
  PlayerScore(HashMap<String, ArrayList<Double>> pSM){
    this.playerScoreMap = pSM;
  }

  void addScore(double newScore){

    System.out.println("Enter player to add score");
    String player = scanner.nextLine();  // Read user input

    if(playerScoreMap.containsKey(player)){
      playerScoreMap.get(player).add(newScore);
    } else{
      System.out.println("Player " + player + "could not be found");
    }
    
  }

  void averageScores(){
    
  }

  void findMaxScore(){
    
  }

  
}