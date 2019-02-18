import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSort() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 8, 9, 3, 10, 11, 1));
        MergeSort ms = new MergeSort();
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 1, 3, 8, 9, 10, 11));

        assertEquals(expected, ms.mergeSort(list));
    } 
    
    @Test
    void mergeSortForOneElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2));
        MergeSort ms = new MergeSort();
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));

        assertEquals(expected, ms.mergeSort(list));
    }
    
    @Test
    void mergeSortedForOneElement() {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(2));
        MergeSort ms = new MergeSort();
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2));

        assertEquals(expectedList, ms.mergeSorted(listOne, listTwo));
    }
    
    @Test
    void mergeSortTwo() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 3, 10, 6, 9, 2, 1));
        MergeSort ms = new MergeSort();
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 9, 10));

        assertEquals(expected, ms.mergeSort(list));
    }

    @Test
    void mergeSorted() {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 6, 9, 10));
        MergeSort ms = new MergeSort();
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 9, 10));

        assertEquals(expectedList, ms.mergeSorted(listOne, listTwo));
    }

    @Test
    void mergeSortedTwo() {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(8, 9, 11, 12, 12));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(6, 7, 8, 10, 10));
        MergeSort ms = new MergeSort();
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(6, 7, 8, 8, 9, 10, 10, 11, 12, 12));

        assertEquals(expectedList, ms.mergeSorted(listOne, listTwo));
    }
}