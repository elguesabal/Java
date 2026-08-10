import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner	input;
		String	bufferString;
		int		bufferInt;
		float	bufferFloat;

		input = new Scanner(System.in);
		bufferString = input.nextLine();
		System.out.printf("Line: %s\n", bufferString);
		bufferInt = input.nextInt();
		System.out.printf("Int: %d\n", bufferInt);
		bufferFloat = input.nextFloat();
		System.out.printf("Float: %.2f\n", bufferFloat);
		input.close();
	}
}