package ua.org.oa.angelikskors;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rabbit extends Pet implements Jumpable {

	public Rabbit(String name, double weight) {
		super(name, weight);

	}

	@Override
	public void jump() {
		System.out.println("I can jump");

	}

	@Override
	void eat() {
		System.out.println("My favourite dish is carrot!");

	}

	public void chump() {
		System.out.println("I am chumping everything! I love chumping wires ");

	}

	@Override
	void loveOwner() {
		System.out
				.println("I don't care about anyone and anything around me, I just like eating carrot");

	}

	public void showPicture() {
		JFrame fd = new JFrame();
		try {
			fd.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(
					"./rabbit.jpg")))));
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
