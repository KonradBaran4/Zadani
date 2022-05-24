import java.util.Scanner;
public class Zad2_13 {
    public static void main(String args[]) {
      int k;
      Scanner test = new Scanner(System.in);
      System.out.println("Podaj ocene");
      k=test.nextInt();
      switch(k){
          case 2: System.out.println("Niedostateczny");
          break;
          case 3: System.out.println("Dostateczny");
          break;
          case 4: System.out.println("Dobry");
          break;
          case 5: System.out.println("Bardzo dobry");
          break;
          default: System.out.println("Podano nieprawidlowa ocene");
          break;
      }
    }
}