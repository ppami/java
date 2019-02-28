import java.util.Collections;
import java.util.List;

public class SelectionSort {
	
	public void selectionSort(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			Collections.swap(list, i, findIndexOfSmallestFromIndex(list, i));
		}
	}
	
	public int findIndexOfSmallestFromIndex(List<Integer> list, int index) {
		int smallest = index;

		for (int i = index; i < list.size(); i++) {
			if (list.get(i) < list.get(smallest)) {
				smallest = i;
			}
		}		
		return smallest;
	}
}
