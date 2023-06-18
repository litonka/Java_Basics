package ch06;

/**
 * 質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま
す。以下メソッドを呼び出してください。
	public static void printArray(Object[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}


	String prefix = "";
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	for(Object obj : objs){
		sb.append(prefix);
		sb.append(String.valueOf(obj));
		prefix = ",";
	}
	sb.append("]");
	System.out.println(sb.toString());
	
	}
 * @author liton
 *
 */
public class Chart06Q6_00 {

}
