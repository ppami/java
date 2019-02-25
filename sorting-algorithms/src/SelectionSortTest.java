import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {
	@Test
	void given_IndexFindSmallestElement() {
		List<Integer> list = new LinkedList<>(Arrays.asList(5, 3, 4, 6, 1, 2));
		int index = 0;
		int expected = list.get(4);
		
		SelectionSort ss = new SelectionSort();
		assertEquals(expected, ss.findSmallest(list, index);
	}
	
}
