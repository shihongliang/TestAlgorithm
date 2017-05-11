/**
 * 
 */
package com.whu.test;

/**
 * @author hongliang
 *
 */
public class Main {
	
	 // 纯暴力枚举，复杂度接近O(n^3)，但结果一定正确
    static boolean resolve2(int[] A) {
        int len = A.length;
        if (len < 8) return false;
        int[] sum = new int[len];
        sum[0] = A[0];
        for (int i = 1; i < len; i++) {
            sum[i] = A[i];
            sum[i] += sum[i - 1];
        }
        for (int p1 = 1; p1 < len - 5; p1++) {
            for (int p2 = p1 + 2; p2 < len - 3; p2++) {
                for (int p3 = p2 + 2; p3 < len - 1; p3++) {
                    if (sum[p1 - 1] == sum[p2 - 1] - sum[p1] && sum[p1 - 1] == sum[p3 - 1] - sum[p2]) {
//                        System.out.println(p1 + " " + p2 + " " + p3);
                        return true;
                    }
                }
            }
        }
        return false;

    }

    // 复杂度O(n), 仅适用于数组元素全为正的情况
    static boolean resolve(int[] A) {
        int len = A.length;
        if (len < 8) return false;
        int[] sum = new int[len + 5];
        sum[0] = 0;
        for (int i = 1; i <= len; i++) {
            sum[i] = A[i - 1];
            sum[i] += sum[i - 1];
        }
        int p1 = 0, p2 = 0, p3 = 0;
        for (; p1 < len; p1++) {
            while (p2 <= p1) p2++;
            while (p3 <= p2) p3++;
            if (p3 >= len) break;
            while (sum[p2] - sum[p1 + 1] < sum[p1] && p2 < len) p2++;
            if (p2 == len) break;
            while (p3 <= p2 && p3 < len) p3++;
            while (sum[p3] - sum[p2 + 1] < sum[p1] && p3 < len) p3++;
            if (p3 == len) break;
            if (sum[p1] == sum[p2] - sum[p1 + 1] &&
                    sum[p1] == sum[p3] - sum[p2 + 1] &&
                    sum[len] - sum[p3 + 1] == sum[p1]) {
                return true;
        //       System.out.println(p1 + " " + p2 + " " + p3);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 1, 1, 1, 4, 3, 7, 5, 7};

//        int[] arr = {0, 5, 1, -1, 1, -1, 4, 0, 7, 5, -5};

//        int[] arr = {2, 3, 7, 1, 12, 2, 4, 8, 6, 7, 5};

//        int[] arr = {1, 2, 3, 4, 5, 6, -4, 21, -4, 9, 12, -4, 6, 5, 4, 2, 1, 3};

//        int[] arr = {1, 2, 3, 4, 5, 6, 233, 21, 233, 9, 12, 233, 6, 5, 4, 2, 1, 3};

        System.out.println(resolve(arr) ? "true" : "false");
        System.out.println(resolve2(arr) ? "true" : "false");
    }

}
