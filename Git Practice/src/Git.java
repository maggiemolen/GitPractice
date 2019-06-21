import java.util.*;

public class Git {
	
	String name;
	String location;
	int yearsCoding;
	String timeZone;
	
	Git(String newName, String yourLocation, int codingTenure) {
		
		name = newName;
		location = yourLocation;
		yearsCoding = codingTenure;
	}
	
	public String getName() {
	    return name;
	}
	
	public static void main(String[] args) {
		System.out.println("Hi Collaborator! State your name, city, and how many years you've been coding."); 
		System.out.println("Put each answer in new line.");
		Scanner in = new Scanner(System.in);
		Git newCollaborator = new Git(in.nextLine(), in.nextLine(), in.nextInt());
		System.out.println("Welcome, " + newCollaborator.getName() + " feel free to add some new code to this class.");
	} 
}
