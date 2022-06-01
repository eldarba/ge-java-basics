package c.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
		JLabel lbBirthdate = new JLabel("birthdate");
		lbBirthdate.setBounds(10, 70, 100, 25);
		fr.add(lbBirthdate);

		JTextField tfBirthdate = new JTextField();
		tfBirthdate.setBounds(100, 70, 100, 25);
		fr.add(tfBirthdate);

		// add button
		JButton btAdd = new JButton("Add");
		btAdd.setBounds(10, 100, 100, 25);
		fr.add(btAdd);
		// add listener to the button - using an implementing object
//		MyListener listener = new MyListener();
//		btAdd.addActionListener(listener);

		btAdd.addActionListener((e) -> {
			System.out.println("clicked");
		});

		fr.setVisible(true);

	}

}

class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("clicked");
	}

}
