import java.util.*; 
public class ReverseNumber { 
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in); 
        // Reading input. String str = s.next(); 
        //Code to display the result 
        String str = s.next();
        StringBuffer rev = new StringBuffer(str); 
        System.out.print("Reverse of the number is "+rev.reverse());
        s.close(); 
    } 
}