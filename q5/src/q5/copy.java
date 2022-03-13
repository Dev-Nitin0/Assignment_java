package q5;
import java.util.*;

class Arraycopy {

	public static int[] copyOf(int[] array) {
		return Arrays.copyOf(array, array.length);
	}

}

public class copy {

	public static void main(String[] args) {
		int arr[] = { 10,30,45,32,80 };
		int copyOfArr[] = Arraycopy.copyOf(arr);
		for (int i = 0; i < 5; i++)
			System.out.println(copyOfArr[i]);

	}

}
