import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Monkey {

}

@Monkey
class Gorilla {
	public void eat() {
		System.out.println("🐒🍌");
	}
}

class Dog {
	public void bark() {
		System.out.println("🐶");
	}
}

public class Annotation {
	public static void main(String[] args) {
		System.out.println(Gorilla.class.isAnnotationPresent(Monkey.class));
		System.out.println(Dog.class.isAnnotationPresent(Monkey.class));
	}
}