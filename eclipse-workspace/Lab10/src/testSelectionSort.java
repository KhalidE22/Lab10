import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class testSelectionSort {

    @Test
    void testPositives() {
        SelectionSort sorter = new SelectionSort();
        int[] input = { 5, 2, 9, 1, 5 };
        int[] expected = { 1, 2, 5, 5, 9 };
        assertArrayEquals(expected, sorter.basicSelectionSort(input));
    }

    @Test
    void testNegatives() {
        SelectionSort sorter = new SelectionSort();
        int[] input = { -5, -2, -9, -1, -5 };
        int[] expected = { -9, -5, -5, -2, -1 };
        assertArrayEquals(expected, sorter.basicSelectionSort(input));
    }

    @Test
    void testMixed() {
        SelectionSort sorter = new SelectionSort();
        int[] input = { -5, 2, 0, -1, 5 };
        int[] expected = { -5, -1, 0, 2, 5 };
        assertArrayEquals(expected, sorter.basicSelectionSort(input));
    }

    @Test
    void testDuplicates() {
        SelectionSort sorter = new SelectionSort();
        int[] input = { 5, 2, 5, 1, 2 };
        int[] expected = { 1, 2, 2, 5, 5 };
        assertArrayEquals(expected, sorter.basicSelectionSort(input));
    }
}
