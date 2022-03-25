package q4;
import java.util.*;
public class Pascal{
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int s, i, j, x[][];
			System.out.println("Enter the no. of steps");
			s = sc.nextInt();
			sc.close();
			x = new int[s][s];
			
			for (i = 0; i < s; i++) {
				for (j = 0; j <= i; j++)
					if (j == 0 || j == i)
						x[i][j] = 1;
					else
						x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
			}
			
			System.out.println("\nHERE IS THE TRIANGLE:");
			for (i = 0; i < s; i++) {
				for (j = 0; j <= i; j++)
					System.out.print(x[i][j] + "\t");

				System.out.println();
			}
		}
	}


