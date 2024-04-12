import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    var notas = new double[10];
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Digite a nota " + (i + 1) + ": ");
      notas[i] = sc.nextDouble();
    }
    sc.close();

    double media = calcularMedia(notas);
    System.out.println("A média das notas é: " + media);

    int notasAcimaDaMedia = 0;
    int notasAbaixoDaMedia = 0;
    for (var nota : notas) {
      if (nota >= media) {
        notasAcimaDaMedia++;
      } else {
        notasAbaixoDaMedia++;
      }
    }

    System.out.println("Notas acima da média: " + notasAcimaDaMedia);
    System.out.println("Notas abaixo da média: " + notasAbaixoDaMedia);
  }

  public static double calcularMedia(double[] notas) {
    double total = 0;
    for (var nota : notas) {
      total += nota;
    }
    return total / notas.length;
  }
}
