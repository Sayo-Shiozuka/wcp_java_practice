public class Variable01 {
  public static void main(String[] args) {
    int num1; // int型の変数num1を宣言
    String str1;　//String型の変数str1を宣言
    num1 = 10;　// num1を初期化
    str1 = "Hello World";  //str1を初期化
    System.out.println(num1);
    System.out.println(str1);

    num1 = 20;　// num1に20を再代入
    System.out.println(num1);

    int num2 = 30;　// int 型の変数num2を宣言と同時に初期化
    System.out.println(num2);

    //定数の宣言（final装飾子）
    final int MIN_NUMBER = 10;
    System.out.println(MIN_NUMBER);

    //再代入しようとするとエラー
    //MIN_NUMBER = 20;

  }
}