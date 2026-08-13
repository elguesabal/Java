interface Controller {
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void openMenu();
	public abstract void closeMenu();
	public abstract void increaseVolume();
	public abstract void lowerVolume();
	public abstract void mute();
	public abstract void muteOff();
	public abstract void play();
	public abstract void pause();
}

class RemoteControl implements Controller {
	private int		volume;
	private boolean	on;
	private boolean playing;

	public RemoteControl() {
		this.volume = 50;
		this.on = false;
		this.playing = false;
	}

	private int getVolume() {
		return (this.volume);
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getOn() {
		return (this.on);
	}

	private void setOn(boolean on) {
		this.on = on;
	}

	private boolean getPlaying() {
		return (this.playing);
	}

	private void setPlaying(boolean playing) {
		this.playing = playing;
	}

	@Override
	public void turnOn() {
		this.setOn(true);
	}

	@Override
	public void turnOff() {
		this.setOn(false);
	}

	@Override
	public void openMenu() {
		if (!this.getOn()) {
			return;
		}
		System.out.print("Volume: ");
		for (int i = 0; i < this.getVolume(); i += 5) {
			System.out.print("|");
		}
		System.out.println();
		System.out.print((this.getPlaying()) ? "Playing" : "Paused");
	}

	@Override
	public void closeMenu() {
		System.out.print("Close menu...");
	}

	@Override
	public void increaseVolume() {
		if (this.getOn() && this.getVolume() < 100) {
			this.setVolume(this.getVolume() + 5);
		}
	}

	@Override
	public void lowerVolume() {
		if (this.getOn() && this.getVolume() > 0) {
			this.setVolume(this.getVolume() - 5);
		}
	}

	@Override
	public void mute() {
		if (this.getOn() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void muteOff() {
		if (this.getOn() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.getOn() && !this.getPlaying()) {
			this.setPlaying(true);
		}
	}

	@Override
	public void pause() {
		if (this.getOn() && this.getPlaying()) {
			this.setPlaying(false);
		}
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		RemoteControl	control = new RemoteControl();

		control.turnOn();
		control.openMenu();
	}
}