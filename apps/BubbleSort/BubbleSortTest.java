import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void swap() {
        List<Integer> list = Arrays.asList(10, 33, 40);
        int indexOne = 1;
        int indexTwo = 2;
        BubbleSort bs = new BubbleSort();
        bs.swap(list, indexOne, indexTwo);

        List<Integer> expectedList = Arrays.asList(10, 40, 33);

        assertEquals(expectedList, list, "Should swap last two indices");
    }

    @Test
    void swapWhenBigger() {
        List<Integer> list = Arrays.asList(10, 33, 40, 9);
        BubbleSort bs = new BubbleSort();
        bs.singleRowSwap(list);

        List<Integer> expectedList = Arrays.asList(10, 33, 9, 40);
        assertEquals(expectedList, list, "Should swap last two indices");
    }

    @Test
    void bubbleSort() {
        List<Integer> list = Arrays.asList(10, 33, 40, 9);
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(list);

        List<Integer> expectedList = Arrays.asList(9, 10, 33, 40);
        assertEquals(expectedList, list, "Should sort ascending");
    }
}