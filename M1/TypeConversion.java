package M1;
public class TypeConversion {
  public static void main(String[] args) {
    /*
     * Implicit / Type Conversion / wideining / lossless conversion
     * ----------------------------------------------------------
     * byte -> short -> int -> float -> long -> double
     * 
     * Explicit / Type Casting / narrowing / loosy conversion
     * -------------------------------------------------------
     * double -> float -> long -> int -> char -> short -> byte 
     * 
     */
    double d = 166.66;  
    //converting double data type into long data type  
    long l = (long)d;  
    System.out.println(l);
    //converting long data type into int data type  
    int i = (int)l;  
    System.out.println(i);
  }
}
