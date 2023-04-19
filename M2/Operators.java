package M2;

/**
 * Operators
 * Arithematic Operators
 * sum = a + b -> + is operator, a,b are operands  
 * 1. Binary   2. Unary
 * 1. Binary -> +, -, *, /, % --> require 2 operands
 * 2. Unary  -> ++, -- --> require 1 operand
 */
public class Operators {
  public static void main(String[] args) {
    int a = 10;
    int b = ++a;
    System.out.println(a+" "+b);
    /*
     * output: 11 11
     * first increment a assign to b then update value of a
     */
    int a1 = 10;
    int b1 = a1++;
    System.out.println(a1+" "+b1);
    /*
     * output: 11 10
     * first assign a1 to b1  then increment a1 then update value of a1
     */
    int a2 = 10;
    int b2 = --a2;
    System.out.println(a2+" "+b2);
    /*
     * output: 9 9
     * first decrement a2 assign to b2 then update value of a2
     */
    int a3 = 10;
    int b3 = a3--;
    System.out.println(a3+" "+b3);
    /*
     * output: 9 10
     * first assign a3 to b3  then increment a3 then update value of a3
     */
  }
}