package M6;

public class CallByValue {
  static void F1(int a,int b){
    int t=a;
    a=b;
    b=t;
    System.out.println("In Funcion "+a + " "+b);
  }
  public static void main(String[] args) {
    int a=55;
    int b=60;
    System.out.println("Before Funcion "+a + " "+b);
    F1(a,b);
    System.out.println("After Funcion "+a + " "+b);
  }
}
