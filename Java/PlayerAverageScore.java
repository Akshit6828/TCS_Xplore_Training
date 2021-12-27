import java.util.Arrays;
import java.util.Scanner;

public class PlayerAverageScore {
  private
    int playerId, iccRank, noOfMatchesPlayed, totalRunsScored;
    String playerName;

    // Parameterized Constructor
    public PlayerAverageScore(int playerId, String playerName, int iccRank, int noOfMatchesPlayed, int totalRunsScored){
        this.playerId = playerId;
        this.playerName = playerName;
        this.iccRank = iccRank;
        this.noOfMatchesPlayed = noOfMatchesPlayed;
        this.totalRunsScored = totalRunsScored;
    }

    // Getters and Setters Required.

    public int getNoOfMatchesPlayed(){
        return noOfMatchesPlayed;
    }

    public int getTotalRunsScored(){
        return totalRunsScored;
    }

}

class Solution
{

 public static void main(String[] args)
 {
  //code to read values 
  //code to call required method
  //code to calculate Grade and display the results
  Scanner s =  new Scanner(System.in);
  
  PlayerAverageScore[] players = new PlayerAverageScore[4];
  for(int i =0; i<4;i++){
    int playerId = s.nextInt();
    s.nextLine();
    String playerName = s.next();
    int iccRank = s.nextInt();
    int noOfMatchesPlayed = s.nextInt();
    int totalRunsScored = s.nextInt();
    PlayerAverageScore obj =  new PlayerAverageScore(playerId, playerName, iccRank, noOfMatchesPlayed, totalRunsScored);
    players[i] = obj;
  }

  int target = s.nextInt();
  s.close();
  double[] averageRuns = findAverageScoreOfPlayers(players, target);

  for(int i = 0; i<averageRuns.length; i++){
      if(averageRuns[i]>=80)
        System.out.println("Grade A");
      else if(averageRuns[i] >= 50 && averageRuns[i] <= 79)
        System.out.println("Grade B");
      else
        System.out.println("Grade C");
  }
    

 }

 public static double[] findAverageScoreOfPlayers(PlayerAverageScore[] players,int target)
 {
  //method logic
  double resultAverageScore[] = new double[0];
  for(int i = 0; i<players.length; i++){
      if(players[i].getNoOfMatchesPlayed() >= target){
         resultAverageScore =  Arrays.copyOf(resultAverageScore, resultAverageScore.length + 1); // As we need to increase size of resultArray as we are not sure if the player meets the criteria or not?
        resultAverageScore[i] = (double)(players[i].getTotalRunsScored() / players[i].getNoOfMatchesPlayed()); // Making sure to typecast value to double as return type is array of double.
      }
  }
  
  return resultAverageScore;
  
 }
}    