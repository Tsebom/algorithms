package org.tsebom.groking;

import java.util.ArrayList;
import java.util.List;

public class GrokFour {

    public static double sum (
            List<Double> list
    ) {
        if (list == null || list.isEmpty()) {
            return 0.0;
        }
        return list.get(0) + sum(list.subList(1, list.size()));
    }


    public static double max(
            List<Double> list
    ) {
        if (list.size() < 2) {
            return list.get(0);
        }
        return Math.max(list.get(0), max(list.subList(1, list.size())));
    }


    public static int binarySearch(
            List<Integer> list,
            int el
    ) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List not must be empty or null");
        }
        if (list.size() < 2) {
            return  list.get(0);
        }

        int index = list.size() / 2;
        if (list.get(index) == el) {
            return list.get(index);
        } else if (list.get(index) < el) {
            return binarySearch(list.subList(index + 1, list.size()), el);
        } else {
            return binarySearch(list.subList(0, index), el);
        }
    }


    public static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        int base = list.get(0);

        List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < base) {
                less.add(list.get(i));
            }

            if (list.get(i) > base) {
                more.add(list.get(i));
            }
        }

        more = quicksort(more);
        more.add(0, base);

        less = quicksort(less);
        less.addAll(more);

        return less;
    }
}
