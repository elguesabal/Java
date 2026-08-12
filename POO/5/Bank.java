class Account {
	private int		number;
	private String	type;
	private String	name;
	private float	balance;
	private boolean	status;

	public Account(String name) {
		this.name = name;
		this.balance = 0;
		this.status = false;
		System.out.println("Create an account...");
	}

	public int getNumber() {
		return (this.number);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return (this.type);
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return (this.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return (this.balance);
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public boolean getStatus() {
		return (this.status);
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void openAccount(String type) {
		if (type.equals("CC")) {
			this.balance += 50;
		} else if (type.equals("CP")) {
			this.balance += 150;
		} else {
			System.out.println("Error");
			return;
		}
		this.type = type;
		this.status = true;
	}

	public void closeAccount() {
		if (this.status == false || this.balance != 0) {
			System.out.println("Error");
			return;
		}
		this.status = false;
	}

	public void deposit(float value) {
		if (this.status == false) {
			System.out.println("Error");
			return;
		}
		this.balance += value;
	}

	public void withdraw(float value) {
		if (this.status == false || (this.balance - value) < 0) {
			System.out.println("Error");
			return;
		}
		this.balance -= value;
	}

	public void payMonthly() {
		if (this.status == false) {
			System.out.println("Error");
			return;
		}
		if ("CC".equals(this.type)) {
			this.balance -= 12;
		} else if ("CP".equals(this.type)) {
			this.balance -= 20;
		} else {
			System.out.println("Error");
			return;
		}
	}
}

public class Bank {
	public static void main(String[] args) {
		Account	account = new Account("Vampeta");

		account.openAccount("CP");
		account.deposit(100);
		System.out.println("Name: " + account.getName());
		System.out.printf("Balance: %.2f\n", account.getBalance());
	}
}