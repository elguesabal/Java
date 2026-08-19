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

class Wolf extends Mammal {
	public Wolf(String weight, int age, int limb, String color) {
		super(weight, age, limb, color);
	}

	@Override
	public void sound() {
		System.out.println("Auuuuuuuuu");
	}
}

class Dog extends Wolf {
	public Dog(String weight, int age, int limb, String color) {
		super(weight, age, limb, color);
	}

	@Override
	public void sound() {
		System.out.println("Au Au");
	}

	public void react(String text) {
		if ("Hello".equals(text)) {
			System.out.println("Bark");
		} else {
			System.out.println("Growl");
		}
	}

	public void react(int hour, int minute) {
		if (hour < 12) {
			System.out.println("Wag");
		} else if (hour >= 18) {
			System.out.println("Ignore");
		} else {
			System.out.println("Wag and bark");
		}
	}

	public void react(boolean owner) {
		if (owner) {
			System.out.println("Wag");
		} else {
			System.out.println("Growl and bark");
		}
	}

	public void react(int age, float weight) {
		if (age < 5) {
			if (weight < 10) {
				System.out.println("Wag");
			} else {
				System.out.println("Bark");
			}
		} else {
			if (weight < 10) {
				System.out.println("Growl");
			} else {
				System.out.println("Ignore");
			}
		}
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Mammal		mammal = new Mammal("60kg", 20, 4, "orange");
		Wolf		wolf = new Wolf("20kg", 5, 4, "black");
		Dog			dog = new Dog("5kg", 10, 4, "yellow");

		System.out.print("Mammal: ");
		mammal.sound();
		System.out.print("Wolf: ");
		wolf.sound();
		System.out.print("Dog: ");
		dog.sound();
		System.out.println();
		dog.react("Hello");
		dog.react("Fuck");
		dog.react(11, 45);
		dog.react(19, 0);
		dog.react(true);
		dog.react(false);
		dog.react(2, 12.5f);
		dog.react(17, 4.5f);
	}
}