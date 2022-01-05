import java.util.*;

public class compression {
    public static String compression(String str) {
        String s = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);
            if (curr != pre) {
                s += curr;
            }

        }
        return s;
    }

    public static String compression2(String str) {
        String s = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);
            if (curr == pre) {
                count++;
            } else {
                if (count > 1) {
                    s += curr;
                    count = 1;
                }
            }
        }
        if(count > 1)
		    s += count;
        return s;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression(str));
        System.out.println(compression2(str));
    }
}
