import java.util.Scanner;
public class SmallestVovel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        char minChar = 'u';
        boolean vovelPresent = false;
        for(int i =0;i<str.length();i++){
            char curChar = str.charAt(i);
            if(curChar == 'a' || curChar == 'e' || curChar == 'i' || curChar == 'o' || curChar == 'u'){
            if(minChar>= curChar){
              vovelPresent = true;
                minChar = curChar;
            }
            }
        }
        if(vovelPresent)
        System.out.print(minChar);
        }
}
