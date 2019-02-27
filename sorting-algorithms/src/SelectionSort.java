import java.util.Collections;
import java.util.List;

public class SelectionSort {
	
	public void swap(List<Integer> list, int indexOne, int indexTwo) {
		Collections.swap(list, indexOne, indexTwo);
	}
	
	public int findSmallest(List<Integer> list, int index) {
		int smallest = index;

		for (int i = index; i < list.size() - index; i++) {
			if (list.get(i) < list.get(smallest)) {
				smallest = i;
			}
		}		
		return smallest;
	}
}
