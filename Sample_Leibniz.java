import java.util.*;
import java.lang.*;

public class Sample_Leibniz {
	public static void main(String args[]){
		
		//呪文
		System.out.println("ライプニッツの公式を用いて円周率を計算します");
		System.out.print("繰り返す回数を入力してください >> ");
		
		//int入力
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		//インスタンス生成
		Leibniz tmp = new Leibniz();
		
		//計算丸投げ
		System.out.println(tmp.calc(input));
		
	}
}
