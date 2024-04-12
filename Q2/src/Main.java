import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    var arr = new int[30];

    for (int i = 0; i < 30; i++) {
      arr[i] = fibonnacci(i + 1);
    }

    System.out.println(Arrays.toString(arr));
  }

  public static int fibonnacci(int num) {
    if (num < 3)
      return 1;
    return fibonnacci(num - 1) + fibonnacci(num - 2);
  }
}
