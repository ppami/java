import java.util.Iterator;
import java.util.List;

public class MergeSortNew {
	public List<Integer> addRemaining(List<Integer> sortedList, Iterator<Integer> iter) {
		int element;
		while (iter.hasNext()) {
			element = iter.next();
			sortedList.add(element);
		}
		
		return sortedList;
	}
	
	public Iterator<Integer> mergeUntilOneEmpty(List<Integer> sortedList, Iterator<Integer> iterOne, Iterator<Integer> iterTwo) {
		
		return null;
	}
}
