package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 以下Q1の各種変数宣言と初期値設定
		byte byteNum = 0; // byte型の変数 byteNum を宣言し 1 を代入
		short shortNum = 0; // short型の変数 shortNum を宣言し 1 を代入
		int intNum = 0; // int型の変数 intNum を宣言し 1 を代入
		long longNum = 0L; // long型の変数 longNum を宣言し 1 を代入
		float floatNum = 0.0f; // float型の変数 floatNum を宣言し 1 を代入
		double doubleNum = 0.0; // double型の変数 doubleNum を宣言し 1 を代入
		char letter = '\u0000'; // char型の変数 letter を宣言し 1 を代入
		String letters = null; // String型の変数 letters を宣言し 1 を代入
		boolean isBoolean = false;// boolen型の変数 isBoolean を宣言し false を代入
		
		// 以下Q2のQ1で宣言された各変数に対し指定された値を代入
		byteNum = 10; // 変数 byteNum に 10 を代入
		shortNum = 100; // 変数 shortNum に 100 を代入
		intNum = 1000; // 変数 intNum に 1000 を代入
		longNum = 10000; // 変数 longNum に 10000 を代入
		floatNum = 9.5f; // 変数 floatNum に 9.5 を代入
		doubleNum = 10.5; // 変数 doubleNum に 10.5 を代入
		letter = 'a'; // 変数 letter に a を代入
		letters = "ハロー"; // 変数 letters に ハロー を代入
		isBoolean = true; // 変数 isBoolean に true を代入
		
		// 以下Q3のQ2の値を代入した変数を用いての出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		// 上記変数 byteNum , shortNum , intNum , longNum 足して出力
		System.out.println(byteNum * 2);
		// 上記変数 byteNum にかける2をして出力
		System.out.println(letter +  " " + letters + " " + isBoolean);
		// 上記変数 letter , letters , isBoolean とそれぞれの間に半角スペースを挟んで出力
		System.out.println(byteNum * 3 + shortNum + intNum + longNum);
		// 上記変数 byteNum にかける3をしてから変数 shortNum , intNum , longNum を足し出力
		System.out.println(byteNum * shortNum * intNum * longNum);
		// 上記変数 byteNum , shortNum , intNum , longNum を全てかけて出力
		System.out.println(doubleNum / shortNum);
		// 上記変数 doubleNum を変数 shortNum で割り出力
		System.out.println(byteNum - shortNum);
		// 上記変数 byteNum から変数 shortNum を引いて出力
		
		// 以下Q4の変数宣言,代入,出力
		String name; // String型の変数 name を宣言
		name = "山田太郎";// 変数 name に 山田太郎 を代入
		System.out.println("こんにちは、" + name + "さん！");
		// 上記"こんにちは、「変数 name に代入した文字」さん！"と構成し出力
		
		// 以下Q5の変数宣言,代入,出力
		int age; // int型の変数 age を宣言
		age = 25;// 変数 age に 25 を代入
		System.out.println(age + "歳");
		// 上記"「変数 age に代入した値」歳"と構成し出力
		
		// 以下Q6の変数宣言,代入,出力
		int num1 = 10; // int型の変数 num1 を宣言し 10 を代入
		int num2 = 5; // int型の変数 num2 を宣言し 5 を代入
		int sum = 0; // int型の変数 sum を宣言し 0 を代入
		sum = num1 + num2; // 変数 num1 , num2 を足し sum に代入
		System.out.println(sum); // 変数 sum を出力
		
		// 以下Q7の変数宣言,更新,出力
		int score = 80; // int型の変数 score を宣言し 80 を代入
		score = score + 20; // 変数 score に20を足し score に代入
		System.out.println("最終スコア: " + score);
		// 上記"最終スコア:「変数 score に代入した値」"と構成し出力
		
		// 以下Q8の変数宣言,変更,出力
		double price = 99.99 ; // double型の変数 price を宣言し 99.99 を代入
		int intprice = (int) price; // int型の変数 intprice を宣言し変数 price をint型変換し代入
		System.out.println("整数価格: " + intprice);
		// 上記"整数価格:「変数 intprice に代入した値」"と構成し出力
		
		// 以下Q9の変数宣言,変更,出力
		String numStr = "123"; // String型の変数 numStr を宣言し 123 を代入
		int numint = Integer.parseInt(numStr); // int型の変数 numint を宣言し変数 numStr をint型に変換し代入
		System.out.println(numint + 10);
		// 上記変数 numint 足す10を構成し出力
		
		// 以下Q10の変数宣言,変更,出力
		int num = 50; // int型の変数 num を宣言し 50 を代入
		String numletter = String.valueOf(num); // String型の変数 numletter を宣言し変数 num をString型に変換し代入
		System.out.println("得点: " + numletter + "点");
		// 上記"得点:「変数 numletter に代入した値」点"と構成し出力
		
		// 以下Q11の変数宣言,条件演算,出力
		int a = 10; // int型の変数 a を宣言し 10 を代入
		int b = 20; // int型の変数 b を宣言し 20 を代入
		boolean result = (a < b) ? true : false;
		// 上記変数 a が変数 b より小さいかどうかを条件演算子で判定し、結果をboolean型の変数 result に代入
		System.out.println(result);
		// 上記変数 result に代入した値を出力
		
		// 以下Q12の変数宣言,条件演算,出力
		int x = 15; // int型の変数 x を宣言し 15 を代入
		String msg = (x >= 10) ? "OK" : "NG";
		// 上記変数 x が10以上か条件演算子で判定し、結果をString型の変数 msg に代入
		System.out.println(msg);
		// 上記変数 msg に代入した値を出力
		
		// 以下Q13の変数宣言,置き換え,出力
		String text = "私はJavaが好きです。Javaは楽しい!"; // String型の変数 text を宣言し文章を代入
		String replaced = text.replace("Java", "Python");
		// 上記String型の変数 replaced を宣言し変数 text 内の "Java" "Python"に置換えて代入
		System.out.println(replaced);
		// 上記変数 replaced に代入した値を出力
	}

}
