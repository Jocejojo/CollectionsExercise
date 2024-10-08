package collectionsJoce;

import java.util.Scanner;


public class CollectionsMain {

	private String input;

	public void testChecker() {
        //User input
		Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        input = sc.nextLine(); 
        System.out.println("Your input is: " + input);
        
        //Instantiate checker
        BracketChecker checker = new BracketChecker(input);
       
        //Print result
        if(checker.check()) {
        	System.out.println("Nice use of brackets!");
        }else {
        	System.out.println("Incorrect use of brackets!");
        }
	}
	
	
	public CollectionsMain() {
		this.testChecker();
	}
	
	
	public static void main(String[] args) {
		new CollectionsMain();
	}

}
