import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner		input;
		String		buffer;
		String[]	sum;
		int			result;
		int			i;

		input = new Scanner(System.in);
		buffer = input.nextLine();
		sum = buffer.split(" ");
		result = Integer.parseInt(sum[0]);
		i = 1;
		while (i < sum.length) {
			if (sum[i].equals("+")) {
				result += Integer.parseInt(sum[i + 1]);
			} else if (sum[i].equals("-")) {
				result -= Integer.parseInt(sum[i + 1]);
			}
			i += 2;
		}
		System.out.printf("Result: %d\n", result);
		input.close();
	}
}