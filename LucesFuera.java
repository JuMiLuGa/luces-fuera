import java.util.*;

public class LucesFuera {
  private boolean[][] matriz;
  private int tamaño;

  public LucesFuera(int tamaño) {
    this.tamaño = tamaño;
    this.matriz = new boolean[tamaño][tamaño];
  }

  public void rellenarMatriz() {

  }

  public void imprimirMatriz() {
    System.out.println();
      for (int i = 0; i < tamaño; i++) {
        for (int j = 0; j < tamaño; j++) {
          if (matriz[i][j]) {
            System.out.print("O ");
          } else {
            System.out.print("X ");
          }
        }
        System.out.println();
      }
  }

  public boolean comprobarVictoria() {
    
  }

  public void invertirPosiciones(int x, int y) {

  }



  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Introduce el tamaño de la matriz: ");
    int tamaño = input.nextInt();
    LucesFuera lucesFora = new LucesFuera(tamaño);
    lucesFora.rellenarMatriz();
    while (!lucesFora.comprobarVictoria()) {
      lucesFora.imprimirMatriz();
      System.out.print("Introduce la fila y columna (1-" + tamaño + "): ");
      int fila = input.nextInt() - 1;
      int columna = input.nextInt() - 1;
      lucesFora.invertirPosiciones(fila, columna);
    }
    System.out.println("Has ganado!");
  }
}