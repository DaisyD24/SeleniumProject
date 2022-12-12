package seleniumDemo;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal obj = new Animal();
		
		obj.noTalk();
		obj.isDog();
		obj.mouth();
		obj.walk();
		
	System.out.println("It has");
	obj.hasLegs(2,2);
	System.out.println("legs");
	}

 public void noTalk() {
System.out.println("An Animal can not Talk");	 
 }
 private void isDog() {
	 System.out.println("A Dog is an Animal.");
 }
 void mouth() {
	 System.out.println("It has big mouth");
 }
 protected void walk() {
	 System.out.println("It can walk");
 }
 public int hasLegs(int a,int b) {
	 System.out.println(a+b);
		 return a+b;
 }
}
