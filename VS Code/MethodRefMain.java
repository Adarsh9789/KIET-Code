
class  Calculator{
    Calculator(){
        System.out.println("This is Constructor!");
    }
    Calculator(int a, int b){
    System.out.println("Division : "+(a/b));    
}
    int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
}
//Functional Interface hai
interface Calc{
    int cal(int n1, int n2);
}
interface Calc2{
    Calculator cal(int n1, int n2);
}
public class MethodRefMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
         int r = c.sub(100, 25);
         System.out.println("Subtraction: "+r);

        Calc c1 = c::sub;
        int r1 = c1.cal(100, 25);
        System.out.println("Subtraction : "+r1);

        Calc c2 = Calculator::mul;
        int r3 = c2.cal(100, 25);
        System.out.println("Multiplication : "+r3);

        Calc c3 = Calculator::new;
        c3.cal(100, 2);


    }    
}

