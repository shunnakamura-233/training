package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		// scanner を作成
		
		// 下記Q1の変数宣言,処理,出力
		int[] Q1s = {1,2,3,4,5}; //配列 Q1s を作成し5つの要素を代入
		for ( int Q1i = 0; Q1i < Q1s.length ; Q1i ++ ) {  
		// 上記変数 Q1i を作成し変数 Q1i が配列 Q1s の 要素数未満の間反復処理
			System.out.println(Q1s[Q1i]);
			// 上記配列 Q1s の Q1i 番目を出力
		}
		
		// 下記Q2の変数宣言,処理,出力
		int[] Q2s = {10,20,30,40,50}; //配列 Q2s を作成し5つの要素を代入
		for (int Q2i = Q2s.length - 1; Q2i >= 0 ; Q2i--) {
			// 上記変数 Q2i を作成し配列 Q2s の要素数を代入し変数 Q2i が 0 以上の間反復処理
			System.out.println(Q2s[Q2i]);
			// 上記配列 Q2s の Q2i 番目を出力
		}
		
		// 下記Q3の変数宣言,処理,出力
		int Q3j = 0; // 変数 Q3j を宣言し 0 を代入
		int[] Q3s = {3,5,7,9,11}; //配列 Q3s を作成し5つの要素を代入
		for ( int Q3i = 0; Q3i < Q3s.length ; Q3i ++ ) {  
		// 上記変数 Q3i を作成し変数 Q3i が配列 Q3s の 要素数未満の間反復処理
			Q3j = Q3j + Q3s[Q3i];
			// 上記変数 Q3j と配列 Q3s の Q3i 番目を加算し変数 Q3j に代入
		}
		System.out.println(Q3j);
		// 上記変数 Q3j に代入した値を出力
		
		// 下記Q4の変数宣言,処理,出力
		int[] Q4s = {12,7,9,21,5,18}; //配列 Q4s を作成し6つの要素を代入
		int Q4min = Q4s[0];
		int Q4max = Q4s[0];
		for ( int Q4i = 0; Q4i < Q4s.length ; Q4i ++ ) {  
		// 上記変数 Q4i を作成し変数 Q4i が配列 Q4s の 要素数未満の間反復処理
			Q4min = Q4min > Q4s[Q4i] ? Q4s[Q4i] : Q4min;
			/* 上記変数 Q4min が配列 Q4s の Q4i 番目と比べ大きかったら
			 * 配列 Q4s の Q4i 番目を代入、小さかったら自身を代入し変更を加えない。
			 */
			Q4max = Q4max < Q4s[Q4i] ? Q4s[Q4i] : Q4max;
			/* 上記変数 Q4max が配列 Q4s の Q4i 番目と比べ小さかったら
			 * 配列 Q4s の Q4i 番目を代入、大きかったら自身を代入し変更を加えない。
			 */
		}
		System.out.println("最小値は" + Q4min);
		// 上記変数 Q4min に代入した値を 最大値は と組み合わせ出力
		System.out.println("最大値は" + Q4max);
		// 上記変数 Q4max に代入した値を 最小値は と組み合わせ出力
		
		// 下記Q5の変数宣言,処理,出力
		int[] Q5s = {1,2,3,4,5}; //配列 Q5s を作成し5つの要素を代入
		for ( int Q5i = 0; Q5i < Q5s.length ; Q5i ++ ) { 
		// 上記変数 Q5i を作成し変数 Q5i が配列 Q5s の 要素数未満の間反復処理
			System.out.println(Q5s[Q5i] * 2);
			// 上記配列 Q5s の Q5i 番目を2倍にして出力
		}
		
		// 下記Q6の変数宣言,処理,出力
		boolean Q6b = false;
		int[] Q6s = {4,7,10,15,20}; //配列 Q6s を作成し5つの要素を代入
		System.out.println("数値を入力してください");
		// 数値を入力してください と出力
		int Q6IN = scanner.nextInt() ; 
		// 変数 value にコンソール入力された値をを代入
		for ( int Q6i = 0; Q6i < Q6s.length ; Q6i ++ ) { 
		// 上記変数 Q6i を作成し変数 Q6i が配列 Q6s の 要素数未満の間反復処理
			if (Q6IN == Q6s[Q6i]) {
			// 変数 Q6IN と配列 Q6s の Q6i 番目と一致するかの判定
				Q6b = true; // 変数 Q6b にtrueを代入
				break; // 反復処理の終了
				/*コンソール入力された数値と配列の数値が一致しているか判定し
				 * 一致していた場合Q6bの状態変更を行ってbreakで反復処理を終了
				 */
			}
		}
		System.out.println(Q6IN + "は含まれて" + (Q6b ? "います" : "いません"));
		// 上記変数 Q6IN と配列 Q6s と一致していたかを文章にして出力
		
		// 下記Q7の変数宣言,処理,出力
		int[][] Q7array = {{1, 2}, {3, 4}, {5, 6}};
		//上記二次元配列 Q7array を作成し6つの要素を代入
		for ( int Q7i = 0; Q7i < Q7array.length ; Q7i ++ ) {  
		// 上記変数 Q7i を作成し変数 Q7i が配列 Q7array の 一次元要素数未満の間反復処理
			for ( int Q7j = 0; Q7j < Q7array[Q7i].length ; Q7j ++ ) {  
				// 上記変数 Q7j を作成し変数 Q7j が配列 Q7array の 二次元要素数未満の間反復処理
				System.out.println(Q7array[Q7i][Q7j]);
				// 上記二次元配列 Q7array の Q7i , Q7j 番目を出力
			}
		}
		
		// 下記Q8の変数宣言,処理,出力
		int Q8k = 0; // 変数 Q8k を宣言し 0 を代入
		int[][] Q8array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		//上記二次元配列 Q8array を作成し9つの要素を代入
		for ( int Q8i = 0; Q8i < Q8array.length ; Q8i ++ ) {  
		// 上記変数 Q8i を作成し変数 Q8i が配列 Q8array の 一次元要素数未満の間反復処理
			for ( int Q8j = 0; Q8j < Q8array[Q8i].length ; Q8j ++ ) {  
				// 上記変数 Q8j を作成し変数 Q8j が配列 Q8array の 二次元要素数未満の間反復処理
				Q8k = Q8k + Q8array[Q8i][Q8j];
				// 上記変数 Q8k と二次元配列 Q8array の Q8i ,Q8j 番目を加算し変数 Q8k に代入
			}
		}
		System.out.println(Q8k);
		// 上記変数 Q8k に代入した値を出力
		
		// 下記Q9の変数宣言,処理,出力
		int[][] Q9array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		//上記二次元配列 Q9array を作成し9つの要素を代入
		int Q9min = Q9array[0][0];
		int Q9max = Q9array[0][0];
		for ( int Q9i = 0; Q9i < Q9array.length ; Q9i ++ ) {  
		// 上記変数 Q9i を作成し変数 Q9i が配列 Q9array の 一次元要素数未満の間反復処理
			for ( int Q9j = 0; Q9j < Q9array[Q9i].length ; Q9j ++ ) {  
				// 上記変数 Q9j を作成し変数 Q9j が配列 Q9array の 二次元要素数未満の間反復処理
				Q9min = Q9min > Q9array[Q9i][Q9j] ? Q9array[Q9i][Q9j] : Q9min;
				/* 上記変数 Q9min が二次元配列 Q9array の Q9i , Q9j 番目と比べ大きかったら
				 * 二次元配列 Q9array の Q9i , Q9j 番目を代入、小さかったら自身を代入し変更を加えない。
				 */
				Q9max = Q9max < Q9array[Q9i][Q9j] ? Q9array[Q9i][Q9j] : Q9max;
				/* 上記変数 Q9max が二次元配列 Q9array の Q9i , Q9j 番目と比べ小さかったら
				 * 二次元配列 Q9array の Q9i , Q9j 番目を代入、大きかったら自身を代入し変更を加えない。
				 */
			}
 		}
		System.out.println("最小値は" + Q9min);
		// 上記変数 Q9min に代入した値を 最大値は と組み合わせ出力
		System.out.println("最大値は" + Q9max);
		// 上記変数 Q9max に代入した値を 最小値は と組み合わせ出力
		
		// 下記Q10の変数宣言,処理,出力
		int[][][] Q10array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		//上記三次元配列 Q10array を作成し8つの要素を代入
		for ( int Q10i = 0; Q10i < Q10array.length ; Q10i ++ ) {  
		// 上記変数 Q10i を作成し変数 Q10i が配列 Q10array の 一次元要素数未満の間反復処理
			for ( int Q10j = 0; Q10j < Q10array[Q10i].length ; Q10j ++ ) {  
				// 上記変数 Q10j を作成し変数 Q10i が配列 Q10array の 二次元要素数未満の間反復処理
				for ( int Q10k = 0; Q10k < Q10array[Q10i][Q10j].length ; Q10k ++ ) {  
					// 上記変数 Q10k を作成し変数 Q10k が配列 Q10array の 三次元要素数未満の間反復処理
					System.out.println(Q10array[Q10i][Q10j][Q10k]);
					// 上記三次元配列 Q10array の Q10i , Q10j ,Q10k 番目を出力
				}
			}
		}
		
		scanner.close();
		// Scannerを終了
		
	}

}
