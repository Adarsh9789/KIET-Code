package pattern;

public class NumPatternReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 11;
		for(int i=row -1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(i-j+" ");
			}
			System.out.println();
		}
	}
}