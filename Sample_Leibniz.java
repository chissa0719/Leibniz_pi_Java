import java.util.*;
import java.lang.*;

public class Sample_Leibniz {
	public static void main(String args[]){
		
		//呪文
		System.out.println("ライプニッツの公式を用いて円周率を計算します");
		System.out.print("繰り返す回数を入力してください >> ");
		
		//入力(long型じゃないと100億がExceptionになった)
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		
		//インスタンス生成
		Leibniz tmp = new Leibniz();
		
		// 処理前の時刻を取得
	        long startTime = System.currentTimeMillis();
		
		//計算丸投げ
		System.out.println(tmp.calc(input));
		
		// 処理後の時刻を取得
	        long endTime = System.currentTimeMillis();
		
		//処理後-処理前で、時間を算出
		System.out.println("計算時間：" + (endTime - startTime) + " ms");
		
	}
}
