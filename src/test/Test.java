package test;

public class Test {

	public static void main(String[] args) {
		int x = Integer.valueOf("001");
		float y = Float.valueOf("0.1F");
		boolean b = Boolean.valueOf("true");
		String v = String.valueOf(true);
		float s = Math.min(1.0F, 2.0F);
		float w = Math.max(1.0F, 2.0F);
		int o = (int) Math.abs(-1.0F);
		float k = (float) Math.ceil(1.00001F);
		//Test test = new Test();
		System.out.println(k);
	}
}
