abstract class Animal {
	protected String	weight;
	protected int		age;
	protected int		limb;

	public Animal(String weight, int age, int limb) {
		this.setWeight(weight);
		this.setAge(age);
		this.setLimb(limb);
	}

	public String getWeight() {
		return (this.weight);
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getAge() {
		return (this.age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLimb() {
		return (this.limb);
	}

	public void setLimb(int limb) {
		this.limb = limb;
	}

	abstract public void move();
	abstract public void feed();
	abstract public void sound();
}

class Mammal extends Animal {
	private	String	color;

	public Mammal(String weight, int age, int limb, String color) {
		super(weight, age, limb);
		this.setColor(color);
	}

	public String getColor() {
		return (this.color);
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("Running");
	}

	@Override
	public void feed() {
		System.out.println("Sucking");
	}

	@Override
	public void sound() {
		System.out.println("Mammal sound");
	}
}

class Reptile extends Animal {
	private	String	color;

	public Reptile(String weight, int age, int limb, String color) {
		super(weight, age, limb);
		this.setColor(color);
	}

	public String getColor() {
		return (this.color);
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("Crawling");
	}

	@Override
	public void feed() {
		System.out.println("Eating vegetables");
	}

	@Override
	public void sound() {
		System.out.println("Reptile sound");
	}
}

class Fish extends Animal {
	private	String	color;

	public Fish(String weight, int age, int limb, String color) {
		super(weight, age, limb);
		this.setColor(color);
	}

	public String getColor() {
		return (this.color);
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("Swimming");
	}

	@Override
	public void feed() {
		System.out.println("Eating substances");
	}

	@Override
	public void sound() {
		System.out.println("Fish don't make sound");
	}

	public void bubble() {
		System.out.println("It blew a bubble.");
	}
}

class Bird extends Animal {
	private	String	color;

	public Bird(String weight, int age, int limb, String color) {
		super(weight, age, limb);
		this.setColor(color);
	}

	public String getColor() {
		return (this.color);
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("Flying");
	}

	@Override
	public void feed() {
		System.out.println("Eating fruit");
	}

	@Override
	public void sound() {
		System.out.println("Bird sound");
	}

	public void nest() {
		System.out.println("It built a nest");
	}
}

class Kangaroo extends Mammal {
	public Kangaroo(String weight, int age, int limb, String color) {
		super(weight, age, limb, color);
	}

	@Override
	public void move() {
		System.out.println("Jumping");
	}

	public void bag() {
		System.out.println("Carrying a bag");
	}
}

class Wolf extends Mammal {
	public Wolf(String weight, int age, int limb, String color) {
		super(weight, age, limb, color);
	}

	@Override
	public void sound() {
		System.out.println("Auuuuuuuuu");
	}
}

class Dog extends Mammal {
	public Dog(String weight, int age, int limb, String color) {
		super(weight, age, limb, color);
	}

	@Override
	public void sound() {
		System.out.println("Au Au");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Mammal		mammal = new Mammal("60kg", 20, 4, "orange");
		Reptile		reptile = new Reptile("1kg", 2, 0, "white");
		Fish		fish = new Fish("0.5kg", 1, 2, "blue");
		Bird		bird = new Bird("2kg", 3, 2, "black");
		Kangaroo	kangaroo = new Kangaroo("30kg", 10, 4, "brown");
		Wolf		wolf = new Wolf("20kg", 5, 4, "black");
		Dog			dog = new Dog("5kg", 10, 4, "yellow");

		System.out.print("Mammal: ");
		mammal.move();
		System.out.print("Reptile: ");
		reptile.move();
		System.out.print("Fish: ");
		fish.move();
		System.out.print("Bird: ");
		bird.move();
		System.out.print("Kangaroo: ");
		kangaroo.move();
		System.out.print("Wolf: ");
		wolf.move();
		System.out.print("Dog: ");
		dog.move();
	}
}