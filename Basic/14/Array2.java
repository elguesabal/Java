import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		int	array[] = {3, 1, 2, 5, 4};

		Arrays.sort(array);
		for (int n : array) {
			System.out.println(n);
		}
		System.out.println(Arrays.binarySearch(array, 4));
		Arrays.fill(array, 42);
		for (int n : array) {
			System.out.println(n);
		}
	}
}