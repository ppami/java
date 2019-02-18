import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MergeSortNewTest {
	
	@Test
	void when_IterHasElementsAddRemaining() {
		List<Integer> sortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> iterList = new ArrayList<>(Arrays.asList(7, 8));
		Iterator<Integer> iter = iterList.iterator();
		
		List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8));
		
		MergeSortNew msn = new MergeSortNew();
		
		assertEquals(expected, msn.addRemaining(sortedList, iter));
		
	}	
	
	@Test
	void when_IterHasNoElementsAddRemaining() {
		List<Integer> sortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> iterList = new ArrayList<>();
		Iterator<Integer> iter = iterList.iterator();
		
		List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		
		MergeSortNew msn = new MergeSortNew();
		
		assertEquals(expected, msn.addRemaining(sortedList, iter));
		
	}
}
