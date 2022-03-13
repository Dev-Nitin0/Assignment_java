package q3;

import java.util.Scanner;

public class date {
	public static void main(String[] args) {
		int d, m, y;
		try (Scanner sc = new Scanner(System.in)) {
			{
				System.out.println("Enter the day");
				d = sc.nextInt();

				System.out.println("Enter the month");
				m = sc.nextInt();

				System.out.println("Enter the year");
				y = sc.nextInt();
			}
		}
		if (d > 0 && d < 28)
			d += 1;
		if (d == 28)
		{
			if (m == 2)	
			{
				if ((y % 400 == 0) || (y % 100 != 0 || y % 4 == 0))
				{
					d = 29;
				}
				else
				{
					d = 1;
					m = 3;
				}
			}
			else	
				d += 1;
		}
		if (d == 29)
		{
			if (m == 2)
			{
				d = 1;
				m = 3;
			}
			else
				d += 1;
		}
		if (d == 30)
		{
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
				d += 1;
			else
			{
				d = 1;
				m += 1;
			}
		}
		if (d == 31)	
		{
			d = 1;
			if (m == 12)
			{
				y += 1;
				m = 1;
			}
			else
				m += 1;
		}
	System.out.println("Next date is "+d+"/"+m+"/"+y);	
}
	}
