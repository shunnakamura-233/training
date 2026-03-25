package curriculum.b;

//以下 Question5 Q5メソッド

public class Animal {
	// 下記各フィールド宣言
		private String name;   // 動物名
		private double length; // 体長
		private int speed;     // 速度

		// 下記各値を設定
		public void setName(String name) {
			this.name = name;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		// 下記各値を取り出し
		public String getName() {
			return name;
		}

		public double getLength() {
			return length;
		}

		public int getSpeed() {
			return speed;
		}
}
