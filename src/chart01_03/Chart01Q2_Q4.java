package chart01_03;

/**
 * 質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0; //変数aの値は１０以上であれば変数aの値は11です、それ以外であれば変数aの値が０です。
 * 質問３︓変数値を⽐較する演算⼦は = or == ?   //==
 * 質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。//[true] [false]
 * @author liton
 *
 */
public class Chart01Q2_Q4 {
	public static void main(String[] args) {
		int a = 8;
		//変数aの値は１０以上であれば変数aの値は11です、それ以外であれば変数aの値が０です。
		a = a > 10 ? 11 : 0;

		//if-else文
		int b;
		if (a > 10) {
			b = 11;
		} else {
			b = 0;
		}
		System.out.println(b);

	}

}
