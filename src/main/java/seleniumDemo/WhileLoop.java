package seleniumDemo;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] obj = new String[4];
			obj[0] = "Rumman";
			obj[1]= "shihab";
			obj[2] = "Mamun";
			obj[3]= "xyz";
				
			//By using loops we can performs various actions/thing
			
			for(int i=0;i<obj.length;i=i+1){
				//System.out.println(i); //For printing all index number
				//System.out.println(i + "United State of America"); //printing "United State of America" multiple times with index number
				System.out.println(obj[i]); //Printing all values from array
			}
	}

}
