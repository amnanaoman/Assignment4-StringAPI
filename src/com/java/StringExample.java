package com.java;

public class StringExample {

	public static void main(String[] args) {
		String stringExample = new String("HungryHippo");
		//checking  charAt()
		System.out.println("**********charAt()******************");

		System.out.println("Char at index 5 of '" + stringExample + "' is : " + stringExample.charAt(5)  );
		System.out.println();
		
		//checking length: 
		System.out.println("**********String Length******************");		
		System.out.println("Length of '" + stringExample + "' is " + stringExample.length() );
		System.out.println();

		//checking concat
		System.out.println("**********String concat******************");
		String concatString = stringExample.concat("Junior");
		System.out.println("Concatenated String is: " + concatString);
		System.out.println();
		
		//replacing String char
		System.out.println("**********Replacing char with*****************");
		String replacedString = stringExample.replace('H', 'P');
		System.out.println("replaced String is: " + replacedString);
		System.out.println();
		
		////Substring
		System.out.println("**********Substring with start index******************");
		String restString = stringExample.substring(5);
		System.out.println("Rest of String starting at char 5: " + restString);
		System.out.println();
		System.out.println("**********Substring with start and end index******************");
		String subString = stringExample.substring(5,10);
		System.out.println("Substring from char 5 - 10: " + subString);
		System.out.println();
		
		//checking lowercase
		System.out.println("**********Lowercase()******************");
		System.out.println("Lower case String: " + stringExample.toLowerCase());
		System.out.println();

		//checking uppercase
		
		System.out.println("**********Uppercase******************");
		System.out.println("Upper case String: " + stringExample.toUpperCase());
		System.out.println();
		
		//Trimming spaces
		System.out.println("*********Trimming spaces before and after STring******************");
		String stringExampleTrim = "    Hungry Hippo     ";
		System.out.println("Trimmed String of '"+ stringExampleTrim+ "': " + stringExampleTrim.trim());
		System.out.println();
		
		//tocharArray
		System.out.println("**********String to charArray[]******************");
		char[] strArray = stringExample.toCharArray();
		System.out.println("String Array: ");
		for(int i = 0; i< strArray.length; i++)
		{
			System.out.println(strArray[i]);
		}
		System.out.println();
		
		
		//String contain:
		System.out.println("**********Boolean String contain******************");
		if(stringExample.contains("Hip"))
		{
			System.out.println("'"+ stringExample +"' contain 'Hip'" );
		}
		else
		{
			System.out.println("'"+ stringExample +"' does not contains 'Hip'" );

		}
		System.out.println();


		//split() example
		System.out.println("**********split string with char******************");
		String stringExample1 = "I live in San Jose";
		String[] splitwords = stringExample1.split(" ");
		System.out.println("Words Array: ");
		for(int i = 0; i< splitwords.length; i++)
		{
			System.out.println(splitwords[i]);
		}
		System.out.println();
		
//		Replace spaces with %20
		System.out.println("**********replace spaces with %20******************");
		System.out.println("Replaced String: "+ stringExample1.replaceAll(" ", "%20"));

		
	}

}
