package com.darkRealm;

import com.darkRealm.Recursion_and_DynamicProg.Recursion_and_DP;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Jayam on 12/20/2016.
 */
public class Recursion_DP_Main {

  public static void testNthFibonacciMemoized() {
    long n = Recursion_and_DP.NthFibonacciMemoized(0);
    System.out.println(" fibo " + n);
  }

  public static void testNthFiboIterative() {
    long n = Recursion_and_DP.NthFibonacciIterative(6);
    System.out.println("It fibo : " + n);
  }

  public static void testTripleSteps() {
    long startTime = System.currentTimeMillis();
    long nofways = Recursion_and_DP.TripleSteps(37, 3);
    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
    System.out.println("no of ways " + nofways);
    System.out.println("time - " + elapsedTime + " ms");
  }

  public static void testRobotGrid() {
    int[][] matrix = new int[][]{
        {0, 0, 0, 1},
        {1, 0, 1, 0},
        {0, 0, 0, 0},
        {0, 1, 0, 0},
    };
    long startTime = System.currentTimeMillis();
    String result = Recursion_and_DP.RobotGridPath(matrix);
    long stopTime = System.currentTimeMillis();
    System.out.println("Path results   - " + result);
    long elapsedTime = stopTime - startTime;
    System.out.println("time - " + elapsedTime + " ms");
  }

  public static void testPowerSet() {
    char[] set = new char[]{'a', 'b', 'c'};
    String power = Recursion_and_DP.printPowerSet(set);
    System.out.println(" power set " + power);
  }

  public static void testAllPermutationsWithoutDups() {
    Recursion_and_DP.printtAllPermuationsWithOutDups("abca");
  }

  public static void testAllPermutationsWithDups() {
    Set<String> permutes = Recursion_and_DP.printtAllPermuationsWithDups("abcd");
    String[] arr = new String[permutes.size()];
    permutes.toArray(arr);
    for (String s :
        arr) {
      System.out.println(s + " perm");
    }
  }

  public static void testParensCombination() {
    long b4= System.currentTimeMillis();
    ArrayList<String> perm = Recursion_and_DP.printAllParensCombo(3);
    long aftr = System.currentTimeMillis();
    for (String s :
        perm) {
      System.out.println("paran  " + s);
    }
    System.out.println("time ms " + (aftr-b4));
  }
}