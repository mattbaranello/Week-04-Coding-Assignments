package week04_coding_assignment;

public class ArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 30, 2, 8, 28, 93};
		
		/**
		 * Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). 
		 * Print the result to the console.  
		 */
		int result = 0;
		for (int i = 0; i < ages.length; i++) {
			result = ages[ages.length - 1] - ages[0];
		} System.out.println("Difference: " + result);
		
		//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//--I added the number 30 to the int array to show that the code is dynamic.
		
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		System.out.println("------------------------------");
		
		int sum = 0;
		int i = 0;
		while (i < ages.length) {
			sum += ages[i];
			i++;
		}
		int average = sum / ages.length;
		System.out.println("Average: " + average);
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		System.out.println("------------------------------");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int totalLength = 0;
		for (String name : names) {
			totalLength += name.length();
		}
		int averageLength = totalLength / names.length;
		System.out.println("Average Length " + averageLength);
		
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		System.out.println("------------------------------");
		
		String concatenatedStrings = "";
		for (String name : names) {
			concatenatedStrings += name + ", ";
		}
			System.out.println(concatenatedStrings);
		
		//How do you access the last element of any array?
		//--Using the ages array as an example: ages[ages.length() - 1] will access the last element in the array.
			
		
		//How do you access the first element of any array?
		//--Using the ages array as an example: ages[0] will access the first element of an array.
		
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		System.out.println("------------------------------");
			
		int[] nameLengths = new int[names.length];
		for (i = 0; i < names.length; i++) {
			nameLengths[i] += names[i].length();
		} 
		for (i = 0; i < nameLengths.length; i++)
			System.out.println(nameLengths[i]);
		
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println("------------------------------");
		
		int totalLengthOfNames = 0;
		for (i = 0; i < nameLengths.length; i++) {
			totalLengthOfNames += nameLengths[i];
		} System.out.println(totalLengthOfNames);
		
		/**Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		 * (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */					
		System.out.println("------------------------------");
		
		String concatenated = concatenatedWord("Hello", 3);
		System.out.println(concatenated);
			
		//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.println("------------------------------");
		
		String concatenatedNames = fullName("Matthew", "Baranello");
		
		System.out.println(concatenatedNames);
		
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("------------------------------");
		
		boolean sumGreaterThanOneHundred = sumOfNumbers(ages);
		
		System.out.println(sumGreaterThanOneHundred);
		
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		System.out.println("------------------------------");
		
		double averageAge = averageOfArray(ages);
		
		System.out.println(averageAge);
		
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		System.out.println("------------------------------");
		
		double[] numbers = {4.50, 20, 25.50, 15.25};
		
		boolean results = compareAverages(numbers, ages);
		
		System.out.println(results);
		
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("------------------------------");
		
		boolean isHotOutside = true;
		double moneyInPocket = 9.50;
		
		boolean drinkBought = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(drinkBought);
		
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		/*
		 * --The method I created finds the sum of all even numbers in the ages array. 
		 * I created this so I can continue to challenge my knowledge of looping through arrays and returning the sum of only specific values using an if statement.
		 */
		System.out.println("------------------------------");
		
		System.out.println(sumEvenNumbers(ages));
	
	}
	public static String concatenatedWord(String word, int n) {
		
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}	
		return result;
	}
	public static String fullName(String firstName, String lastName) {
		String firstAndLast = "";
		firstAndLast = firstName + " " + lastName;
		return firstAndLast;
	}	
	public static boolean sumOfNumbers(int[] ages) {
		int sumOfAges = 0;
		for (int i = 0; i < ages.length; i++) {
		sumOfAges += ages[i];
		}
		if (sumOfAges > 100) {
			return true;
		} else {
			return false;
		}
	}
	public static double averageOfArray(int[] ages) {
		double sumOfAges = 0;
		double average = 0;
		for (int i = 0; i < ages.length; i++) {
		sumOfAges += ages[i];
		average = sumOfAges / ages.length;
		}
		return average;
	}
	public static boolean compareAverages(double[] numbers, int[] ages) {
		double agesSum = 0;
		double avgOfAges = 0;
		for (int i = 0; i < ages.length; i++) {
			agesSum += ages[i];
			avgOfAges = agesSum / ages.length; 
		}
		double numbersSum = 0;
		double avgOfNumbers = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbersSum += numbers[i];
			avgOfNumbers = numbersSum / numbers.length; 
		}
		return avgOfAges > avgOfNumbers;
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	public static int sumEvenNumbers(int[] ages) {
	    int sum = 0;
	    for (int i = 0; i < ages.length; i++) {
	        if (ages[i] % 2 == 0) {
	            sum += ages[i];
	        }
	    }
	    return sum;
	}

}
