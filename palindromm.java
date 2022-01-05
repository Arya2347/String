import java.util.*;

public class palindromm {
    public static boolean palindrom(String str){
        int i=0;
        int j= str.length()-1;
        while(i<=j){
          char ch1= str.charAt(i);
          char ch2= str.charAt(j);
          if(ch1==ch2)
              return true;
              i++;
              j--;
          }
          return false;
        }
        public static void solution(String str){
            for(int i=0; i<str.length(); i++){
                for( int j=i; j<str.length(); j++){
                    String ss= str.substring(i,j+1);
                    if(palindrom(ss)==true){
                        System.out.println(ss);
                    }
                }
            }
        }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         String str= scn.next();
         solution(str);
    }
}
