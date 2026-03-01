package numbers;
import java.util.*;

public class StrongNumber {

			static int f(int n){
	        int r=1;
	        for(int i=1;i<=n;i++)
	            r*=i;
	        return r;
	    }

	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt(),o,s=0,d;
	        o=n;
	        while(n>0){
	            d=n%10;
	            s+=f(d);
	            n/=10;
	        }
	        if(s==o)
	            System.out.println("Strong Number");
	        else
	            System.out.println("Not Strong Number");
	    }
	}
