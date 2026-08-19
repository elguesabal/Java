interface VideoActions {
	public abstract void play();
	public abstract void pause();
	public abstract void like();
}

class Video implements VideoActions {
	private String	title;
	private float	assessment;
	private int		views;
	private int		likes;
	private boolean	playing;

	public Video(String title) {
		this.setTitle(title);
		this.assessment = 1;
		this.setViews(0);
		this.setLikes(0);
		this.setPlaying(false);
	}

	public String getTitle() {
		return (this.title);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getAssessment() {
		return (this.assessment);
	}

	public void setAssessment(float assessment) {
		this.assessment = (this.getAssessment() + assessment) / this.getViews();
	}

	public int getViews() {
		return (this.views);
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return (this.likes);
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public boolean getPlaying() {
		return (this.playing);
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	@Override
	public void play() {
		this.setPlaying(true);
	}

	@Override
	public void pause() {
		this.setPlaying(false);
	}

	@Override
	public void like() {
		this.setLikes(this.getLikes() + 1);
	}
}

abstract class Person {
	protected String	name;
	protected int		age;
	protected char		gender;
	protected int		experience;

	public Person(String name, int age, char gender) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
		this.setExperience(0);
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

	public int getExperience() {
		return (this.experience);
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	protected void gainExperience(int experience) {
		this.setExperience(this.getExperience() + experience);
	}
}

class Gafanhoto extends Person {
	private String	login;
	private int		views;

	public Gafanhoto(String name, int age, char gender, String login) {
		super(name, age, gender);
		this.setLogin(login);
		this.setViews(0);
	}

	public String getLogin() {
		return (this.login);
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getViews() {
		return (this.views);
	}

	public void setViews(int views) {
		this.views = views;
	}

	public void watchVideo() {
		this.setViews(this.getViews() + 1);
	}
}

class View {
	private Gafanhoto	gafanhoto;
	private Video		video;

	public View(Gafanhoto gafanhoto, Video video) {
		this.setGafanhoto(gafanhoto);
		this.setVideo(video);
		this.getVideo().setViews(this.getVideo().getViews() + 1);
		this.getGafanhoto().setViews(this.getGafanhoto().getViews() + 1);
	}

	public Gafanhoto getGafanhoto() {
		return (this.gafanhoto);
	}

	public void setGafanhoto(Gafanhoto gafanhoto) {
		this.gafanhoto = gafanhoto;
	}

	public Video getVideo() {
		return (this.video);
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public void evaluate() {
		this.getVideo().setAssessment(5);
	}

	public void evaluate(int score) {
		this.getVideo().setAssessment(score);
	}

	public void evaluate(float score) {
		if (score <= 20) {
			this.getVideo().setAssessment(3);
		} else if (score <= 50) {
			this.getVideo().setAssessment(5);
		} else if (score <= 90) {
			this.getVideo().setAssessment(8);
		} else {
			this.getVideo().setAssessment(10);
		}
	}
}

public class Exercise {
	public static void main(String[] args) {
		Video		video1 = new Video("OOP Class 1");
		Video		video2 = new Video("OOP Class 12");
		Video		video3 = new Video("OOP Class 15");
		Gafanhoto	gafanhoto = new Gafanhoto("Jubileu", 22, 'M', "juba");
		View		view = new View(gafanhoto, video1);

		System.out.println("Score: " + video1.getAssessment());
		view.evaluate();
		System.out.println("Score: " + video1.getAssessment());
		view.evaluate(6);
		System.out.println("Score: " + video1.getAssessment());
		view.evaluate(90f);
		System.out.println("Score: " + video1.getAssessment());
	}
}