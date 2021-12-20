import java.util.Scanner;

public class PrintOddCharacters {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    for(int i =0;i<str.length();i+=2){
    System.out.print(str.charAt(i));
    }
    s.close();
   } 
}
