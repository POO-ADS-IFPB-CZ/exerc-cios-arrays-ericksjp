import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    var arr = new ArrayList<Double>(10);
    double num;
    int acc = 0;

    while (true) {
      System.out.print("Digite um número: ");
      num = sc.nextDouble();
      if (num < 0)
        break;
      arr.add(num);
      acc++;
    }
    sc.close();

    double media = calcularMedia(arr);

    System.out.println("\nForam digitados " + acc + " números.");
    System.out.println("A média dos números é: " + media);
  }

  public static double calcularMedia(Number[] arr) {
    return calcularMedia(List.of(arr));
  }

  public static double calcularMedia(Iterable<? extends Number> arr) {
    double acc = 0;
    int size = 0;
    for (Number num : arr) {
      acc += num.doubleValue();
      size++;
    }
    if (size == 0)
      return 0;
    acc /= size;
    return acc;
  }
}
