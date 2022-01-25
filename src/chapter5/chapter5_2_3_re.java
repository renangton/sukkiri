package chapter5;

public class chapter5_2_3_re {

	public static void main(String[] args) {
		// 問題5-2		
		String address = "java@xxx.com";
		String title = "javaについて";
		String text = "どの本で勉強すればいいですか？";
		email(title, address, text);
				
		System.out.println("");
		// 問題5-3
		email(address, text);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);		
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);	
	}

}
