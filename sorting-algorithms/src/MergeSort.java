import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MergeSort {
    public List<Integer> mergeSort (List<Integer> list) {

        if (list.size() == 1) return list;

        List<List<Integer>> splitted = splitList(list);
        List<Integer> listOne = mergeSort(splitted.get(0));
        List<Integer> listTwo = mergeSort(splitted.get(1));



        return mergeSorted(listOne, listTwo);
    }

    private List<List<Integer>> splitList (List<Integer> list) {
        int size = list.size();
        List<Integer> listOne = new ArrayList<>(list.subList(0, (size +1)/2));
        List<Integer> listTwo = new ArrayList<>(list.subList((size+1)/2, size));
        List<List<Integer>> lists = new ArrayList<>(Arrays.asList(listOne, listTwo));

        return lists;
    }

    public List<Integer> mergeSorted(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> sortedList = new ArrayList<>();

        Iterator<Integer> itrOne = listOne.iterator();
        Iterator<Integer> itrTwo = listTwo.iterator();
        int listOneElement = itrOne.next();
        int listTwoElement = itrTwo.next();

        while (notExhausted(itrOne, itrTwo)) {
            if (listOneElement >= listTwoElement) {
                sortedList.add(listTwoElement);
                listTwoElement = itrTwo.next();
            } else {
                sortedList.add(listOneElement);
                listOneElement = itrOne.next();
            }
        }

        Iterator<Integer> remainingIter;
        int remainingElement;

        if (!itrOne.hasNext()) {
            sortedList.add(listOneElement);
            remainingElement = listTwoElement;
            remainingIter = itrTwo;
        } else {
            sortedList.add(listTwoElement);
            remainingElement = listOneElement;
            remainingIter = itrOne;
        }

        addRemainingElements(sortedList, remainingIter, remainingElement);

        return sortedList;
    }

    private void addRemainingElements(List<Integer> sortedList, Iterator<Integer> remainingIter, int remainingElement) {
        do {
            sortedList.add(remainingElement);
            remainingElement = remainingIter.next();
        } while (remainingIter.hasNext());
        sortedList.add(remainingElement);
    }

    private boolean notExhausted(Iterator<Integer> itrOne, Iterator<Integer> itrTwo) {
        return itrOne.hasNext() && itrTwo.hasNext();
    }
}
