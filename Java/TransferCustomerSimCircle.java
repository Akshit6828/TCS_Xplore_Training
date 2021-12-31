import java.util.Arrays;
import java.util.Scanner;

public class TransferCustomerSimCircle {

public static void main(String[] args){

    Sim[] cards = new Sim[5];

    Scanner sc = new Scanner(System.in);

    for(int i = 0;i<5;i++){
    int simId = sc.nextInt();sc.nextLine();
    String customerName = sc.nextLine();
    double balance = sc.nextDouble();
    double ratePerSecond = sc.nextDouble();sc.nextLine();
    String circle = sc.nextLine();
    cards[i] = new Sim(simId,customerName, balance,ratePerSecond, circle);
    }

    String circle1 = sc.nextLine();
    String circle2 = sc.nextLine();
    sc.close();

    Sim[] result = transferCustomerCircle(cards, circle1, circle2);

    for(Sim s: result)
    System.out.println(s.getSimId()+" "+s.getCustomerName()+" "+s.getCircle() + " " + s.getRatePerSecond());

    }

public static Sim[] transferCustomerCircle(Sim[] cards, String circle1, String circle2){
//method logic
    Sim [] updatedCustomers = new Sim[0];
    // Updating circle of matched customers
    for(int i =0; i<cards.length; i++){

        if(cards[i].getCircle().equalsIgnoreCase(circle1)){
            cards[i].setCircle(circle2);
            updatedCustomers = Arrays.copyOf(updatedCustomers , updatedCustomers.length +1);
            updatedCustomers[updatedCustomers.length-1] = cards[i];
        }
    }


    // Sorting customers based on higher preference.
    Arrays.sort(updatedCustomers);
    return updatedCustomers;

}
}

class Sim implements Comparable<Sim>{
    
    String customerName, circle;
    int  simId;
    double balance, ratePerSecond;
    public Sim(int  simId,String customerName, double balance,double ratePerSecond,String circle){
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    // Getters and Setters
    public int getSimId(){
    return simId;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public String getCircle(){
        return circle;
    }

    public double getRatePerSecond(){
        return ratePerSecond;
    }

    public void setCircle(String circle){
        this.circle = circle;
    }

    public int compareTo(Sim obj){
        if(obj.ratePerSecond - this.ratePerSecond > 0.0){
            return 1;
        }
        else if(obj.ratePerSecond - this.ratePerSecond ==0.0)
        return 0;
        else {
            return -1;
        }
    }


}
            