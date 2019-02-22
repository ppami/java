import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MergeSortNewTest {
	
	/*@Test
	void when_givenList_returnMergedAndSortedListt() {
		List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 4, 5, 1));
		MergeSortNew msn = new MergeSortNew();
		List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5));
		assertEquals(expected, msn.mergeSort(list));
	}*/
	@Test 
	void when_givenTwoListsMergeSorted() {
		List<Integer> listOne = new ArrayList<>(Arrays.asList(4, 2, 3));
	    List<Integer> listTwo = new ArrayList<>(Arrays.asList(4, 5, 1));
	    List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5));
	    MergeSortNew msn = new MergeSortNew(); 
	    assertEquals(expected, msn.mergeSorted(listOne, listTwo));
	}
	
	@Test 
	void when_listHasEvenNumberOfElementsSplitList() {
		List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 4, 5, 1));
		List<Integer> listOne = new ArrayList<>(Arrays.asList(4, 2, 3));
	    List<Integer> listTwo = new ArrayList<>(Arrays.asList(4, 5, 1));
		List<List<Integer>> expected = new ArrayList<>(Arrays.asList(listOne, listTwo));
		MergeSortNew msn = new MergeSortNew(); 
		assertEquals(expected, msn.splitList(list));
	}
	@Test 
	void when_listHasUnevenNumberOfElementsSplitList() {
		List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 4, 5));
		List<Integer> listOne = new ArrayList<>(Arrays.asList(4, 2, 3));
	    List<Integer> listTwo = new ArrayList<>(Arrays.asList(4, 5));
		List<List<Integer>> expected = new ArrayList<>(Arrays.asList(listOne, listTwo));
		MergeSortNew msn = new MergeSortNew(); 
		assertEquals(expected, msn.splitList(list));
	}
	
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
	
	@Test
	void when_ItersHave1ElementEachMergeUntilOneEmpty() {
		MergeSortNew msn = new MergeSortNew();
		List<Integer> sortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> iterListOne = new ArrayList<>(Arrays.asList(6));
		List<Integer> iterListTwo = new ArrayList<>(Arrays.asList(7));
		Iterator<Integer> iterOne = iterListOne.iterator();
		Iterator<Integer> iterTwo = iterListTwo.iterator();
		
		assertEquals(iterTwo, msn.mergeUntilOneEmpty(sortedList, iterOne, iterTwo));
	}
	
	@Test
	void when_iterOneHasTwoElementsAndIterTwoHasThreeElementsMergeUntilOneEmpty() {
		MergeSortNew msn = new MergeSortNew();
		List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 4, 5));
		List<Integer> iterListOne = new ArrayList<>(Arrays.asList(6, 7));
		List<Integer> iterListTwo = new ArrayList<>(Arrays.asList(6, 7, 8));
		Iterator<Integer> iterOne = iterListOne.iterator();
		Iterator<Integer> iterTwo = iterListTwo.iterator();
		
		assertEquals(iterTwo, msn.mergeUntilOneEmpty(list, iterOne, iterTwo));
	}
}
