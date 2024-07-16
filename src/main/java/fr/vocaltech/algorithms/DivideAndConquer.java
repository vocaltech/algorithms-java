package fr.vocaltech.algorithms;

public class DivideAndConquer {
    public static int findMax(int[] a, int lo, int hi) {
        // stop condition
        if (lo == hi) return a[lo];

        int mid = (lo + hi) / 2;

        int leftMax = findMax(a, lo, mid);
        int rightMax = findMax(a, mid +1, hi);

        return Math.max(leftMax, rightMax);
    }
}
