package Question1;

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class PrimeMain {
		public static void main(String args[]) {
			
			// Source: https://www.java-samples.com/showtutorial.php?tutorialid=1682
			Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter a number: ");
		    
		    Integer nombre = scanner.nextInt();  // Read user input
		    
			
			Prime prime = new Prime(nombre);
			prime.start();
			
			
		}
	}
