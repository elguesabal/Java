class Person {
	private String name;
	private int age;
	private char sex;

	public Person(String name, int age, char sex) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
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

	public char getSex() {
		return (this.sex);
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void birthday() {

	}
}

interface Pageable {
	public abstract void open();
	public abstract void close();
	public abstract void flipPages(int page);
	public abstract void nextPage();
	public abstract void previousPage();
}

class Book implements Pageable {
	private String	title;
	private String	author;
	private int		pagesLength;
	private int		pageCurrent;
	private boolean	open;
	private	Person	reader;

	public Book(String title, String author, int pagesLength, Person reader) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPagesLength(pagesLength);
		this.setPageCurrent(0);
		this.setOpen(false);
		this.setReader(reader);
	}

	public String getTitle() {
		return (this.title);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return (this.author);
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPagesLength() {
		return (this.pagesLength);
	}

	public void setPagesLength(int pagesLength) {
		this.pagesLength = pagesLength;
	}

	public int getPageCurrent() {
		return (this.pageCurrent);
	}

	public void setPageCurrent(int pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	public boolean getOpen() {
		return (this.open);
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public Person getReader() {
		return (this.reader);
	}

	public void setReader(Person reader) {
		this.reader = reader;
	}

	public void details() {
		System.out.println("title: " + this.getTitle());
		System.out.println("author: " + this.getAuthor());
		System.out.println("pageslength: " + this.getPagesLength());
		System.out.println("pageCurrent: " + this.getPageCurrent());
		System.out.println("open: " + ((this.getOpen()) ? "true" : "false"));
		System.out.println("reader: " + this.getReader().getName());
	}

	@Override
	public void open() {
		this.setOpen(true);
	}

	@Override
	public void close() {
		this.setOpen(false);
	}

	@Override
	public void flipPages(int page) {
		if (page >= 0 && page < this.getPagesLength()) {
			this.setPageCurrent(page);
		}
	}

	@Override
	public void nextPage() {
		if (this.getPageCurrent() < this.getPagesLength()) {
			this.setPageCurrent(this.getPageCurrent() + 1);
		}
	}

	@Override
	public void previousPage() {
		if (this.getPageCurrent() > 0) {
			this.setPageCurrent(this.getPageCurrent() + 1);
		}
	}
}

public class Library {
	public static void main(String[] args) {
		Person	person1 = new Person("Pedro", 22, 'M');
		Person	person2 = new Person("Maria", 31, 'F');
		Book	book1 = new Book("Java básico", "José da Silva", 300, person1);
		Book	book2 = new Book("POO em Java", "Maria de Souza", 500, person1);
		Book	book3 = new Book("Java avançado", "Ana Paula", 800, person2);

		book1.flipPages(200);
		book1.details();
	}
}