package M6;

public class Function1 {
  static void F1(){
    System.out.println("From F1");
  }
  static int F2(int a, int b){
    return a+b;
  }
  public static void main(String[] args) {
    F1();
    System.out.println(F2(5,2));
  }
}