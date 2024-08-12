package com.drosa.hackerrank.codechangeproblem;

import java.util.*;

class GFG {

    // Returns the count of ways we can
    // sum coins[0...n-1] coins to get sum "sum"
    static int count(int[][] memory,int coins[], int n, int sum) {
        System.out.println("entrado n,sum: " + n + " " + sum);
        // If sum is 0 then there is 1 solution
        // (do not include any coin)
        if (sum == 0)
            return 1;

        // If sum is less than 0 then no
        // solution exists
        if (sum < 0)
            return 0;

        // If there are no coins and sum
        // is greater than 0, then no
        // solution exist
        if (n <= 0)
            return 0;

        if (memory[n][sum]!=-1)
            return memory[n][sum];
        // count is sum of solutions (i)
        // including coins[n-1] (ii) excluding coins[n-1]
        return count(memory,coins, n - 1, sum)
                + count(memory,coins, n, sum - coins[n - 1]);
    }

    // Driver code
    public static void main(String args[]) {

        int coins[] = {1};
        int n = coins.length;
        int sum = 2;
        int[][] memory = new int[n+1][sum+1];
        for (int i=0;i<=n;i++)
            for (int j=0;j<=sum;j++)
                memory[i][j] = -1;

        System.out.println(count(memory,coins, n, 2));
    }
}
