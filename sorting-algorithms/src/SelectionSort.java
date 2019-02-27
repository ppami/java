import java.util.List;

public class SelectionSort {
	
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
