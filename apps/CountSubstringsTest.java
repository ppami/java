package countsubstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountSubstringsTest {

	@Test
	public void when_GivenABinaryString_ShouldReturnNumberOfCases() {
		CountSubstrings cs = new CountSubstrings();
		String s = "10101";
		int expected = 3;
		int actual = cs.countSubstrings(s);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void when_GivenABinaryString_ShouldReturnNumberOfCasesTwo() {
		CountSubstrings cs = new CountSubstrings();
		String s = "1010101";
		int expected = 6;
		int actual = cs.countSubstrings(s);
		
		assertEquals(expected, actual);
	}

}
