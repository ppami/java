package exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExamSubListTest {

	@Test
	public void test() {
		int[] array = {1, 7, 4, 3, 4, 5, 7, 4};
		int[] subArray = {7, 4};
		
		ExamSubList esl = new ExamSubList();
		int expected = 6;
		int actual = esl.firstIndex(array, subArray);
		
		assertEquals(expected, actual);
	}

	

}
