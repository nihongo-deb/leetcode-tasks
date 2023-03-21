package org.nihongo_deb.TinkoffExam;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int count = countSubarrays(a, 0, n-1);
        System.out.println(count);
    }

    public static int countSubarrays(int[] a, int start, int end) {
        if (start > end) {
            return 0;
        }

        int count = 0;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += a[i];
            if (sum == 0) {
                count++;
            }
        }

        return count + countSubarrays(a, start+1, end) + countSubarrays(a, start, end-1) - countSubarrays(a, start+1, end-1);
    }
}
