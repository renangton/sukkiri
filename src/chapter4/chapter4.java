package chapter4;

public class chapter4 {

	public static void main(String[] args) {
		// 練習4-1
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
		// 練習4-2
		int[] moneyList = new int[]{121902, 8302, 55100};
		
		//for文で画面に表示
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		// 拡張for文で画面に表示
		for(int value : moneyList) {
			System.out.println(value);
		}
		
		//　練習4-3
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
		try {
			System.out.println(counts[1]);
		}catch(NullPointerException e) {
			System.out.println("ヌルポ" + e + "ガッ");
		}
		try {
			System.out.println(heights[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("[インデックス範囲外指定]" + e + "が発生しました");
		}
		
		//　練習4-4
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int number : numbers) {
			if(number == input) {
				System.out.println("アタリ");
			}
		}
	}

}
