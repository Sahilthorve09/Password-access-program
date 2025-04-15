package com.pract;

import java.util.Scanner;

public class Password {
		

	public static void main(String[] args) {
		int Pass = 2024;
		int pass;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENter password...: ");
			pass = sc.nextInt();
			if(pass != Pass) {
				System.out.println("Incorrect");
			}
		}while(pass != Pass);
		System.out.println("Thank you");
		
	}
	
	
}
