package darkRealm;

public class IntegerBreak {

//  #343. Integer Break
//  Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of
//  those integers. Return the maximum product you can get.
//  For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
//  Note: You may assume that n is not less than 2 and not larger than 58.

  public static int integerBreak(int n) {
    if (n == 2) return 1; // Two base cases, cant keep these in dp array as they are special cases
    if (n == 3) return 2;
    int[] dp = new int[n + 1];
    for (int i = 0; i <= n; i++)
      dp[i] = i;  //initialize with all the numbers till the given N

    for (int i = 2; i <= n; i++)
      // for each number try to get two numbers that give more product than current
      for (int j = 1; j <= i - j; j++)   // why i - j bcoz we will be counting factors once
        dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);

    return dp[n];
  }

  public static void main(String[] args) {
    int n = 10;
    int res = integerBreak(n);
    System.out.println("N : " + n);
    System.out.println("R : " + res);
  }
}
