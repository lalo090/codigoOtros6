
import java.util.Arrays; //faltaba el import

public class Codigo6 {

  public static void main(String[] args) { //faltaba void main

    int[] n = new int[20];  //new

    for (int i = 0; i < 20; i++) {   // i++
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " ");   //syso
    }

    System.out.println("\n¿Qué números quiere resaltar? "); //ln
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opcion = Integer.parseInt(System.console().readLine());  //cerrar )

    int multiplo = (opcion == 1) ? 5 : 7;  // ? :

    for (int e : n) {
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      } else {
        System.out.print(e + " ");  //syso
      }
    }
  }    //faltaba }
}
