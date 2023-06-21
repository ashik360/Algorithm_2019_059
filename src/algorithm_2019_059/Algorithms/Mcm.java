/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_059.Algorithms;

/**
 *
 * @author Shuvo
 */
public class Mcm {
    static int Mcm(int p[], int n) {
        int m[][] = new int[n][n];

        int i, j, k, L, q;

        for (i = 1; i < n; i++)
            m[i][i] = 0;

        for (L = 2; L < n; L++) {
            for (i = 1; i < n - L + 1; i++) {
                j = i + L - 1;
                if (j == n)
                    continue;
                m[i][j] = Integer.MAX_VALUE;
                for (k = i; k <= j - 1; k++) {
                    q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j])
                        m[i][j] = q;
                }
            }
        }

        return m[1][n - 1];
    }

    public void Mcm() {
        int arr[] = new int[] { 10, 30, 5, 60 };
        int size = arr.length;

        System.out.println("Given matrices: a = " + arr[0] + "x" + arr[1] + ", b = " + arr[1] + "x" + arr[2] + ", c = "
                + arr[2] + "x" + arr[3]);
        System.out.println("Minimum number of multiplications is: "
                + Mcm(arr, size));
    }
}
