
import java.util.*;

class MyClass {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Fruits[] fruits = new Fruits[4];

  
  for (int i = 0; i < fruits.length; i++) {
    fruits[i] = new Fruits(sc.nextInt(), sc.nextLine(), sc.nextInt(), sc.nextInt());
  }

  int rating = sc.nextInt();
  sc.close();
  
  Fruits[] result = findMaxPriceByRating(fruits, rating);
  
  if(result.length>0){
  for(int i=0;i<result.length;i++) {
   System.out.println(result[i].getFruitId());
  }
  }
  else{
      System.out.println("No Such Fruit");
  }
  
 }

 public static Fruits[] findMaxPriceByRating(Fruits [] fruits,int rating)
 {
     // Method logic
     Fruits [] result = new Fruits[0];
     for(int i = 0; i<fruits.length; i++){
         if(fruits[i].getRating() > rating){
            int olderLength = result.length;
            result = Arrays.copyOf(result, olderLength +1 );
            result[olderLength] = fruits[i];
         }
     }
     return result;
 }


}


public class Fruits {
    private
    String name; 
    int price,id, rating;

    // Constructor
    public Fruits(int id, String name, int price, int rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        
    }

    // Generate getter and setter methods
    public int getFruitId() {
        return id;
    }

    public int getRating(){
        return rating;
    }

    
}
