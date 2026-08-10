public class Register {
	public static void main(String[] args) {
		Person	person = new Person("Vampeta", 42);

		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
}