import java.util.*;

public class LucesFuera {
  private boolean[][] matriz;
  private int tamaño;

  public LucesFuera(int tamaño) {
    this.tamaño = tamaño;
    this.matriz = new boolean[tamaño][tamaño];
  }

  public void rellenarMatriz() {
    Random random = new Random();
    for (int i = 0; i < tamaño; i++) {
        for (int j = 0; j < tamaño; j++) {
            matriz[i][j] = random.nextBoolean();
        }
    }
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
    for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
  }

  public void invertirPosiciones(int x, int y) {
    if (fila >= 0 && fila < tamaño && columna >= 0 && columna < tamaño) {
      matriz[fila][columna] = !matriz[fila][columna];
      if (fila > 0) {
          matriz[fila - 1][columna] = !matriz[fila - 1][columna];
      }
      if (fila < tamaño - 1) {
          matriz[fila + 1][columna] = !matriz[fila + 1][columna];
      }
      if (columna > 0) {
          matriz[fila][columna - 1] = !matriz[fila][columna - 1];
      }
      if (columna < tamaño - 1) {
          matriz[fila][columna + 1] = !matriz[fila][columna + 1];
      }
  } 
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