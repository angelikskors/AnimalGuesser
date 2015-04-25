package ua.org.oa.angelikskors;

import java.awt.Container;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dog extends Pet implements CanSmell, Voiceable, CanProtect {

	public Dog(String name, double weight) {
		super(name, weight);

	}

	@Override
	void eat() {
		smell();
		System.out
				.println("I like eating everything you give me! I like bones most of all");

	}

	@Override
	void loveOwner() {
		System.out
				.println("I love my Owner very much and I am his devoted friend");

	}

	@Override
	public void voice() {
		System.out.println("Gaph -Gaph!");

	}

	public void search(boolean owners, boolean thief, boolean somethingElse) {

		smell(owners, thief, somethingElse);
		run();
	}

	private void run() {
		System.out.println("I 'm running very fast , but I am not a gepard");

	}

	@Override
	public void smell(boolean owners, boolean thief, boolean somethingElse) {
		System.out.println("I can distinguish anything by its smell");
		if (owners) {
			System.out.println("That's my owner");
		}
		if (thief) {
			System.out.println("That's thief!");
			attack();
		}
		if (somethingElse) {
			System.out.println("Strange! Try to find out!");
		}

	}

	@Override
	public void protect(boolean owners, boolean thief, boolean somethingElse) {
		if (owners)
			System.out.println("I can protect my owner!");
		if (thief) {
			voice();
			smell(owners, thief, somethingElse);
		}

	}

	@Override
	public void attack() {
		System.out.println("I can attack the enemy , because of FAS Command!");

	}

	@Override
	public void smell() {
		System.out.println("Smells good, i'll eat it");

	}

	public void showPicture() {
		JFrame fd = new JFrame();
		try {
			fd.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(
					"./dog.jpg")))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not exist");
		}
		fd.setResizable(false);
		fd.pack();
		fd.setVisible(true);

	}
}
