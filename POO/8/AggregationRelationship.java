class Fighter {
	private String	name;
	private String	nationality;
	private int		age;
	private float	height;
	private float	weight;
	private String	category;
	private int		victories;
	private int		defeats;
	private int		draws;

	public Fighter(String name, String nationality, int age, float height, float weight) {
		this.setName(name);
		this.setNationality(nationality);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setVictories(0);
		this.setDefeats(0);
		this.setDraws(0);
	}

	public String getName() {
		return (this.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return (this.nationality);
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return (this.age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return (this.height);
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return (this.weight);
	}

	public void setWeight(float weight) {
		this.weight = weight;
		this.setCategory(weight);
	}

	public String getCategory() {
		return (this.category);
	}

	public void setCategory(float weight) {
		if (weight < 52.2) {
			this.category = "Invalid";
		} else if (weight <= 70.3) {
			this.category = "Light";
		} else if (weight <= 83.9) {
			this.category = "Average";
		} else if (weight <= 120.2) {
			this.category = "Heavy";
		} else {
			this.category = "Invalid";
		}
	}

	public int getVictories() {
		return (this.victories);
	}

	public void setVictories(int victories) {
		this.victories = victories;
	}

	public int getDefeats() {
		return (this.defeats);
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}

	public int getDraws() {
		return (this.draws);
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public void present() {
		System.out.println("Name: " + this.getName());
		System.out.println("Nationality: " + this.getNationality());
		System.out.println("Age: " + this.getAge());
		System.out.println("Height: " + this.getHeight());
		System.out.println("Weight: " + this.getWeight());
		System.out.println("Category: " + this.getCategory());
		System.out.println("Victories: " + this.getVictories());
		System.out.println("Defeats: " + this.getDefeats());
		System.out.println("Draws: " + this.getDraws());
	}

	public void winFight() {
		this.setVictories(this.getVictories() + 1);
	}

	public void loseFight() {
		this.setDefeats(this.getDefeats() + 1);
	}

	public void drawFight() {
		this.setDraws(this.getDraws() + 1);
	}
}

class Fight {
	private Fighter	challenged;
	private Fighter	challenging;
	private int		rounds;
	private boolean	approved;

	public Fight(Fighter challenged, Fighter challenging) {
		this.setChallenged(challenged);
		this.setChallenging(challenging);
	}

	public Fighter getChallenged() {
		return (this.challenged);
	}

	public void setChallenged(Fighter challenged) {
		this.challenged = challenged;
	}

	public Fighter getChallenging() {
		return (this.challenging);
	}

	public void setChallenging(Fighter challenging) {
		this.challenging = challenging;
	}

	public int getRounds() {
		return (this.rounds);
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getApproved() {
		return (this.approved);
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public void scheduleFight() {
		if (this.getChallenged().getName().equals(this.getChallenging().getName())) {
			System.out.println("Error");
			this.setApproved(false);
		} else if (!this.getChallenged().getCategory().equals(this.getChallenging().getCategory())) {
			System.out.println("Error");
			this.setApproved(false);
		} else {
			this.setApproved(true);
		}
	}

	public void fight() {
		if (!this.getApproved()) {
			System.out.println("Error");
			return;
		}
		this.getChallenged().present();
		System.out.println();
		this.getChallenging().present();
		System.out.println();
		int	winner = (int) (Math.random() * 3);
		switch (winner) {
			case 0:
				System.out.println("Draw");
				this.getChallenged().drawFight();
				this.getChallenging().drawFight();
				break;
			case 1:
				System.out.println(this.getChallenged().getName() + " winner");
				this.getChallenged().winFight();
				this.getChallenging().loseFight();
				break;
			case 2:
				System.out.println(this.getChallenging().getName() + " winner");
				this.getChallenged().loseFight();
				this.getChallenging().winFight();
				break;
		}
	}
}

public class AggregationRelationship {
	public static void main(String[] args) {
		Fighter	fighter1 = new Fighter("Pretty Boy", "França", 31, 1.75f, 68.9f);
		Fighter	fighter2 = new Fighter("Putscript", "Brasil", 29, 1.68f, 57.8f);
		Fighter	fighter3 = new Fighter("Snapshadow", "EUA", 35, 1.65f, 80.9f);
		Fighter	fighter4 = new Fighter("Dead Code", "Austrália", 28, 1.93f, 81.6f);
		Fight	fight = new Fight(fighter1, fighter2);

		fight.scheduleFight();
		fight.fight();
	}
}