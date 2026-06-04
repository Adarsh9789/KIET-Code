package string;
import java.util.*;

public class PalindromeString2 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = "";
        // for(int i =s1.length(); i>0;i--){
        //     s2 = s2+s1.charAt(i-1);
        // }
        int i = s1.length();
        while(i>0){
            s2=s2+s1.charAt(i-1);
            i--;
        }
        if(s1.equals(s2))
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
    }
}
