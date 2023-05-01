package M5;

public class rPattern2 {
  public static void main(String[] args) {
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
    char X='A';
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        System.out.print(X);
        X++;
      }
      System.out.println();
    }
  }
}
