package ch08;

/**
 * 質問２︓以下コードの出⼒を回答してください。
// Employee.java
public class Employee {
 private String id;
 public Employee(String id) {
 this.id = id;
 }
 @Override
 public boolean equals(Object another) {
 if (another instanceof Employee) {
 Employee an = (Employee) another;
 return an.id.equals(id);
 }
 return false;
 }
}
// Kicker.java
public class Kicker {
 public static void main(String...args) {
 Employee x = new Employee("1234");
 Employee y = new Employee("1234");
 System.out.println(x == y); // true ? false? 原因は ?
 System.out.println(x.equals(y)); // true ? false? 原因は ?
 }
}

 * @author liton
 *
 */
public class Q2 {

}
