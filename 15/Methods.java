public class Methods {
	private static void printArgs(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}
	}

	private static String concatArgs(String[] args) {
		String	result = "";

		for (String arg : args) {
			result += arg + " ";
		}
		return (result);
	}

	public static void main(String[] args) {
		printArgs(args);
		System.out.println(concatArgs(args));
		Count.print(10);
	}
}