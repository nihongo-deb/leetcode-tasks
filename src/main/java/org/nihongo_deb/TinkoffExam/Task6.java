package org.nihongo_deb.TinkoffExam;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studCount = scanner.nextInt();
        int maxScore = scanner.nextInt();

        Exam [] exams = new Exam[studCount];

        for (int i = 0; i < studCount; i++){
            Exam exam = new Exam(scanner.nextInt(), scanner.nextInt());
            exams[i] = exam;
        }

        Arrays.sort(exams);

        int mid = exams[exams.length / 2].value;
        int currentScore = 0;

        for (Exam e : exams){
            currentScore += e.value;
        }

        int diff = maxScore - currentScore;

        while (diff != 0){
            int index = 0;
            for (Exam e : exams){
                if (e.value <= mid && mid + 1 <= e.max && mid + 1 - e.value <= diff){
                    diff -= mid + 1 - e.value;
                    e.value = mid + 1;
                    Arrays.sort(exams);
                    mid = exams[exams.length / 2].value;
                    break;
                }
                index++;
            }
            if (index >= exams.length - 1)
                break;
        }

        System.out.println(mid);
    }

    static class Exam implements Comparable<Exam>{
        public int min;
        public int max;

        public int value;

        public Exam(int min, int max) {
            this.value = min;
            this.min = min;
            this.max = max;
        }

        @Override
        public int compareTo(Exam o) {
            return o.value - this.value;
        }
    }
}
