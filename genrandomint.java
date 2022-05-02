package lab3task2;

import java.util.Scanner;
public class genrandomint
{
	
	public static int rand(int min, int max)
	{
		if (min > max) {
			throw new IllegalArgumentException("Invalid range");
		}

		double rand = Math.random();
		int c= (int)(rand * ((max - min) + 1)) + min;
		
		return c ;
		 
	}

	public static void main(String[] args)
	{
		int min = 5, max = 20;
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0; i <= input; i++) {
			System.out.print(rand(min, max)+" ");
			
		}
	}
}