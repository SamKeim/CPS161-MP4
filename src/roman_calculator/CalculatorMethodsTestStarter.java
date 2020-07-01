package roman_calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorMethodsTestStarter {

	// Testing romanToInt Method
	@Test
	void testStringCamel() {
		assertEquals(1115,RomanCalculator.convertFromRoman("mCxV"));
	}
	@Test
	void testStringInvalidChar() {
		assertEquals(-1,RomanCalculator.convertFromRoman("Axi"));
	}
	@Test
	void testStringInvalidInt() {
		assertEquals(-1,RomanCalculator.convertFromRoman("8xi"));
	}
	@Test
	void testStringValid() {
		assertEquals(60,RomanCalculator.convertFromRoman("LX"));
	}
	
	// Testing intToRoman Method
	@Test
	void testIntValid() {
		assertEquals("MCXV",RomanCalculator.convertToRoman(1115));
	}
	@Test
	void testIntValidDoubles() {
		assertEquals("MMCXV",RomanCalculator.convertToRoman(2115));
	}
	
	// Testing Calculator Methods
	@Test
	void test1() {
		assertEquals("MMCXV",RomanCalculator.doMath('+', 1000, 1115));
	}
	@Test
	void test2() {
		assertEquals("XV",RomanCalculator.doMath('-', 20, 5));
	}
	@Test
	void test3() {
		assertEquals("DC",RomanCalculator.doMath('*', 10, 60));
	}
	@Test
	void test4() {
		assertEquals("LX",RomanCalculator.doMath('/', 600, 10));
	}
	@Test
	void test5() {
		assertEquals("MMCLXVII",RomanCalculator.doMath('+', 2100, 67));
	}
	@Test
	void test6() {
		assertEquals("DCCCLXXXVIIII",RomanCalculator.doMath('-', 1000, 67));
	}
	@Test
	void test7() {
		assertEquals("XXIII",RomanCalculator.doMath('+', 11, 12));
	}
	
}
