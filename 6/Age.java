import java.time.Year;

public class Age {
	public static void main(String[] args) {
		int	yearBirth;
		int	yearSystem;
		int	result;

		if (args.length == 0) {
			System.out.println("Error");
			return;
		}
		yearBirth = Integer.parseInt(args[0]);
		yearSystem = Year.now().getValue();
		result = yearSystem - yearBirth;
		if (result < 0) {
			System.out.println("Error");
			return;
		}
		System.out.printf("Age: %d\n", result);
	}
}