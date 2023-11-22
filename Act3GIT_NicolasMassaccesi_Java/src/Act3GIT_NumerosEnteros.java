import java.util.Scanner;

public class Act3GIT_NumerosEnteros {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min;
    int max;
    do {
      System.out.print("Ingrese el minimo:");
      min = (int)Double.parseDouble(sc.nextLine());
      System.out.print("Ingrese el maximo:");
      max = (int)Double.parseDouble(sc.nextLine());
    } while (min > max);
    
    
    for (int i = min; i <= max; i+=7) {
      System.out.println("Numero: "+i);
    }
    sc.close();
  }

}
