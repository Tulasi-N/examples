package com.timelock.practice.aug09;

import java.util.Scanner;

/** * Java program to calculate and print Fibonacci number using both recursion * and Iteration.
 ** Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 ** first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 * *
 */
public class FibonaciiCalculator 
{
	public static void main(String args[]) 
	{
		//input to print Fibonacci series upto how many numbers 
		System.out.println("Enter number upto which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series upto " + number +" numbers : ");
		//printing Fibonacci series upto number 
		for(int i=1; i<=number; i++)
		{ 
			System.out.print(fibonacci2(i) +" ");
		}
	} 
	public static int fibonacci2(int number)
	{ 
		if(number == 1 || number == 2)
		{ 
			return 1; 
		}
		int fibo1=1, fibo2=1, fibonacci=1; 
		for(int i= 3; i<= number; i++)
		{
			//Fibonacci number is sum of previous two Fibonacci number 
			fibonacci = fibo1 + fibo2; 
			fibo1 = fibo2;
			fibo2 = fibonacci; 
		} return fibonacci; //Fibonacci number
	}

}