package chapter07_09Test;

public class BoyFriend {

	public static void main(String[] args) {
		Man man1 = new Man(27, "teacher", 5000000, 180);
		Man man2 = new Man(26, "actor", 10000000, 180);
		

		System.out.println(man1.getHeight());
		System.out.println(man2.getAge());
		man2.setJob("director");
		System.out.println(man2.getJob());
	}

}
