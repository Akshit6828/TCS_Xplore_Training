import java.util.*;
public class VovelsConsonants {

	public static void main(String args[]){
        int vovelCount = 0;
        int consonantCount =0;
        Scanner s = new Scanner(System.in);
        String str = s.next();
        str = str.toLowerCase();

        for(int i =0;i< str.length();i++){
          char ch = str.charAt(i);
          if((ch >='a' && ch <='z' )){
              if(isVovel(ch))
             vovelCount++;
          else
             consonantCount++;
            }
        }
        if(vovelCount>0)
        System.out.println("Number of Vowels: "+vovelCount);
        if(consonantCount>0)
        System.out.print("Number of Consonants: "+consonantCount);
        s.close();
        }
    
        public static boolean isVovel(char cmp){
        if(cmp == 'a' || cmp == 'e' || cmp == 'i'  || cmp == 'o'  || cmp == 'u' )
              return true;
        return false;
        }
}
            