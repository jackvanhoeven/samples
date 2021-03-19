package lab1.demo;

public class Person {
	
	private String name = "";
	private double weight = 0;
	private double marsWeight = 0;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setWeight(double weight) {
		this.weight  = weight;
	}
	
	double getWeight() {
		return weight;
	}
	
	void setMarsWeight(double marsWeight) {
		this.marsWeight = marsWeight;
	}
	
	double getMarsWeight() {
		return marsWeight;
	}
}
