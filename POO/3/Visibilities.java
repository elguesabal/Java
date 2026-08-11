class Pen {
	public String		model;
	public String		color;
	private float		tip;
	protected int		charge;
	protected boolean	covered;

	public void status() {
		System.out.println("--- Status ---");
		System.out.println("Model: " + this.model);
		System.out.println("Color: " + this.color);
		System.out.println("Tip: " + this.tip);
		System.out.println("Charge: " + this.charge);
		System.out.println("Covered: " + this.covered);
	}

	public void toScribble() {
		if (this.covered) {
			System.out.println("Erro");
		} else {
			System.out.println("Writing");
		}
	}

	public void toCover() {
		this.covered = true;
	}

	public void toUncover() {
		this.covered = false;
	}
}

public class Visibilities {
	public static void main(String[] args) {
		Pen	pen = new Pen();

		pen.model = "Bic";
		pen.color = "blue";
		pen.status();
	}
}