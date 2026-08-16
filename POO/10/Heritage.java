class Person {
	private String	name;
	private int		age;
	private char	gender;

	public Person(String name, int age, char gender) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
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

	public char getGender() {
		return (this.gender);
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}

class Student extends Person {
	public Student(String name, int age, char gender) {
		super(name, age, gender);
	}
}

class Teacher extends Person {
	public Teacher(String name, int age, char gender) {
		super(name, age, gender);
	}
}

class Employee extends Person {
	public Employee(String name, int age, char gender) {
		super(name, age, gender);
	}
}

public class Heritage {
	public static void main(String[] args) {

	}
}