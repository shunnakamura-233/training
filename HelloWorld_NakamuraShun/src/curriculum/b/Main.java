package curriculum.b;

//以下 Question5 Q5メソッド

public class Main {

	public static void main(String[] args) {
		// 下記Animalクラスのオブジェクトを作成
		Animal animal = new Animal();

		// 下記各値を設定
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);

		// 下記各値を取り出して表示
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}
}
