package org.nihongo_deb.TinkoffExam;

import java.util.Scanner;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] strNums = scanner.nextLine().split(" ");

        Map<String, Integer> map = new HashMap<>();

        int length = 0;
        int maxLength = 0;
        for (String s : strNums) {
            map.merge(s, 1, Integer::sum);

            int maxVal = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
            int minVal = Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getValue();

            int diff = maxVal - minVal;

            boolean pathetic;

            if (diff == 1) {
                pathetic = Collections.frequency(map.values().stream().toList(), maxVal) == 1 ||
                        Collections.frequency(map.values().stream().toList(), minVal) == 1;
            } else pathetic = map.entrySet().stream().allMatch(e -> e.getValue() == 1);

            if (pathetic) {
                maxLength = length;
            }
            length++;
        }
        System.out.println(maxLength + 1);
    }
}
