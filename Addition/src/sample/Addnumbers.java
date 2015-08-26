package sample;

import java.util.Scanner;

public class Addnumbers {
	
	
	public static void main(String[] args) {
      
	int a,b;
      System.out.println("Plzz Enter the variables");
     
	Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      
      
      Addnumbers.add(a,b);
      
 
			
		}

	private static void add(int a, int b) {
                  int c = a+b;
				System.out.println(c);
                  System.out.println("finaly got it");
		
	}
	}


