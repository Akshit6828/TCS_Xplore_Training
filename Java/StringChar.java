import java.util.*;
public class StringChar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char c  = sc.nextLine().charAt(0);
        
        String ans = "";
        for(int i = 0; i < in.length(); i++){
            if( in.charAt(i) != c ){
                ans += in.charAt(i);
            }
            
        }
        System.out.print(ans);
        sc.close();

    }
}