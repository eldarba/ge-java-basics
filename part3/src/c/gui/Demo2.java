package c.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo2 {

	public static void main(String[] args) {

		JFrame fr = new JFrame("my app");
		fr.setBounds(100, 100, 600, 400);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);

		// id
		JLabel lbId = new JLabel("id");
		lbId.setBounds(10, 10, 100, 25);
		fr.add(lbId);

		JTextField tfId = new JTextField();
		tfId.setBounds(100, 10, 100, 25);
		fr.add(tfId);

		// name
		JLabel lbName = new JLabel("name");
		lbName.setBounds(10, 40, 100, 25);
		fr.add(lbName);

		JTextField tfName = new JTextField();
		tfName.setBounds(100, 40, 100, 25);
		fr.add(tfName);

		// birthdate
//		JLabel lbId = new JLabel("id");
//		lbId.setBounds(10, 10, 100, 25);
//		fr.add(lbId);
//		
//		JTextField tfId = new JTextField();
//		tfId.setBounds(100, 10, 100, 25);
//		fr.add(tfId);

		fr.setVisible(true);

	}

}
