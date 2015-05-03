package com.tokmak.project.euler;

/**
 * @author life
 * @email dev@tokmak.org
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class Question1
{
	private static Integer FUNCTION_CONSTANT = 1000;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Integer sum = sumOfMultiplesOfGivenNumbers(3, 5);
		System.out.println(sum);
	}
	
	/**
	 * @param argNumber1
	 * @param argNumber2
	 * @return The sum of these multiples.
	 * 
	 * The result for constant 1000 is: 233168
	 */
	private static Integer sumOfMultiplesOfGivenNumbers(Integer argNumber1, Integer argNumber2)
	{
		Integer result = 0;
		
		for (int i = 1; i < FUNCTION_CONSTANT; i++)
		{
			if(i % argNumber1 == 0 || i % argNumber2 == 0)
			{
				result += i;
			}
		}
		return result;
	}
}
