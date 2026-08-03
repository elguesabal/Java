import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Swing3 {
	public static void main(String[] args) {
		JFrame	window = new JFrame("Window");
		JButton	button = new JButton("Button");

		button.addActionListener((e) -> {
			button.setText("Vampeta");
			JOptionPane.showMessageDialog(null, "Vampeta");
		});
		window.add(button);
		window.setSize(400, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}