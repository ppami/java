import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MergeSortNew {
	
	public List<Integer> mergeSorted(List<Integer> listOne, List<Integer> listTwo) {
		
		Iterator<Integer> iterOne = listOne.iterator();
		Iterator<Integer> iterTwo = listTwo.iterator();
		System.out.println(listOne);
		System.out.println(listTwo);
		List<Integer> sortedList = new ArrayList<>();
		mergeUntilOneEmpty(sortedList, iterOne, iterTwo);
		Iterator<Integer> iter = mergeUntilOneEmpty(sortedList, iterOne, iterTwo);
		
		return addRemaining(sortedList, iter);
	}
	
	public List<Integer> addRemaining(List<Integer> sortedList, Iterator<Integer> iter) {
		int element;
		while (iter.hasNext()) {
			element = iter.next();
			sortedList.add(element);
		}
		
		return sortedList;
	}
	
	public Iterator<Integer> mergeUntilOneEmpty(List<Integer> sortedList, Iterator<Integer> iterOne, Iterator<Integer> iterTwo) {
		int elementOne = iterOne.next();
		int elementTwo = iterTwo.next();

		while (true) {
			
			if (!iterOne.hasNext()) {
				return iterTwo;
				
			} else if (!iterTwo.hasNext()){
				return iterOne;
			}
			
            if (elementOne >= elementTwo) {
                sortedList.add(elementTwo);
                elementTwo = iterTwo.next();
            } else {
                sortedList.add(elementOne);
                elementOne = iterOne.next();
            }
            
        }
	}
	public List<List<Integer>> splitList (List<Integer> list) {
		int size = list.size();
		List<Integer> listOne = new ArrayList<>(list.subList(0, (size+1)/2));
	    List<Integer> listTwo = new ArrayList<>(list.subList((size+1)/2, size));
	    List<List<Integer>> lists = new ArrayList<>(Arrays.asList(listOne, listTwo));

	    return lists;
	}
}
