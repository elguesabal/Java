class Controller {

}

class RemoteControl {
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
}

public class Encapsulation {
	public static void main(String[] args) {

	}
}