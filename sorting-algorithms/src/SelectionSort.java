import java.util.Collections;
import java.util.List;

public class SelectionSort {
	
	public void selectionSort(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			swap(list, i, findSmallest(list, i));
		}
	}
	
	public void swap(List<Integer> list, int indexOne, int indexTwo) {
		Collections.swap(list, indexOne, indexTwo);
	}
	
	public int findSmallest(List<Integer> list, int index) {
		int smallest = index;

		for (int i = index; i < list.size(); i++) {
			if (list.get(i) < list.get(smallest)) {
				smallest = i;
			}
		}		
		return smallest;
	}
}
