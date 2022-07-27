
public class Pattern_1 {

	public static void main(String[] args) {
		int n = 5;
		//printing I 
		for(int i=0; i<n; i++) {
			System.out.println("*");
		}
		System.out.println();
		//printing N
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j == 0 || j == n-1 || j == i) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		//printing E 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j == 0 || i == 0 || i == 2 || i == n-1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		//printing U
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j == 0 || j == n-1 || i == n-1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		//printing R
		boolean b = false;
		int p = 2;
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j == 0 || (i == 0 || i == (n-1)/2) && j%2 == 1 || j == n-1 && i < (n-1)/2 && i != 1) {
					System.out.print("*");
				}
				else if(i > (n-1)/2 && j == p) {
					System.out.print(" *");
					b = true;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(b == true) {
				p++;
			}
		}
		System.out.println();
		//printing O :
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j ==0 || i == 0 || j == n-1 || i == n-1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		//printing N
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j == 0 || j == n-1 || j == i) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
