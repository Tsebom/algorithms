package org.tsebom.groking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class GrokFourTest {

    @Test
    void sumTest() {
        List<Double> list = List.of(1.0, 2.0, 3.0);

        double result = GrokFour.sum(list);
        assertEquals(6.0, result);
    }

    @Test
    void maxTest() {
        List<Double> list1 = List.of(1.0);
        List<Double> list2 = List.of(1.0, 2.0);
        List<Double> list3 = List.of(1.0, 2.0, 3.0);

        double result2 = GrokFour.max(list2);
        double result1 = GrokFour.max(list1);
        double result3 = GrokFour.max(list3);
        assertEquals(1.0, result1);
        assertEquals(2.0, result2);
        assertEquals(3.0, result3);
    }

    @Test
    void binarySearch() {
        List<Integer> list = IntStream.rangeClosed(1, 100)
                .boxed()
                .toList();

        int result = GrokFour.binarySearch(list, 50);
        assertEquals(50, result);
        int result2 = GrokFour.binarySearch(list, 76);
        assertEquals(76, result2);
    }

    @Test
    void quicksortTest() {
        List<Integer> list0 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> list1 = List.of(1, 9, 7, 10, 3, 5, 6, 2, 8, 4);
        List<Integer> list2 = List.of(7, 2, 9, 4, 1, 8, 5, 10, 3, 6);
        List<Integer> list3 = List.of(3, 8, 1, 6, 10, 2, 9, 5, 4, 7);
        List<Integer> list4 = List.of(5, 10, 4, 7, 2, 3, 8, 1, 6, 9);
        List<Integer> list5 = List.of(9, 1, 6, 3, 5, 10, 7, 4, 2, 8);
        List<Integer> list6 = List.of(2, 4, 8, 10, 6, 9, 1, 7, 5, 3);
        List<Integer> list7 = List.of(6, 3, 10, 8, 7, 4, 2, 9, 1, 5);
        List<Integer> list8 = List.of(8, 5, 2, 1, 9, 6, 4, 3, 10, 7);
        List<Integer> list9 = List.of(4, 7, 3, 5, 8, 1, 10, 6, 9, 2);
        List<Integer> list10 = List.of(10, 6, 5, 2, 4, 7, 3, 8, 9, 1);

        assertEquals(list0, GrokFour.quicksort(list1));
        assertEquals(list0, GrokFour.quicksort(list2));
        assertEquals(list0, GrokFour.quicksort(list3));
        assertEquals(list0, GrokFour.quicksort(list4));
        assertEquals(list0, GrokFour.quicksort(list5));
        assertEquals(list0, GrokFour.quicksort(list6));
        assertEquals(list0, GrokFour.quicksort(list7));
        assertEquals(list0, GrokFour.quicksort(list8));
        assertEquals(list0, GrokFour.quicksort(list9));
        assertEquals(list0, GrokFour.quicksort(list10));
    }
}