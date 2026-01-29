package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		// scanner を作成
		Random random = new Random();
		// Random を作成		
		
		// 以下Q1の変数宣言,反復処理,出力
		for ( int Q1i = 1; Q1i <= 10; Q1i ++ ) {   
		// 上記変数宣言,変数 Q1i が 10 以下の反復処理
			System.out.println( Q1i );  
			// 上記変数 Q1i に代入した値を出力
			}
		
		// 以下Q2の変数宣言,反復処理,出力
		for ( int Q2i = 1; Q2i <= 20; Q2i ++ ) {   
		// 上記変数宣言,変数 Q2i が 20 以下の反復処理
			if (Q2i % 2 == 0)  {System.out.println(Q2i);}
			// 変数 Q2i が2で割ったときに余りが出るかを判定し出ない場合は変数 Q2i を出力
		}
		
		// 以下Q3の変数宣言,反復処理,出力
		for ( int Q3i = 10; Q3i >= 1; Q3i -- ) {
		// 上記変数宣言,変数 Q3i が 1 未満になるまでの反復処理
			System.out.println( Q3i );
			// 上記変数 Q3i に代入した値を出力
		}
		
		// 以下Q4の変数宣言,反復処理,出力
		int Q4n = 0;
		for ( int Q4i = 1; Q4i <= 100; Q4i ++ ) {
		// 上記変数宣言,変数 Q4i が 100 以下の反復処理
			Q4n = Q4n + Q4i ;
		}
		System.out.println( Q4n );
		// 上記変数 Q4n に代入した値を出力
		
		//以下Q5の変数宣言,反復処理,出力
		for ( int Q5i = 1; Q5i <= 5; Q5i ++ ) {
		// 上記変数宣言,変数 Q5i が 5 以下になるまでの反復処理
			for ( int Q5j = 1; Q5j <= Q5i; Q5j ++ ) {
			// 上記変数宣言,変数 Q5j が Q5i 以下の反復処理
				System.out.print("*");
				// 上記 * を出力
		    }
			System.out.println();
			// 上記改行を実施
		}
		
		// 以下Q6の変数宣言,反復処理,出力
		int Q6count = 1;
		// int型の変数 Q6count を宣言し 1 を代入
		while (Q6count <= 10) { 
		// 上記変数 Q6count が 10 以下の反復処理
			System.out.println(Q6count);
			// 上記変数 Q6count に代入した値を出力
			Q6count ++; 
			//上記変数 Q6count を 1 ずつ増加
		}
		
		// 以下Q7の変数宣言,反復処理,出力
		int Q7count = 1;
		// int型の変数 Q7count を宣言し 1 を代入
		while (Q7count <= 20) { 
		// 上記変数 Q7count が 20 以下の反復処理
			if (Q7count % 2 == 0)  {System.out.println(Q7count);}
			// 変数 Q7count が2で割ったときに余りが出るかを判定し出ない場合は変数 Q7count を出力
			Q7count ++; 
			//上記変数 Q7count を 1 ずつ増加
		}
		
		// 以下Q8の変数宣言,反復処理,出力
		int Q8count = 10;
		// int型の変数 Q8count を宣言し 10 を代入
		while (Q8count >= 1) { 
		// 上記変数 Q8count が 1 以上の反復処理
			System.out.println(Q8count);
			// 上記変数 Q8count に代入した値を出力
			Q8count --; 
			//上記変数 Q8count を 1 ずつ減少
		}
				
		// 以下Q9の変数宣言,反復処理,出力
		int Q9i = 0; // int型の変数 Q9i を宣言し 0 を代入
		int Q9count = 1; // int型の変数 Q9count を宣言し 1 を代入
		while (Q9count <= 100) {
		// 上記変数 Q9count が 100 以下の反復処理
			Q9i = Q9i + Q9count;
			Q9count ++; 
			//上記変数 Q9count を 1 ずつ増加
		}
		System.out.println(Q9i);
		// 上記変数 Q9i に代入した値を出力
			
		// 以下Q10の変数宣言,反復処理,出力
		int Q10i = 1; // int型の変数 Q9i を宣言し 0 を代入
		while (Q10i != 0) {
		// 上記変数 Q10i が 0 と同じになるまで反復処理
			System.out.println("数値を入力してください");
			// 数値を入力してください と出力
			Q10i = scanner.nextInt() ; 
			// 変数 Q10i にコンソール入力された値をを代入
		}
		System.out.println("終了しました");
		// 上記 終了しました と出力
		scanner.nextLine();
		// 上記scannerの改行破棄（消すとscanner次回以降エラー出る）

	        
		// 以下Q11の変数宣言,反復処理,出力
		for ( int Q11i = 01; Q11i <= 9; Q11i ++ ) {
		// 上記変数宣言,変数 Q11i が 9 以下になるまでの反復処理
			for ( int Q11j = 01; Q11j <= 9; Q11j ++ ) {
			// 上記変数宣言,変数 Q11j が 9 以下の反復処理
				System.out.printf(" %02d * %02d = %02d ",Q11i,Q11j,Q11i * Q11j);
				// 上記書式設定の上結果を出力
				if (Q11j != 9) {System.out.print("||");}
				// 上記変数 Q11j が 9 以外のときに　|| を出力
			}
		System.out.println();
		// 上記改行を実施
		}
			
		// 以下Q12の変数宣言,反復処理,出力
		String Q12input = scanner.nextLine();
		// 上記コンソール入力を一つの文字列としてぢて読み取りString型で宣言した変数 Q12input に代入
		String[] goods = Q12input.split("、");
		// 上記変数 Q12input　に代入された文字列を　、　にて分割しString型で宣言された変数 goods に代入
		int tv = random.nextInt(12);
		// 上記テレビの個数を0~11の乱数にて決定し変数 tv に代入
		int display = 11 - tv;
		// 上記ディスプレイの個数をテレビ個数から差し引き決定し変数 display に代入
		for (String Q12String : goods) {
			switch (Q12String) {
            	case "パソコン":
            	case "冷蔵庫":
            	case "扇風機":
            	case "洗濯機":
            	case "加湿器":
            	// 上記変数 Q12String に パソコン 冷蔵庫 扇風機 洗濯機 加湿器 が入っていた場合
            		int Q12i = random.nextInt(12);
            		// 上記変数 Q12i を宣言し0~11の乱数を決定し代入
            		System.out.println(Q12String + "の残り台数は" + Q12i + "台です。");
            		// 上記変数 Q12String,Q12i を組み合わせた結果出力
            		break;
            	case "テレビ":
                case "ディスプレイ":
                    int Q12v = Q12String.equals("テレビ") ? tv : display;
                    /*
                 	* 上記変数 Q12String に代入されているのがテレビかディスプレイか条件演算子で判別し
                 	* それにあわせ変数 Q12v に変数 tv,display のどちらかを代入
                    */
                    System.out.println(Q12String + "の残り台数は" + Q12v + "台です");
            		break;
                default:
                System.out.println("『 " + Q12String + " 』は指定の商品ではありません");
                /* 
                 * 上記変数 Q12String に代入された文字列がいずれも当てはまらなかった場合
                 * 変数 Q12String を組み合わせて出力
				*/
			}
		}
		
		scanner.close();
		// Scannerを終了
	        
	}

}
