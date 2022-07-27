
public class Pattern_4 {

	public static void main(String[] args) {
		int r = 8;
		int c = 14;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(j==0 || j==c-1 || i == r-1 || i==r-2 || j<=i || j>=c-1-i) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
