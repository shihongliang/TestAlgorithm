package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class FindK {

    public static int quickSelect(int[] a, int low, int high, int k) {

        if (low == high) {
            return a[low];
        }
        int keyPos = partition(a, low, high);
        int num = keyPos - low + 1;
        if (num == k) {
            return a[low];
        } else if (k < num) {
            return quickSelect(a, low, keyPos - 1, k);
        } else {
            return quickSelect(a, keyPos + 1, high, k - num);
        }
    }

    /**
     * @param a
     * @param low
     * @param high
     * @return
     */
    private static int partition(int[] a, int low, int high) {
        // TODO Auto-generated method stub
        int key = a[low];
        while (low < high) {
            while (low < high && a[high] >= key) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= key) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(quickSelect(a, 0, a.length - 1, 5));

    }
}
