import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Swing1 {
	public static void main(String[] args) {
		JFrame 	window = new JFrame("Window");
		JLabel 	text = new JLabel("Vampeta");

		window.add(text);
		window.setSize(400, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}