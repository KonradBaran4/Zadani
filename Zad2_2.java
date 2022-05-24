import java.util.Scanner;
public class Zad2_2 {
    public static void main(String args[]) {
      int a,b;
      Scanner test = new Scanner(System.in);
      System.out.println("Podaj wartosc a: ");
      a=test.nextInt();
      System.out.println("Podaj wartosc b: ");
      b=test.nextInt();
      System.out.println("Suma: ");
      System.out.println(a+b);
      System.out.println("Roznica: ");
      System.out.println(a-b);
      System.out.println("Iloczyn: ");
      System.out.println(a*b);
      System.out.println("Iloraz: ");
      System.out.println(a/b);
    }
}