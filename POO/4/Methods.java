class Pen {
	private String	model;
	private String	color;
	private float	tip;
	private int		charge;
	private boolean	covered;

	public Pen() {
		this.setCharge(100);
		this.setCovered(true);
	}

	public Pen(String model) {
		this.setModel(model);
		this.setCharge(100);
		this.setCovered(true);
	}

	public Pen(String model, String color, float tip) {
		this.setModel(model);
		this.setColor(color);
		this.setTip(tip);
		this.setCharge(100);
		this.setCovered(true);
	}

	public String getModel() {
		return (this.model);
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return (this.color);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getTip() {
		return (this.tip);
	}

	public void setTip(float tip) {
		this.tip = tip;
	}

	public int getCharge() {
		return (this.charge);
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public boolean getCovered() {
		return (this.covered);
	}

	public void setCovered(boolean covered) {
		this.covered = covered;
	}
}

public class Methods {
	public static void main(String[] args) {
		Pen	pen1 = new Pen();
		Pen	pen2 = new Pen("Bic");
		Pen	pen3 = new Pen("Bic", "Red", 0.7f);

		System.out.println("Model: " + pen1.getModel());
		System.out.println("Color: " + pen1.getColor());
		System.out.println("Tip: " + pen1.getTip());
		System.out.println("Charge: " + pen1.getCharge());
		System.out.println("Covered: " + pen1.getCovered());
		pen1.setModel("Bic");
		pen1.setColor("Blue");
		pen1.setTip(0.5f);
		pen1.setCharge(50);
		pen1.setCovered(false);
		System.out.println("Model: " + pen1.getModel());
		System.out.println("Color: " + pen1.getColor());
		System.out.println("Tip: " + pen1.getTip());
		System.out.println("Charge: " + pen1.getCharge());
		System.out.println("Covered: " + pen1.getCovered());
		System.out.println();
		System.out.println("Model: " + pen2.getModel());
		System.out.println("Color: " + pen2.getColor());
		System.out.println("Tip: " + pen2.getTip());
		System.out.println("Charge: " + pen2.getCharge());
		System.out.println("Covered: " + pen2.getCovered());
		System.out.println();
		System.out.println("Model: " + pen3.getModel());
		System.out.println("Color: " + pen3.getColor());
		System.out.println("Tip: " + pen3.getTip());
		System.out.println("Charge: " + pen3.getCharge());
		System.out.println("Covered: " + pen3.getCovered());
	}
}