package test;

import java.util.Scanner;
import java.util.Date;
import java.util.HashMap;

//Hash Commands
	//dictionary.put(key(word),value(word))
	//containsKey(key(word)
	//get(key) -> value


public class TestDictionary {
	
	
	public static void main(String[] args) {
		String curr = "";
		String author = "";
		char yn;
		//Use a list
		HashMap<String,String> dictionary = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		String posted = new Date().toString();
		
		
		while (!curr.equals("q")) {
			System.out.println("Enter a word (type q to quit):");
			curr = scan.next();
			boolean exists = dictionary.containsKey(curr);
			
			//if word doesn't exist
			if(exists == false) {
				System.out.println("No definition exists for " + curr);
				System.out.println("Would you like to add a new definition?(y/n)");
				yn = scan.next().charAt(0);
				//yes
				if (yn == 'y') {
					System.out.println("Please enter your name below: ");
				    author = scan.nextLine();
					scan.nextLine();
					System.out.println("Please enter your definition below: ");
					String def = scan.nextLine();
					dictionary.put(curr,def);
					System.out.println("New definition added for " + curr);
				} 
				
			}
			if (exists == true) 
			{
				String statement = dictionary.get(curr) + "\nAuthor: " + author + "\nAdded on: " + posted;
				System.out.println(statement);
				//System.out.println(dictionary.get(curr));
				System.out.println("Redfine the definition for " + curr + " ?(y/n)");
				yn = scan.next().charAt(0);
				//yes
				if (yn == 'y') 
				{
					System.out.println("Please enter your name below: ");
					scan.nextLine();
					author = scan.nextLine();
					System.out.println("Please enter your definition below: ");
					String def = scan.nextLine();
					dictionary.put(curr, def);
					System.out.println("New definition added for " + curr);
				}

			}
	}
		System.out.print("Program closed");

	}
		
}
	

