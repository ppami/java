import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {
	
	
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
	
	@Test 
	void given_TwoIndicesSwap() {
		List<Integer> list = new LinkedList<>(Arrays.asList(5, 3, 4, 6, 1, 2));
		int indexOne = 0;
		int indexTwo = 4;
		SelectionSort ss = new SelectionSort();
		ss.swap(list, indexOne, indexTwo);
		List<Integer> expected = new LinkedList<>(Arrays.asList(1, 3, 4, 6, 5, 2));
		
		assertEquals(expected, list);
	}
	
}
