/*Alexis Olivo-Alvarez

INEW-2338 2801

21 November 2021

Create a program that reads passwords from a file + tests them against requirements */


package advancedJavaWeek4Assignment;

//imports
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class StrongPassword {

	public static void main(String[] args) {
		
		//declarations
		int numPass; //holds num of lines
		String pass; //holds password
		
		try (Scanner input = new Scanner(Paths.get("E:\\College\\Fall 2021\\Java Classes\\Java Repositories\\AdvancedJavaWeek4Assignment\\strong.txt"))) { //reads file
				
			numPass = input.nextInt(); //gets num lines
			
			for (int i = 0; i < numPass; i++) { //loop to go thru each line
				
				pass = input.next(); //gets password
				
				if (Pattern.matches("[A-Za-z!@#$%^&*()_+=0-9+]{8,50}", pass) || Pattern.matches("[a-z!@#$%^&*()_=0-9+]{8,50}", pass) || Pattern.matches("[A-Za-z0-9+]{8,50}", pass)) {
					//regex to determine if password matches requirements
					
					System.out.println("STRONG"); //if it matches, print strong
				}
				
				else {
					
					System.out.println("INVALID"); //if it doesn't match, print invalid
				}
				
			}
		} 
		
		catch (IOException e) { //exception if file cant be opened
			e.printStackTrace();
		}

	}

}
