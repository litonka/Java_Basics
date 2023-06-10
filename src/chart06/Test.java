package chart06;

public class Test {

//	public static void main(String[] args) {
//
//		int x = 200;
//		int y = 34325;
//		int res = sum(x, y);
//		System.out.println(res);
//	}
//
//	public static int sum(int x, int y) {
//
//		int res = 0;
//
//		res = x + y;
//
//		return res;
//	}
	
//	
	public static void main(String[] args) {
        Object[] array = {1, 2, 3, 4, 5};
        printArray(array);
    }

    public static void printArray(Object[] objs) {
        if (objs == null) {
            System.out.println("null");
            return;
        }

        String prefix = "";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objs) {
            sb.append(prefix);
            sb.append(String.valueOf(obj));
            prefix = ",";
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
	
	

}
