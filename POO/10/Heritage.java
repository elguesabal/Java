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

	public void birthday() {
		this.setAge(this.getAge() + 1);
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
}

class Teacher extends Person {
	private String	specialty;
	private float	salary;

	public Teacher(String name, int age, char gender, String specialty, float salary) {
		super(name, age, gender);
		this.specialty = specialty;
		this.salary = salary;
	}

	public String getSpecialty() {
		return (this.specialty);
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public float getSalary() {
		return (this.salary);
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void getRaise(float raise) {
		this.setSalary(this.getSalary() + raise);
	}
}

class Employee extends Person {
	private String	sector;
	private boolean	working;

	public Employee(String name, int age, char gender, String sector, boolean working) {
		super(name, age, gender);
		this.sector = sector;
		this.working = working;
	}

	public String getSector() {
		return (this.sector);
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public boolean getWorking() {
		return (this.working);
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public void changeJobs() {
		this.setWorking(!this.getWorking());
	}
}

public class Heritage {
	public static void main(String[] args) {
		Person		person = new Person("José", 28, 'H');
		Student		student = new Student("Pedro", 30, 'H', 123, "TI");
		Teacher		teacher = new Teacher("Maria", 35, 'M', "Mathematics", 5000f);
		Employee	employee = new Employee("Fabiana", 25, 'H', "Computing", true);

		teacher.getRaise(500f);
		System.out.println(teacher.getSalary());
	}
}