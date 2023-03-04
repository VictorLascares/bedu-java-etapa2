public class App {
  public static void main(String [] args) {
    int number = 13;
    
    String binary = Integer.toBinaryString(number);

    System.out.println("El numero " + number + " en binario es: " + binary);
  }
}