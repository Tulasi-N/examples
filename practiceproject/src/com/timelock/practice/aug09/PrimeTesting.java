package com.timelock.practice.aug09;

import java.util.Scanner;

/** * Java Program to check if a number is Prime or Not. This program accepts a 
 * * number from command prompt and check if it is prime or not. *
 *
 */

public class PrimeTesting {
	public static void main(String args[]) 
	{
		Scanner scnr = new Scanner(System.in);
		int number = Integer.MAX_VALUE;
		System.out.println("Enter number to check if prime or not "); 
		//while method is for
		//when 0 is entered through cmd then program terminates
		while (number != 0) 
		{
			number = scnr.nextInt();
			System.out.printf("Does %d is prime? %s  %n", number, isPrimeOrNot(number));
			}
	}
    /**
     * this method first checks whether number is prime or not or invalid number
     * if we enter any negative numbers then it returns not valid
     * @param num
     * @return
     */
	private static String isPrimeOrNot(int num) {
		if(num<0) {
			return "not valid";
		}
		if(num==0 || num==1) {
			return "is not prime";
		}
		if(num==2 || num==3) {
			return "prime number";
		}
		if((num * num - 1) % 24==0){
			return "prime";
		}else {
			return "not prime";
		}
	}

}
