package learnConstructor;

public class Human {
	
	String name, gender;
	int idNo;
	
	//Constructor Human (Default Constructor)
	Human(){
		
		System.out.println("No data");
	}
	
	
	//Parameterize constructor
	Human(String n, String g){
		
		name = n;
		gender = g;
	}
	
	Human(String n, String g, int i){
		
		name = n;
		gender = g;
		idNo = i;
		
	}
	
	void displayInfo() {
		
		System.out.println("name:  "+ name);
		System.out.println("gender:  "+ gender);
		System.out.println("idNo:  "+ idNo);
	}
	
	public static void main(String[] args) {
		
		Human human = new Human();
		human.displayInfo();
		
		Human human1 = new Human("Touhid Choudhury", "Male");
		human1.displayInfo();
		
		Human human2 = new Human("Sumaiya Chowdhury", "Female", 1001);
		human2.displayInfo();
	}}

