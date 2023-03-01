package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<Integer> run(List<Integer> numbers) {
        return run(numbers, "asc");
    }

    public static List<Integer> run(List<Integer> numbers, String direction) {

        List<Integer> sortedList = new ArrayList<>(numbers);
        Integer[] emptyNumbers = {};
        List<Integer> emptyList = Arrays.asList(emptyNumbers);

        if (numbers.isEmpty()) {
            return emptyList;
        }

        sort(sortedList, 0, sortedList.size() - 1, direction);

        return sortedList;
    }

    public static void sort(List<Integer> numbers, int left, int right, String direction) {

        var length = right - left + 1;

        if (length < 2) {
            return;
        }

        var pivot = numbers.get(left);
        var splitIndex = partition(numbers, left, right, pivot, direction);
        sort(numbers, left, splitIndex - 1, direction);
        sort(numbers, splitIndex, right, direction);

    }

    public static int partition(List<Integer> numbers, int left, int right, int pivot, String direction) {

        while (true) {

            if (direction.equals("desc")) {

                while (numbers.get(left) > pivot) {
                    left++;
                }

                while (numbers.get(right) < pivot) {
                    right--;
                }
            } else {

                while (numbers.get(left) < pivot) {
                    left++;
                }

                while (numbers.get(right) > pivot) {
                    right--;
                }
            }

            if (left >= right) {
                return right + 1;
            }

            var temporary = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temporary);

            left++;
            right--;

        }
    }

    public static void main(String[] args) {

        List<Integer> listToSort = List.of();

        List<Integer> sortedList = run(listToSort, "desc");

        System.out.println(sortedList);

    }
}
