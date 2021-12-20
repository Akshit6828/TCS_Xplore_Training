import java.util.*;
public class VovelsConsonants {

	public static void main(String args[]){
        int vovelCount = 0;
        int consonantCount =0;
        Scanner s = new Scanner(System.in);
        String str = s.next();
        str = str.toLowerCase();

        System.out.println("Checking");
        for(char ch = 'A'; ch<='Z';ch++){
            System.out.println(ch);
        }

        System.out.println("END");
        for(int i =0;i< str.length();i++){
          char ch = str.charAt(i);
          if((ch >='a' && ch <='z' )){
              if(isVovel(ch))
             vovelCount++;
          else
             consonantCount++;
            }
        }
        System.out.println("Number of Vowels: "+vovelCount);
        System.out.print("Number of Consonants: "+consonantCount);
        s.close();
        }
    
        public static boolean isVovel(char cmp){
        if(cmp == 'a' || cmp == 'e' || cmp == 'i'  || cmp == 'o'  || cmp == 'u' )
              return true;
        return false;
        }
}
            