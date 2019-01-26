import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public void swap (List<Integer> list, int indexOne, int indexTwo) {
        Collections.swap(list, indexOne, indexTwo);
    }

    public void singleRowSwap(List<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i+1)) {
                swap(list, i, i+1);
            }
        }
    }
    public void bubbleSort (List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            List<Integer> clonedList = new ArrayList<>(list);
            singleRowSwap(list);
            if (list.equals(clonedList)) {
                break;
            }
         }
    }
}
