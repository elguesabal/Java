public class Switch {
	public static void main(String[] args) {
		String	string = "Vampeta";

		switch (string) {
			case "42":
				System.out.println("42");
				break;
			case "Vampeta":
				System.out.println("Vampeta");
				break;
			default:
				System.out.println("default");
		}
	}
}