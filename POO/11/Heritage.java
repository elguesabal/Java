abstract class Person {
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

	public void birthday() {
		this.setAge(this.getAge() + 1);
	}
}

class Visitor extends Person {
	public Visitor(String name, int age, char gender) {
		super(name, age, gender);
	}
}

class Student extends Person {
	private int		registration;
	private String	course;

	public Student(String name, int age, char gender, int registration, String course) {
		super(name, age, gender);
		this.registration = registration;
		this.course = course;
	}

	public int getRegistration(int registration) {
		return (this.registration);
	}

	public void setRegistration() {
		this.registration = registration;
	}

	public String getCourse() {
		return (this.course);
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void cancelRegistration() {
		System.out.println("Enrollment cancelled");
	}

	public void paidRegistration() {
		System.out.println("Enrollment fee paid");
	}
}

final class Scholarship extends Student {
	private float	scholarship;

	public Scholarship(String name, int age, char gender, int registration, String course, float scholarship) {
		super(name, age, gender, registration, course);
		this.scholarship = scholarship;		
	}

	public float getScholarship() {
		return (this.scholarship);
	}

	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}

	public void renewScholarship() {
		System.out.println("Renew scholarship");
	}

	@Override
	public void paidRegistration() {
		System.out.println("Paid at a discount");
	}
}

public class Heritage {
	public static void main(String[] args) {
		// Person	person = new Person("José", 28, 'H');
		Visitor		visitor = new Visitor("José", 28, 'H');
		Student		student = new Student("José", 28, 'H', 123, "TI");
		Scholarship	scholarship = new Scholarship("José", 28, 'H', 123, "TI", 500f);

		student.paidRegistration();
		scholarship.paidRegistration();
	}
}