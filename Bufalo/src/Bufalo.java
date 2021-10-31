public class Bufalo {

	public static void main(String[] args) 
		//Exception handling
		throws java.io.IOException {
		
		//declaring variable input for users
		char input;
		int input2;
		
		System.out.println("Press any key, then press ENTER: ");//first output
		input = (char) System.in.read(); //keyboard reader, reads one byte at a time
		System.out.println("You entered the key:  " + input);//first output
		
		
		//Reading the two invisible items, carriage return and the line feed to empty out the buffer
		//Carriage return takes the cursor back to the beginning of the line
		input2 = System.in.read(); //Read  the first one and discard it because we are not using it
		System.out.println("Invisible character: " + input2);
		
		input2 = System.in.read();//Read the second one and discard it because we are not using it
		System.out.println("Invisible character: " + input2);
		
		
		System.out.println("\nPress any second key: ");//asking the user the second time
		input = (char) System.in.read(); //keyboard reader the second time, reads one byte at a time
		System.out.println("You second key was:  " + input); //the second output
	}

}
