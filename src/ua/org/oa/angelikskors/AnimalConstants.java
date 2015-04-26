package ua.org.oa.angelikskors;

public interface AnimalConstants {
	int ALPACA = 0;
	int DOG = 1;
	int LEMUR = 2;
	int RABBIT = 3;
	int NOANIMAL = 4;
}
//declaring interface that contains only constants it's a bad style
//if you need type that contains only constants use class or enum
/*
class AnimalConstants {

	private AnimalConstants(){
		//declare constructor as public, because you need only constants so instance of class should not be created
	}
	public static final int ALPACA = 0;
	public static final int DOG = 1;
	public static final int LEMUR = 2;
	public static final int RABBIT = 3;
	public static final int NO_ANIMAL = 4;// split name of variable using underscore in constants
}*/

/*enum Animals{
	ALPACA, DOG, LEMUR, RABBIT, NOANIMAL
}*/
