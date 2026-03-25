package curriculum.b;

import java.util.Scanner;
import curriculum.b.Greeting;

public class Question5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		// scanner を作成
		
		// 下記Q1の変数宣言,処理,出力
		helloWorld();
		
		// 下記Q2の変数宣言,処理,出力
		System.out.println("数値を入力してください");
		// 数値を入力してください と出力
		int Q2IN = scanner.nextInt() ; 
		// 変数 Q2IN にコンソール入力された値をを代入
		doubleValue(Q2IN) ;
		System.out.println(Q2IN + "を 2 倍すると " + doubleValue(Q2IN) + " です。");
		
		// 下記Q3の変数宣言,処理,出力
		int Q3num1 = 7;
		int Q3num2 = 10;
		System.out.println(Q3num1 + " は" + (isEven(Q3num1) ? "偶数です。" : "奇数です。"));
		System.out.println(Q3num2 + " は" + (isEven(Q3num2) ? "偶数です。" : "奇数です。"));
		
		// 下記Q4の変数宣言,処理,出力
		Greeting greeting = new Greeting();
		greeting.sayHello();
		
		
		scanner.close();
		// Scannerを終了
		
	}
	
	// 下記Q1使用メソッドの定義
	public static void helloWorld() {
		System.out.println("Hello World!");
	}
	
	// 下記Q2使用メソッドの定義
	public static int doubleValue(int Q2num) {
		return Q2num * 2;
	}
	
	// 下記Q3使用メソッドの定義
	public static boolean isEven(int Q3num ) {
		return Q3num % 2 == 0 ; 
	}
	
}