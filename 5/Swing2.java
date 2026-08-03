import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing2 {
	public static void main(String[] args) {
		JFrame	window = new JFrame("Window");
		JButton	button = new JButton("Button");

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Vampeta");
			}
		});
		window.add(button);
		window.setSize(400, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}