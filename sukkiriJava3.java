package sukkiriJava;

public class sukkiriJava3 {

	public static void main(String[] args) {
		//　練習3-1
		int weight = 60;
		if(weight == 60) {
			System.out.println("OK");
		}
		
		int age1 = 20;
		int age2 = 30;
		if((age1 + age2) *2 > 60) {
			System.out.println("OK");
		}
		
		int age = 1;
		if(!(age % 2 == 0) ){
			System.out.println("OK");
		}
		
		String name ="湊";
		if(name.equals("湊")) {
			System.out.println("OK");
	    }
		
		/*　練習3-2　
		回答ADF
		正解CDE
		*/
		
		//練習3-3
		int isHungry = 1;
		String food = "寿司";
		
		System.out.println("こんにちは");
		
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		
		System.out.println("ごちそうさまでした");
		
		// 練習3-4
		boolean tenki = false;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		}else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
		}
		
		// 練習3-5
		System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
		case 1:
			System.out.println("検索する");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		default :
			System.out.println("1~4を入力してください");
		}
		// 練習3-6
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0; i <= 5; i++) {
			System.out.print("0~9の数字を入力してください>");
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == ans) {
				System.out.println("アタリ!");
				break;
			}else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");		
	}
}