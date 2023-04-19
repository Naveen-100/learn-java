package M2;
/*
 * Logical Operators
 * -----------------
 * && AND -- both true then only true
 * || OR -- both false then only false
 * ! NOT -- if true then false, false then true
 */
public class Operators3 {
  public static void main(String[] args) {
    System.out.println((5==5) && (6==6));
    System.out.println((5!=5) || (6==6));
    System.out.println(!(6==6));
  }
}