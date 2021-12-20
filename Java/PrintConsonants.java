import java.util.*;
public class PrintConsonants {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        str = str.toLowerCase();
        for(int i =0;i< str.length();i++){
          char ch = str.charAt(i);
          if((ch >='a' && ch <='z' )){
              if(!isVovel(ch))
             System.out.print(ch);
            }
        }
        s.close();
        }
    
        public static boolean isVovel(char cmp){
        if(cmp == 'a' || cmp == 'e' || cmp == 'i'  || cmp == 'o'  || cmp == 'u' )
              return true;
        return false;
        }
        
}
