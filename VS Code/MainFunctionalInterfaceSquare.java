interface Calc{
        int square(int n1);
}
public class MainFunctionalInterfaceSquare {
       public static void main(String[] args) {

        // Lambda Expression yeh bhi ek tarika hai 
        // function ko implement karne ka
        Calc a1 = num -> num * num;


        int result = a1.square(20); 
        System.out.println("Square of number is = " + result);

    }
}