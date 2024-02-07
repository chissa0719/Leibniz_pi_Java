# Leibniz_pi_Java
phpとRustでライプニッツを計算していた人がいたので、Javaで書いてみた。<br>
<br>
やってた人 >> https://github.com/aida0710/leibniz-pi-rust<br>
<br>
## 実行時間

|       | 1億     | 100億     |
|-------|---------|-----------|
| Java  | 1.162s  | 113.414s  |

<br>
上記は，1億と100億でライプニッツを計算した際の実行時間を表にまとめたものである．<br>
ここでの実行時間には，クラスの計算メソッド呼び出し時間も含まれている．<br>
<br>
実行結果より，計算オーダーはおおよそ正しいといえる．<br>
また，先人の結果と比較すると，phpとRustの見事に中間あたりであることがわかる．<br>
インタプリタや最適化など，Rustの環境について調査を行う必要がありそう?<br>
<br>

## 計算結果

<br>また，以下は1億と100億での算出値(計算結果)である．<br>
<br>

![実行結果](result_1.png "実行結果")



![実行結果](result_100.png "実行結果")

<br>
計算結果を見ると，1億の際には<br>
<b>有効数字9桁以降間違い  : 3.1415926~43589326~</b><br>
100億の際には<br>
<b>有効数字11桁以降間違い : 3.141592653~488346~</b><br>
となっている．<br>
これは，phpやRustの際と変化がない．<br>
情報落ち等で途中から小数点以下が削り取られていっている可能性も考えられる．<br>

## 参考

・ライプニッツの公式で円周率πを計算<br>
https://talavax.com/math-leibnizformula.html#gsc.tab=0<br>
<br>
・【Javaプログラミング】nextInt()メソッドの簡単な使用例<br>
https://miki-prosho.com/?p=1154<br>
<br>
