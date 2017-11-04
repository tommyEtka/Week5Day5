package FizzBuzzTDD;

public class fizzBuzzClass {

	public static String fizzBuzzProcessor(int input) {

		
		String output = "";
		

		if(Mod(input, 3) == 0)
			output += "Fizz";

		
		if(Mod(input, 5) == 0)
			output += "Buzz";

		return output.equals("")?Integer.toString(input):output;
	}

	public static int Mod(int x, int y) {
		return x % y;
	}

}


//if(Mod(input, 15)==0)
//output +="FizzBuzz";


//if (Mod(input, 15) == 0)
//return "FizzBuzz";

// if (input % 15 == 0)
// return "FizzBuzz";

//	if (Mod(input, 3) == 0)
//	return "Fizz";

// if(input % 3 == 0)
// return "Fizz";

//	if (Mod(input, 5) == 0)
//	return "Buzz";

// if(input % 5 == 0)
// return "Buzz";

//	return Integer.toString(input);