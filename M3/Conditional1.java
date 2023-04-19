package M3;
/*
 * Conditional Statements
 * ----------------------
 * if else
 * if else if else
 * switch
 * 
 * ternary operator -- 3 operands
 * variable = condition ? statement1 : statement2;
 */
public class Conditional1 {
  public static void main(String[] args) {
  int day = 4;
  switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
    }
  }
}
