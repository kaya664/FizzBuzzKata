package kaya.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzCalculatorTest {
	
	FizzBuzzCalculator fizzBuzz = new FizzBuzzCalculator();
	
	@Test
	void testGetFizzOrBuzzWithNonFizzOrBuzzNumbers() {
		assertEquals("1", fizzBuzz.getFizzOrBuzz(1));
	}
	
	@Test
	void testGetFizzOrBuzzWithFizzNumbers() {
		assertEquals("Fizz", fizzBuzz.getFizzOrBuzz(3));
	}
	
	@Test
	void testGetFizzOrBuzzWithBuzzNumbers() {
		assertEquals("Buzz", fizzBuzz.getFizzOrBuzz(5));
	}
	
	@Test
	void testGetFizzOrBuzzWithBothFizzAndBuzzNumbers() {
		assertEquals("FizzBuzz", fizzBuzz.getFizzOrBuzz(15));
	}
	
	@Test
	void testGetFizzOrBuzzWithNonFizzOrBuzzNumbersNotContaningThreeOrFive() {
		assertEquals("1", fizzBuzz.getFizzOrBuzz(1));
	}
	
	@Test
	void testGetFizzOrBuzzWithFizzNumbersContainingThree() {
		assertEquals("Fizz", fizzBuzz.getFizzOrBuzz(3));
	}
	
	@Test
	void testGetFizzOrBuzzWithBuzzNumbersContainingFive() {
		assertEquals("Buzz", fizzBuzz.getFizzOrBuzz(52));
	}
	
	@Test
	void testGetFizzOrBuzzWithBothFizzAndBuzzNumbersContainingBothThreeAndFive() {
		assertEquals("FizzBuzz", fizzBuzz.getFizzOrBuzz(53));
	}


}
