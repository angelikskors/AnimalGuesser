package ua.org.oa.angelikskors;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lemur extends Pet implements Jumpable, Voiceable {

	public Lemur(String name, double weight) {
		super(name, weight);

	}

	@Override
	void eat() {
		System.out.println("I am eating using my little fingeres");

	}

	@Override
	void loveOwner() {
		System.out.println("I am so cute. I am beloved by everyone!");

	}

	@Override
	public void voice() {
		System.out.println(" Mrrrrrrrrrrrrrrrrrrr");

	}

	@Override
	public void jump() {
		System.out
				.println("Jehooooooooooooooooo!!!!!!!! I'm flying from tree to tree!");

	}

	public void showPicture() {
		JFrame fd = new JFrame();
		try {
			fd.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(
					"./lemur.jpg")))));
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
