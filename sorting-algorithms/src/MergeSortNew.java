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
	
	public Iterator<Integer> mergeUntilOneEmpty(List<Integer> list, Iterator<Integer> iterOne, Iterator<Integer> iterTwo) {
		int elementOne = iterOne.next();
		int elementTwo = iterTwo.next();
		
		while (true) {
			
			if (!iterOne.hasNext()) {
				return iterTwo;
			} else if (!iterTwo.hasNext()){
				return iterOne;
			}
			
            if (elementOne >= elementTwo) {
                list.add(elementTwo);
                elementTwo = iterTwo.next();
            } else {
                list.add(elementOne);
                elementOne = iterOne.next();
            }
            
        }

		
	}
}
