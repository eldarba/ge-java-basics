package c.gui;

import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import b.dao.Person;
import b.dao.PersonDao;
import b.dao.PersonDaoDb;

public class Demo3PersonApp {

	private PersonDao personDao = new PersonDaoDb();

	public void createAndShowGui() {

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

		// add action listener to the add button
		btAdd.addActionListener((e) -> {
			try {
				int id = Integer.parseInt(tfId.getText());
				String name = tfName.getText();
				LocalDate birthdate = LocalDate.parse(tfBirthdate.getText());
				Person person = new Person(id, name, birthdate);
				this.personDao.add(person);
				JOptionPane.showMessageDialog(fr, "person added");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(fr, "Input Error: " + e2.getMessage());
			}
		});

		fr.setVisible(true);

	}

	public static void main(String[] args) {
		Demo3PersonApp gui = new Demo3PersonApp();
		gui.createAndShowGui();
	}

}
