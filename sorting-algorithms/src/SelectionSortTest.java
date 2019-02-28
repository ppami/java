import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {
	
	@Test
	void given_listWithOneElementSelectionSort() {
		List<Integer> list = new LinkedList<>(Arrays.asList(1));
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(list);
		List<Integer> expected = new LinkedList<>(Arrays.asList(1));
		
		assertEquals(expected, list);
	}
	
	@Test
	void given_listWithTwoIdenticalElementsSelectionSort() {
		List<Integer> list = new LinkedList<>(Arrays.asList(5, 3, 4, 4, 1, 2));
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(list);
		List<Integer> expected = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 4, 5));
		
		assertEquals(expected, list);
	}
	
	@Test
	void given_listSelectionSort() {
		List<Integer> list = new LinkedList<>(Arrays.asList(5, 3, 4, 6, 1, 2));
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(list);
		List<Integer> expected = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		assertEquals(expected, list);
	}
	
	@Test
	void given_IndexFindSmallestElement() {
		List<Integer> list = new LinkedList<>(Arrays.asList(5, 3, 4, 6, 1, 2));
		int index = 0;
		int expected = 4;
		
		SelectionSort ss = new SelectionSort();
		assertEquals(expected, ss.findSmallest(list, index));
	}
	
}
