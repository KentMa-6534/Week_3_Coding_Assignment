import java.util.Arrays;
import java.util.Scanner;

public class Week_3_Assignment {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	// 1.Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[]ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		
	//	a.Programmatically subtract the value of the first element in the array from the value in the last element of 
	//	the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ages[ages.length-1]-ages[0]);
		
	//	b.Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[]ages1 = { 3, 9, 23, 64, 2, 8, 28, 93, 53};
		System.out.println(ages1[ages1.length-1]-ages1[0]);
		
	// 	c.Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum =0;
		for(int i=0;i<ages1.length;i++) {
			sum+=ages1[i];
		}
		int average = sum/ages1.length;
		System.out.println(average);
		
	//	2.Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.	
		String[]names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	//	a.Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int letterSum=0;
		for(String name:names) {
			letterSum+=name.length();
		}
		int letterAverage = letterSum/names.length;
		System.out.println(letterAverage);
		
	// b.Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String concatenate = "";
		for(int i =0;i<names.length;i++) {
			concatenate += names[i]+" ";
		}
		System.out.println(concatenate);
		
		// 3.How do you access the last element of any array?
		// To access the last element of any array, you can use array[],then use the .length function inside the square brackets
		// to get the array length and subtract the length by 1 to prevent an OutOfBounds Exception.
		// Example: array[array.length-1]
		
		// 4.How do you access the first element of any array?
		// To access the first element of any array, you can call the 0th index using array[0], as Java starts counting at 0 instead of 1.
		
		// 5.Create a new array of int called nameLengths. Write a loop to iterate over the previously created names 
		// array and add the length of each name to the nameLengths array.
			int[]nameLengths = new int[names.length];
			for(int i = 0;i<names.length;i++) {
				nameLengths[i]=names[i].length(); 
			}
			System.out.println(Arrays.toString(nameLengths));
			
		// 6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			int nameSum=0;
			for(int index:nameLengths) {
				nameSum+=index;
			}
			System.out.println(nameSum);
			
		// 7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		// (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			String word = "Hello";
			int n = 3;
			System.out.println(wordPrinter(word, n));
		
		// 8.Write a method that takes two Strings, firstName and lastName, and returns a full name 
		// (the full name should be the first and the last name as a String separated by a space).
			String firstName = "Walter";
			String lastName = "White";
			System.out.println(fullName(firstName, lastName));
		
		// 9.Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			System.out.println(overOneHundred(ages1));
		
		// 10.Write a method that takes an array of double and returns the average of all the elements in the array.
			double[]gasPrices = {4.69, 3.27, 3.17, 4.04, 5.43, 3.67};
			System.out.println(doubleAverage(gasPrices));
		
		// 11.Write a method that takes two arrays of double and returns true if the average of the 
		// elements in the first array is greater than the average of the elements in the second array.
			double[]groceryPrices = {1.23, 2.45, 6.99, 7.50, 8.25, 9.99};
			System.out.println(averageIsGreater(gasPrices,groceryPrices));
			
		// 12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		// and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			boolean isHotOutside = true;
			double moneyInPocket = 11.00;
			System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		// 13.Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			
		//	This method takes a String variable of any length of text and tries to determine the number of letters, words, sentences, and
		//  tries to determine reading grade level of the text via the Coleman-Liau Index. This project was one of my CS50 assignments that I 
		//  had yet to finish.
			System.out.println("Please enter any amount of text: ");
			String text = scan.nextLine();
			readability(text);
	}
	
	// 7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	// (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String wordPrinter(String word, int n) {
		String concatenatedWord = "";
		int counter = 0;
		while(counter<n) {
			concatenatedWord+=word;
			counter++;
		}
		return concatenatedWord;
	}
	
	// 8.Write a method that takes two Strings, firstName and lastName, and returns a full name 
	// (the full name should be the first and the last name as a String separated by a space).
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName+" "+lastName;
		return fullName;
	}
	
	// 9.Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean overOneHundred(int[]numbers) {
		boolean overOneHundred;
		int arraySum = 0;
		for(int counter:numbers) {
			arraySum+=counter;
		}
		if(arraySum>100) {
			overOneHundred = true;
		}
		else {
			overOneHundred = false;
		}
		return overOneHundred;
	}
	
	// 10.Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double doubleAverage(double[]numbers) {
		double sum = 0;
		for(int i = 0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		double average = sum/numbers.length;
		return average;
	}
	
	// 11.Write a method that takes two arrays of double and returns true if the average of the 
	// elements in the first array is greater than the average of the elements in the second array.
	public static boolean averageIsGreater(double array1[],double array2[]) {
		double sum1 = 0;
		double sum2 = 0;
		double array1Avg;
		double array2Avg;
		boolean firstIsGreater;
		
		for(int i = 0;i<array1.length;i++) {
			for(int j = 0;j<array2.length;j++) {
				sum1 += array1[i];
				sum2 += array2[j];
			}
		}
		array1Avg = sum1/array1.length;
		array2Avg = sum2/array2.length;
		
		if(array1Avg>array2Avg) {
			firstIsGreater = true;
		}
		else {
			firstIsGreater = false;
		}
		return firstIsGreater;
	}
	
	//	12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	//	 and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean temperature, double money) {
		boolean drink;
		if(temperature = true && money>10.50) {
			drink = true;
		}
		else {
			drink = false;
		}
		return drink;
	}
	
	// 	13.This method takes a String variable of any length of text and tries to determine the number of letters, words, sentences, and
	//  tries to determine reading grade level of the text via the Coleman-Liau Index. 
	public static void readability(String text) {
		//String is converted to a character array to iterate over individual characters
		char[]characters = text.toCharArray();
		int letters = 0;
		//Set to one since most text start with at least one word.
		int words = 1;
		int sentences = 0;
		
		//Iterates over character array
		for(int i = 0; i<characters.length; i++) {
			//Loop scans for lowercase and uppercase characters and increments the number of letters
			if((characters[i]>='a' && characters[i]<='z')||(characters[i]>='A' && characters[i]<='Z')) {
				letters++;
			}
			//Loop scans for spaces and null characters and increments the number of words
			if(characters[i] == ' ' || characters[i] == '\0') {
				words++;
			}
			//Loop scans for periods, question marks, and exclamation points to find sentences and increments the number of sentences.
			if(characters[i] == '.' || characters[i] == '?' || characters[i] == '!') {
				sentences++;
			}
		}
		
		//Formula for the Coleman-Liau Index
		double averageLettersPer100 = ((double)letters/(double)words)*100;
		double averageSentencesPer100 = ((double)sentences/(double)words)*100;
		
		double colemanLiauIndex = (.0588 * averageLettersPer100)-(.296 * averageSentencesPer100) -15.8;
		
		System.out.println("Letters: "+letters);
		System.out.println("Words: "+words);
		System.out.println("Sentences: "+sentences);
		
		//If Coleman-Liau index is under 1 or over 16, prints out first two conditionals. Otherwise, the index is rounded and printed out.
		if(colemanLiauIndex<1) {
			System.out.println("Reading Level is Before Grade 1.");
		}
		else if(colemanLiauIndex>16) {
			System.out.println("Reading Level is Grade 16 and up.");
		}
		else {
			System.out.println("Reading Level Grade: "+Math.round(colemanLiauIndex));
		}
	}
}
