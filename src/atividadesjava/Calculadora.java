package atividadesjava;

public class Calculadora {

  public static void somar(double numero1, double numero2) {
    double resultado = numero1 + numero2;
    System.out.println("A soma de " + numero1 + " mais " + numero2 + " é: " + resultado);
  }

  public static void subitrair(double numero1, double numero2) {
    double resultado = numero1 - numero2;
    System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é: " + resultado);
  }

  public static void multiplicar(double numero1, double numero2) {
    double resultado = numero1 * numero2;
    System.out.println("A multipicação de " + numero1 + " vezes " + numero2 + " é: " + resultado);
  }

  public static void dividir(double numero1, double numero2) {
    double resultado = numero1 / numero2;
    System.out.println("A divisão de " + numero1 + " divisão " + numero2 + " é: " + resultado);
  }
}