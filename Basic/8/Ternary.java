public class Ternary {
	public static void main(String[] args) {
		int		n;
		String	string1 = "Vampeta";
		String	string2 = "Vampeta";
		String	string3 = new String("Vampeta");

		n = (42 > 1) ? 42 : -42;
		System.out.println(n);
		n = (42 < 1) ? 42 : -42;
		System.out.println(n);
		n = (42 >= 1) ? 42 : -42;
		System.out.println(n);
		n = (42 <= 1) ? 42 : -42;
		System.out.println(n);
		n = (42 == 1) ? 42 : -42;
		System.out.println(n);
		n = (42 != 1) ? 42 : -42;
		System.out.println(n);
		System.out.println((string1 == string2) ? true : false);
		System.out.println((string1 == string3) ? true : false);
		System.out.println((string1.equals(string3)) ? true : false);
		System.out.println((true && true) ? true : false);
		System.out.println((true || false) ? true : false);
		System.out.println((!false) ? true : false);
		System.out.println((true ^ false) ? true : false);
		System.out.println(10 ^ 32);
		System.out.println(~-43);
	}
}