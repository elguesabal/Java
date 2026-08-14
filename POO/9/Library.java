class Person {
	private String name;
	private int age;
	private char sex;

	public Person(String name, int age, char sex) {
		setName(name);
		setAge(age);
		setSex(sex);
	}

	public String getName() {
		return (this.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return (this.age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return (this.sex);
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	// public void birthday() {

	// }
}

// interface Pageable {
// 	public abstract open();
// 	public abstract close();
// 	public abstract flipPages();
// 	public abstract nextPage();
// 	public abstract previousPage();
// }

// class Book {

// }

public class Library {
	public static void main(String[] args) {
		Person	person1 = new Person("Pedro", 22, 'M');
		Person	person2 = new Person("Maria", 31, 'F');
	}
}