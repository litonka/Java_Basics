package test;

public class Record {

	public static void main(String[] args) {
		int record = 123;
		int recordPerPage = 50;
		double page = record / recordPerPage;
		float totalpage = (int) Math.floor(page);
		System.out.println(page);
	}

}
