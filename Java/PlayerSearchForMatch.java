import java.util.*;
public class PlayerSearchForMatch{
    public static void main(String args[]){
        //code to read values
        //code to call required method
        //code to display the result
        Scanner s = new Scanner(System.in);
        Player players [] = new Player[4];

        for(int i =0;i<4;i++){
        int id = s.nextInt();
        s.nextLine();
    	String country = s.nextLine();
    	String side = s.nextLine();
    	double price = s.nextDouble();
        Player obj = new Player(id, country, side, price);
        players[i] = obj;
        }

        String search = s.next();

        Player playerList [] = searchPlayerForMatch(search , players);
      
        for(int i = 0; i<playerList.length;i++){
            System.out.println(playerList[i].getId());
        }
 
        s.close();
    }

    public static Player[] searchPlayerForMatch( String search, Player[] players ){
        //method logic
        Player resultArray[] = new Player[0];
        for(int i =0;i<players.length; i++){
            if(players[i].getSide().equalsIgnoreCase(search)){
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                resultArray[i] = players[i];
            }
        }
        return resultArray;

    }
}

class Player{

    int id;
    String county, side;
    double price;

    // Constructor
    public Player(int id, String country, String side, double price){
        this.id = id;
        this.county = country;
        this.side = side;
        this.price = price;
    }
    
    // Getter and Setter.

    public String getSide(){
        return side;
    }

    public int getId(){
        return id;
    }


}