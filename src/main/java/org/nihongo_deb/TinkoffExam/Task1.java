package org.nihongo_deb.TinkoffExam;

import java.util.Scanner;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 18.03.2023
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n = input.nextInt();
        double m = input.nextInt();
        double k = input.nextInt();

        int totalTime = (int) Math.ceil((n * k) / m);

        System.out.println(totalTime);
    }
}
