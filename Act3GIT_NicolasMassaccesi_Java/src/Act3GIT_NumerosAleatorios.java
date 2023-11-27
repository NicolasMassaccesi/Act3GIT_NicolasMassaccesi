import java.util.Random;
import java.util.Scanner;
public class Act3GIT_NumerosAleatorios {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número:");
    double num = Double.parseDouble(sc.nextLine());
    for (int i = 1; i <= 30; i++) {
      Random rand = new Random();
      System.out.println(rand.nextInt(1, 11));
    }
    if (num >= 1 && num <= 10) {
      System.out.println("Su numero "+num+" se encuentra en el rango.");
      
    }

  }

}
