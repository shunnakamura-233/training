package curriculum_B;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		// scanner を作成
		
		// 以下Q1の変数宣言,条件文と出力
		int score = 75; // int型の変数 score を宣言し 75 を代入
		if (score >= 60) {System.out.println("合格です！");}
		// 変数 score が 60 以上か判定し 60 以上であれば 合格です！ と出力
		
		// 以下Q2の変数宣言,条件文と出力
		int age = 25; // int型の変数 age を宣言し 25 を代入
		if ((age >= 25) && (age <= 30)) {System.out.println("適正年齢です");}
		// 変数 age が 25 以上 30 以下か判定し 25 以上 30 以下であれば 合格です！ と出力
		else {System.out.println("対象外です");}
		//条件に当てはまらなかった場合 対象外です と出力
		
		// 以下Q3の変数宣言,条件文と出力
		age = 18; // 変数 age に 18 を代入
		if (age >= 20) {System.out.println("成人です");}
		// 変数 age が 20 以上か判定し 20 以上であれば 成人です と出力
		else if ((age >= 13) && (age <= 19)) {System.out.println("ティーンエイジャーです");}
		// 上記の条件に当てはまらなかった場合変数 age が 13 以上 19 以下か判定し 13 以上 19 以下であれば "ティーンエイジャーです と出力
		else {System.out.println("子供です");}
		// 上記の条件に当てはまらなかった場合　子供です　と出力
		
		// 以下Q4の変数宣言,条件文と出力
		int x = 30,y = 15,z = 50; 
		// 次の変数をint型で宣言し変数 x に 30 を変数 y に 15 を変数 z に 50 をそれぞれ代入
		if (( x > y ) && ( x > z )) {System.out.println(x);}
		// 変数 x が変数 y , z よりか判定し大きかった場合変数 x の値を出力
		else if (( y > x ) && ( y > z )) {System.out.println(y);}
		// 上記の条件に当てはまらなかった場合変数 y が変数 x , z よりか判定し大きかった場合変数 x の値を出力
		else {System.out.println(z);}
		//　上記の条件に当てはまらなかった場合変数 z の値を出力
		
		// 以下Q5の変数宣言,条件文と出力
		System.out.println("数値を入力してください");
		//数値を入力してください と出力
		int num = scanner.nextInt() ; 
		// int型の変数 num に コンソール入力された値をを代入
		if ( num > 0 )  {System.out.println("正の数です");}
		// 変数 num が 0 よりか判定し大きかった場合 正の数です と出力
		else if ( num == 0 ) {System.out.println("0です");}
		// 上記の条件に当てはまらなかった場合変数 num が 0 であるか判定し同じであれば 0です と出力
		else {System.out.println("負の数です");}
		//　上記の条件に当てはまらなかった場合 負の数です と出力
		
		// 以下Q6の変数宣言,条件文と出力
		System.out.println("数値を入力してください");
		//数値を入力してください と出力
		int value = scanner.nextInt() ; 
		// 変数 value にコンソール入力された値をを代入
		String valueString = (value % 2 == 0) ? "偶数です。" : "奇数です。";
		// 変数 value が2で割ったときに余りが出るかを判定し出ない場合は 偶数です。 でた場合は 奇数です。 を変数valueString に代入 
		System.out.println(valueString);
		//変数 valueString の値を出力
		
		// 以下Q7の変数宣言,条件文と出力
		System.out.println("数値を入力してください");
		//数値を入力してください と出力
		score = scanner.nextInt() ;
		// 変数 score にコンソール入力された値をを代入
		if ( score >= 90 )  {System.out.println("優");}
		// 変数 score が 90 以上か判定し 90 以上の場合 優 と出力
		else if ( score >= 70 ) {System.out.println("良");}
		// 上記の条件に当てはまらなかった場合変数 score が 70 以上か判定し 70 以上の場合 良 と出力
		else if ( score >= 50 ) {System.out.println("可");}
		// 上記の条件に当てはまらなかった場合変数 score が 50 以上か判定し 50 以上の場合 可 と出力
		else {System.out.println("不可");}
		//　上記の条件に当てはまらなかった場合 不可 と出力
		
		// 以下Q8の変数宣言,条件文と出力
		System.out.println("入力してください");
		//入力してください と出力
		String Q8input = scanner.nextLine() ;
		// 変数 Q8input にコンソール入力された値をを代入
		if (Q8input == null || Q8input.equals(""))
		// 変数 Q8input が null または空白か判定
        System.out.println("入力が無効です");
		//条件が当てはまっていたら 入力が無効です と出力
		
		// 以下Q9の変数宣言,条件文と出力
		System.out.println("数値を入力してください");
		//数値を入力してください と出力
		int day = scanner.nextInt() ; 
		// 変数 day にコンソール入力された値をを代入
		switch (day) {
		//変数 day の値で複数判定
		case 1:
		System.out.println("今日は月曜日です");
		//値 1 だあった場合 今日は月曜日です と出力
		break;
		case 2:
		System.out.println("今日は火曜日です");
		//値 2 であった場合 今日は火曜日です と出力
		break;
		case 3:
		System.out.println("今日は水曜日です");
		//値 3 であった場合 今日は水曜日です と出力
		break;
		case 4:
		System.out.println("今日は木曜日です");
		//値 4 であった場合 今日は木曜日です と出力
		break;
		case 5:
		System.out.println("今日は金曜日です");
		//値 5 であった場合 今日は金曜日です と出力
		break;
		case 6:
		System.out.println("今日は土曜日です");
		//値 6 であった場合 今日は土曜日です と出力
		break;
		case 7:
		System.out.println("今日は日曜日です");
		//値 7 であった場合 今日は日曜日です と出力
		break;
		default:
		System.out.println("無効な値です");
		//当てはまるものがなかった場合 無効な値です と出力
		}
		
		// 以下Q9の変数宣言,条件文と出力
		System.out.println("数値を入力してください");
		//数値を入力してください と出力
		int month = scanner.nextInt() ; 
		// 変数 month にコンソール入力された値をを代入
		switch (month) {
		//変数 month の値で複数判定
		case 12:
		case 1:
		case 2:
		System.out.println("冬");
		//値 12,1,2 であった場合 冬 と出力
		break;
		case 3:
		case 4:
		case 5:
		System.out.println("春");
		//値 3,4,5 であった場合 春 と出力
		break;
		case 6:
		case 7:
		case 8:
		System.out.println("夏");
		//値 6,7,8 であった場合 夏 と出力
		break;
		case 9:
		case 10:
		case 11:
		System.out.println("秋");
		//値 9,10,11 だあった場合 秋 と出力
		break;
		default:
		System.out.println("無効な月です");
		//当てはまるものがなかった場合 無効な月です と出力
		}
		
        scanner.close();
        // Scannerを終了
	}

}
