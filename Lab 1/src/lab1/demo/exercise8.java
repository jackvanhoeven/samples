package lab1.demo;
import java.util.Scanner;


public class exercise8 {

public static void main(String[] args) {
		
		//get input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many person : ");
		int personCount = sc.nextInt();
		
		personList Person = new personList();
		Person[] person = new Person[personCount];//create an array human object and get the name and weight on earth
		for(int i = 0;i<personCount;i++) {
		person[i] = new Person();
		System.out.print("\nperson name : ");
		sc.nextLine();
		String name = sc.nextLine();
		person[i].setName(name);
		System.out.print("\nperson weight(KG) : ");
		double weight = sc.nextDouble();
		person[i].setWeight(weight);
		
		
		//weight on earth is convert to weight on mars
		weigthConverter weightConverter = new weigthConverter();
		int weightInInt = ((int)(weightConverter.getMarsWeight(person[i].getWeight()*100))+5);//simple decimal point converter
		person[i].setMarsWeight((double)weightInInt/100);// set the value to human attribute
		
		Person.people.add(person[i]);
		}
		
		//display the weight on earth and weight on mars by using the arrayList
		for(int i = 0;i<Person.people.size();i++) {
			
		System.out.println("\n\n"+Person.people.get(i).getName()+" weight on Earth : "+Person.people.get(i).getWeight()+"KG");
		System.out.println(Person.people.get(i).getName()+" weight on Mars : "+Person.people.get(i).getMarsWeight()+"KG");
		}
		sc.close();
	}
}
