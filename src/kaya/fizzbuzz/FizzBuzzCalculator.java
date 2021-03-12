package kaya.fizzbuzz;

public class FizzBuzzCalculator {
	
	public void printFizzOrBuzz() {
		for(int i = 0; i < 100; i++) {
			System.out.println(getFizzOrBuzz(i));
		}
	}
	
	public String getFizzOrBuzz(Integer number) {
		String result = "";
		if(number % 3 == 0 || number.toString().contains("3")) {
			result += "Fizz";
		} 
		if(number % 5 == 0 || number.toString().contains("5")) {
			result += "Buzz";
		}
		return result.length() == 0 ? number.toString() : result;
	}
	
}
