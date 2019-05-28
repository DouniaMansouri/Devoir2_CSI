package Question1;

	
	import java.lang.*;
	import java.io.*;
	import java.util.*;
	
	public class Prime extends Thread{
		
		private int nombre; 
		
		public Prime(int nombre) {
			
			this.nombre = nombre;
			
		}
		
		public void run() {
			
			 int i,m=0,flag=0;  
			 ArrayList<Integer> arrayPrime = new ArrayList<Integer>();
			 ArrayList<Integer> arrayNotPrime = new ArrayList<Integer>();
			 
			 // Source: https://www.javatpoint.com/prime-number-program-in-java
			 
			 for (int j = 1; j<=nombre; j++) {
				 flag = 0;
				  m=j/2;
				  
				  if(j==0||j==1){ 
					  arrayNotPrime.add(j);   
				  }
				  else{  
					  
				   for(i=2;i<=m;i++){  
					   
					    if(j%i==0){    
					    	
					     arrayNotPrime.add(j);      
					     flag=1;      
					     break; 
					     
					    }   
				    
				   } 
				   
				   
				   if(flag==0)  { 
					   arrayPrime.add(j);
				   }  
				  
				  }//end of else  
			}
			 //print the array
			 System.out.println("All the prime numbers less than or equal to "+ nombre + " are: " + arrayPrime);
		
		}
	}
	
	
	
	


