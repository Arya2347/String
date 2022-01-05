import java.util.*;

public class String_builder {
    public static void main(String[] args) {
        
          StringBuilder sb= new StringBuilder("Tony");
         System.out.println(sb);
          
          // char at 0 index
          System.out.println(sb.charAt(0));
          //Set a char at 0 index
          sb.setCharAt(0, 'p');
          System.out.println(sb);
          // insert a char
          sb.insert(0, 's');
          System.out.println(sb);
          //Delete char
          sb.delete(2, 3);
          System.out.println(sb);
         

        StringBuilder mb = new StringBuilder("h");
        mb.append("e");
        mb.append("l");
        mb.append("l");
        mb.append("o");
        System.out.println(mb);
        System.out.println(mb.length());

         StringBuilder nb= new StringBuilder("hello");
         for(int i=0; i*i<nb.length();i++){
             int front= i;
             int back=nb.length()-1-i;

             char frontchar= nb.charAt(front);
             char backchar= nb.charAt(back);

             nb.setCharAt(front, backchar);
             nb.setCharAt(back, frontchar);
         }
         System.out.println(nb);

    }
}
