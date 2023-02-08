import java.util.*;

public class LucesFuera {
  private boolean[][] tablero;
  private int tamaño;

  public LucesFuera(int tamaño) {
    this.tamaño = tamaño;
    this.tablero = new boolean[tamaño][tamaño];
  }

  public void rellenarAleatorio() {

  }

  public void imprimirTablero() {
 
  }

  public boolean TodasApagadas() {
    
  }

  public void invertirPosiciones(int x, int y) {

  }



  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Define el tamaño del tablero: ");
    int tamaño = entrada.nextInt();

    LucesFuera lucesFuera = new LucesFuera(tamaño);
    lucesFuera.rellenarMatriz();

}