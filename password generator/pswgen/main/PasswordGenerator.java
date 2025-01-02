package main;

import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);

        String psw = null;
        String uBehave;
        int pswLength;

        System.out.println("Hello, fellow user, you shall generate a password with this app! :3");

        System.out.println("Please enter the length of the wanted password.");
        pswLength = Integer.parseInt(uInput.nextLine());

        System.out.println("Type 'generate' to generate, until you are satisfied.");
        System.out.println("Type 'exit' to exit the app.");
        
        while (true) {
        	uBehave = uInput.nextLine();

        	if (uBehave.equals("generate")) {
            	psw = generatePsw(pswLength);
            	printPsw(psw);
            
        	} else if (uBehave.equals("exit")) {
        		exit(uInput);
        		uInput.close();
        		return;

        	}else {
            	System.out.println("!Invalid input!");
            	uInput.close();
            	return;
            
        	}
        
        }

        
    }

    static String generatePsw(int pswLength) {
        char[] psw = new char[pswLength];
        Random random = new Random();
        
        for (int i = 0; i < pswLength; i++) {
            int ascii = 33 + random.nextInt(94); // ASCII range 33 to 126 (printable characters)
            psw[i] = (char) ascii;
            
        }
        
        return new String(psw);
    }

    static void printPsw(String psw) {
        System.out.println(psw);
    }
    
    static void exit(Scanner uInput) {
    	System.out.println("Thanks for using my app!");
		System.out.println("Peace out!");
    	
    }
    
}