import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MergeSortNew {

	public List<Integer> mergeSort (List<Integer> list) {

		if (list.size() == 1) return list;

		List<List<Integer>> splitted = splitList(list);
		List<Integer> listOne = mergeSort(splitted.get(0));
		List<Integer> listTwo = mergeSort(splitted.get(1));

		return mergeSorted(listOne, listTwo);
	}

	public List<Integer> mergeSorted(List<Integer> listOne, List<Integer> listTwo) {
		
		Iterator<Integer> iterOne = listOne.iterator();
		Iterator<Integer> iterTwo = listTwo.iterator();
		List<Integer> sortedList = new ArrayList<>();
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
            if (elementOne >= elementTwo) {
                sortedList.add(elementTwo);
                if (iterTwo.hasNext()) {
					elementTwo = iterTwo.next();
				} else {
					sortedList.add(elementOne);
                	return iterOne;
				}
            } else {
                sortedList.add(elementOne);
                if (iterOne.hasNext()) {
					elementOne = iterOne.next();
				} else {
					sortedList.add(elementTwo);
                	return iterTwo;
				}
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
