package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		byte byteNum; // byte 型の変数 byteNum を宣言
		byteNum = 10; // 変数 byteNum に 10 を代入
		short shortNum; // short 型の変数 sortNum を宣言
		shortNum = 100; // 変数 shortNum に 100 を代入
		int intNum; // int 型の変数 intNum を宣言
		intNum = 1000; // 変数 intNum に 1000 を代入
		long longNum; // long 型の変数 longNum を宣言
		longNum = 10000; // 変数 longNum に 10000 を代入
		float floatNum; // float 型の変数 floatNum を宣言
		floatNum = 9.5f; // 変数 floatNum に 9.5 を代入
		double doubleNum; // double 型の変数 doubleNum を宣言
		doubleNum = 10.5; // 変数 doubleNum に 10.5 を代入
		char letter; // char 型の変数 letter を宣言
		letter = 'a'; // 変数 letter に a を代入
		String letters; // String 型の変数 Stringletters を宣言
		letters = "ハロー"; // 変数 letters に ハロー を代入
		boolean isBoolean; // boolean 型の変数 に isBoolean を宣言
		isBoolean = true; // 変数 isBoolean に true を代入
		System.out.println(byteNum + shortNum + intNum); //11110を出力
		System.out.println(byteNum + byteNum); //20を出力
		System.out.println(letter + " " + letters + " " + isBoolean); // a ハロー true を出力
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum); //11130 を出力
		System.out.println(byteNum * shortNum * intNum * longNum); //10000000000 を出力
		System.out.println(doubleNum / shortNum); //0.105 を出力
		System.out.println(byteNum - shortNum); //-90 を出力
		String name = "山田太郎"; //name という String型の変数 を宣言し 山田太郎 を代入
		System.out.println("こんいちは" + name + "さん!"); // こんにちは、山田太郎さん！ と出力
		int age = 25; //age という int型 を宣言し 変数２５ を代入
		System.out.println("年齢" + age + "歳です"); //年齢: 25歳 を出力
		int num1 = 10; //num1 という int型変数 を宣言し、10 を代入
		int num2 = 5; ////num2 という int型変数 を宣言し、5 を代入
		int sum = num1 + num2; //num1  num2 を足した結果を sum という変数に代入
		System.out.println(sum); //15 を出力
		int score = 80; //score という int型の変数 を宣言し、80 を代入
		score = score + 20; //score 䛻 20 を加え 更新
		System.out.println("最終スコア" + score); //最終スコア: 100 を出力
		double price = 99.99; //price という double型の変数 を宣言し、99.99 を代入
		int intPrice = (int) price; //price を int型 に変換
		System.out.println("整数価格：" + intPrice); //整数価格: 99 と出力
		String numStr = "123"; // String 型の変数 numStr  "123" を代入
		int num = Integer.parseInt(numStr); // numStr を int 型に 変換して 変数num に代入
		System.out.println("変換後の値:" + (num + 10)); // 変換後の値: の後ろにnum + 10 した結果　をコンソール　に表示
		num = 50; //int型 の変数 numに  50 を代入
		String strNum = String.valueOf(num); //num を String 型に 変換
		System.out.println("得点:" + strNum + "点"); //得点: 50点 と出力
		int a = 10; //int 型の変数 a に 10 を代入
		int b = 20; //int 型の変数 b に 20 を代入
		boolean result = a < b; //a が b より小さいかを boolean 変数 result に代入
		System.out.println(result); //result の値を 出力
		int x = 15; //int 型の変数 x に 15 を代入
		String message = (x >= 10) ? "OK" : "NG"; //x が 10 以上なら "OK"、そうでなければ "NG" を表示
		System.out.println(message); //判定の message を出力
		String text = "私はJavaがすきです。Javaは楽しい！"; //元の文を text に 代入
		text.replace("Java", "Python"); //「Java」 を 「Python」 に置き換え
		System.out.println(text); //置き換え後の 文を 出力
		
		
		
		
		
		

	}

}