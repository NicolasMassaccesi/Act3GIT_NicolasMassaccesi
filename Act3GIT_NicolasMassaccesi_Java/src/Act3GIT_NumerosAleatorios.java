import java.util.Random;
public class Act3GIT_NumerosAleatorios {

  public static void main(String[] args) {
    
    for (int i = 1; i <= 20; i++) {
      Random rand = new Random();
      System.out.println(rand.nextInt(1, 11));
    }

  }

}
