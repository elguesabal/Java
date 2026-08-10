public class Array1 {
	public static void main(String[] args) {
		int	n1[] = { 4, 2 };
		int	n2[] = new int[2];

		n2[0] = 4;
		n2[1] = 2;
		for (int i = 0; i < n1.length; i++) {
			System.out.println(n1[i]);
		}
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n2[i]);
		}
		for (int n : n1) {
			System.out.println(n);
		}
	}
}