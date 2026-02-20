package lamda_expression;

@FunctionalInterface
interface CheckPalindrome {
	boolean checkPalin(String info);
}

public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPalindrome cp =  info-> new StringBuilder(info).reverse().toString().equals(info);
		
		//CheckPalindrome cap = (String info)->new StringBuilder(info).reverse().toString().equals(info);
        System.out.println(cp.checkPalin("Ayush"));  // false
        System.out.println(cp.checkPalin("madam"));  // true
	}
	}

//
//@FunctionalInterface
//interface CheckPalindrome {
//    boolean checkPalin(String info);
//}
//
//public class PalindromeMain {
//
//    public static void main(String[] args) {
//
//        CheckPalindrome cp = info -> 
//            new StringBuilder(info).reverse().toString().equals(info);
//
//        System.out.println(cp.checkPalin("Ayush"));  // false
//        System.out.println(cp.checkPalin("madam"));  // true
//    }
//}