package atividadesjava;

public class Main {

  public static void main(String[] args) {

    System.out.println("Exercício Calculadora");
    Calculadora.somar(3, 3);
    Calculadora.subitrair(4, 5);
    Calculadora.multiplicar(8, 2);
    Calculadora.dividir(16, 2);

    System.out.println("Exercício mensagem");
    Mensagem.obterMensagem(5);
    Mensagem.obterMensagem(12);
    Mensagem.obterMensagem(28);
    Mensagem.obterMensagem(17);

    System.out.println("Exercício Emprestimo");
    Emprestimo.calcular(1000, 2);
    Emprestimo.calcular(1000, Emprestimo.getTresParcelas());

  }
}
