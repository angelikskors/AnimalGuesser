package ua.org.oa.angelikskors;

import java.util.Random;
import java.util.Scanner;

public class PetSimulator implements AnimalConstants {

	static final boolean NO = true;

	public static void main(String[] args) {
		System.out.println("                                HI!");
		System.out.println("                Can you guess what animal I am?");
		System.out.println("                I will help with my features...");
		System.out.println();
		answer(ask());

	}

	public static int ask() {
		Random rand = new Random();
		int prob = (int) (100 * rand.nextDouble());
		if (prob < 25)
			return ALPACA;
		else if (prob < 50)
			return DOG;
		else if (prob < 75)
			return LEMUR;
		else if (prob < 75)
			return RABBIT;
		else
			return NOANIMAL;

	}

	static void answer(int result) {
		switch (result) {
		case ALPACA:
			Alpaca a = new Alpaca("Alpaca", 230, true);
			a.attack();
			System.out.println();
			a.protect(true, false, false);
			System.out.println();
			a.smell(false, false, false);
			System.out.println();
			a.cutTheFur(true);
			System.out.println();
			a.smell();
			if (guess())
				a.showPicture();

			break;
		case DOG:
			Dog b = new Dog("Dog", 30);

			b.loveOwner();
			System.out.println();
			b.smell(false, false, false);
			System.out.println();
			b.protect(true, false, false);
			if (guess())
				b.showPicture();

			break;
		case LEMUR:
			Lemur c = new Lemur("Lemur", 35);
			c.eat();
			System.out.println();
			c.jump();
			System.out.println();
			c.loveOwner();
			System.out.println();
			c.voice();
			System.out.println();
			if (guess())
				c.showPicture();
			break;
		case RABBIT:
			Rabbit d = new Rabbit("Rabbit", 10);
			d.eat();
			System.out.println();
			d.jump();
			System.out.println();
			d.loveOwner();
			System.out.println();
			if (guess())
				d.showPicture();
			break;

		case NOANIMAL:
			System.out.println("Try again later. I am confused");

		}
	}

	private static boolean guess() {

		System.out.println();
		Scanner newscan = new Scanner(System.in);
		System.out
				.println("                Have you already guessed what animal I am ?             ");
		System.out
				.println("                Please, write down YES or NO                  ");
		String input;
		input = newscan.next();
		if (input.equals("NO")) {
			return NO;
		} else
			return false;
	}

}
