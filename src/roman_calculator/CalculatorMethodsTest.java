package roman_calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorMethodsTest {
	private static CalculatorMethods calculator = new CalculatorMethods();
	// Testing romanToInt Method
	@Test
	void testStringCamel() {
		assertEquals(1115,calculator.romanToInt("mCxV"));
	}
	@Test
	void testStringInvalidChar() {
		assertEquals(-1,calculator.romanToInt("Axi"));
	}
	@Test
	void testStringInvalidInt() {
		assertEquals(-1,calculator.romanToInt("8xi"));
	}
	@Test
	void testStringValid() {
		assertEquals(60,calculator.romanToInt("LX"));
	}
	
	// Testing intToRoman Method
	@Test
	void testIntValid() {
		assertEquals("MCXV",calculator.intToRoman(1115));
	}
	@Test
	void testIntValidDoubles() {
		assertEquals("MMCXV",calculator.intToRoman(2115));
	}
	
	// Testing Calculator Methods
	@Test
	void test1() {
		assertEquals("MMCXV",calculator.addition("m", "mcxv"));
	}
	@Test
	void test2() {
		assertEquals("XV",calculator.subtraction("xx", "v"));
	}
	@Test
	void test3() {
		assertEquals("DC",calculator.multiplication("x", "LX"));
	}
	@Test
	void test4() {
		assertEquals("LX",calculator.division("dc", "x"));
	}
	@Test
	void test5() {
		assertEquals("MMCLXVII",calculator.addition("MMC", "LXVII"));
	}
	@Test
	void test6() {
		assertEquals("DCCCLXXXVIIII",calculator.subtraction("M", "CXI"));
	}
	@Test
	void test7() {
		assertEquals("XXIII",calculator.addition("xi", "XII"));
	}
	
}
