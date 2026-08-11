class Pen {
	String	model;
	String	color;
	float	tip;
	int		charge;
	boolean	covered;

	void status() {
		System.out.println("--- Status ---");
		System.out.println("Model: " + this.model);
		System.out.println("Color: " + this.color);
		System.out.println("Tip: " + this.tip);
		System.out.println("Charge: " + this.charge);
		System.out.println("Covered: " + this.covered);
	}

	void toScribble() {
		if (this.covered) {
			System.out.println("Erro");
		} else {
			System.out.println("Writing");
		}
	}

	void toCover() {
		this.covered = true;
	}

	void toUncover() {
		this.covered = false;
	}
}

public class Class {
	public static void main(String[] args) {
		Pen	pen = new Pen();

		pen.model = "Bic";
		pen.color = "blue";
		pen.tip = 0.5f;
		pen.toScribble();
		pen.toCover();
		pen.toScribble();
		pen.toUncover();
		pen.toScribble();
		pen.status();
	}
}