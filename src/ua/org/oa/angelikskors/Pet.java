package ua.org.oa.angelikskors;

public abstract class Pet {
	public boolean owners = true;
	public boolean thief;
	public boolean someThingelse;
	private String name;
	private double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Pet(String name, double weight) {

		setName(name);
		setWeight(weight);

	}

	abstract void eat();

	abstract void loveOwner();

}
