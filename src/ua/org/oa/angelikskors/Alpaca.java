package ua.org.oa.angelikskors;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Alpaca extends Pet implements CanSmell, Voiceable, CanProtect,
		Cuttable {
	private boolean fur;

	public Alpaca(String name, double weight, boolean fur) {
		super(name, weight);
		setFur(fur);
	}

	public boolean isFur() {
		return fur;
	}

	public void setFur(boolean fur) {
		this.fur = fur;
	}

	@Override
	void eat() {
		System.out.println("I am eating! Don't disturb me!");

	}

	@Override
	void loveOwner() {
		System.out.println("I love my Owner!");

	}

	@Override
	public void voice() {
		System.out.println("My voice?! Oh! what a strange man?! ");

	}

	@Override
	public void smell() {
		System.out
				.println("I m very curious ! I am always looking for some food");
	}

	@Override
	public void smell(boolean owners, boolean thief, boolean somethingElse) {
		System.out
				.println("Are you serious man? I am not a dog!I don't look for thieves");

	}

	@Override
	public void attack() {
		System.out
				.println("I am just like a SUPER MAN!!! All criminals must be afraid of me!");

	}

	@Override
	public void protect(boolean owners, boolean thief, boolean somethingElse) {

		System.out.println("I am going to be a lifeguard of my Owner");
	}

	public void showPicture() {
		JFrame fd = new JFrame();
		try {
			fd.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(
					"./alpakas.jpg")))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not exist");
		}
		fd.setResizable(false);
		fd.pack();
		fd.setVisible(true);

	}

	@Override
	public void cutTheFur(boolean fur) {
		if (fur) {
			System.out.println("I have a very soft fur!");
		} else
			System.out.println("I have just had an haircut");
	}

}
