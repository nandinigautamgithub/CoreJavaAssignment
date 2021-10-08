package com.CoreJava;

import java.util.Scanner;

public class harmonicnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Number: ");
	 
	        // storing input value in num
	        int num = sc.nextInt();
	        double result = 0.0;
	 
	        System.out.println("The harmonic series is: ");
	 
	        // printing the harmonic series till num value
	        // using for loop
	        for (int i = num; i > 0; i--) {
	 
	            // calculating harmonic values
	            result = result + (double)1 / i;
	 
	            System.out.print(result + ", ");
	        }
	}

}
