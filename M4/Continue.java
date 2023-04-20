import java.util.Scanner;
/*
 * if user enter multiples of 10 continue
 */
public class Continue {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    do{
      System.out.print("Enter Number: ");
      int n=sc.nextInt();
      if(n%10==0) {
        continue;
      }
      System.out.println(n);
    }while(true);
  }
}
