package q1;

public class fob {
	public static void main(String[] args) {
		int a=1, b=1, range, c, sum=0;
		range = 1;
		   while( range<=20 )
		   {
		     System.out.print(a +" ");
		      sum =sum+ a;
		      c = a + b;
		      a = b;
		      b = c;
		     range++;
		   }
		   
		System.out.println("Total sum is : "+ sum);
	}

}

