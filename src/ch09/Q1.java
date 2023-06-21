package ch09;

/**
 * 質問１︓以下ソースにラムダ式の使う場所を解釈してください。
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Q1 {
	public static void main(String[] args) {
		JFrame window = new JFrame("DCNet Java 教育");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800, 600);
		JButton btn = new JButton("hello world");
		window.getContentPane().add(btn);

		btn.addActionListener((ActionEvent e) -> {
			System.out.println("ボタンクリックしました。");
		});
		window.setVisible(true);
	}
}
 */
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author liton
 *
 */
public class Q1 {
	public static void main(String[] args) {
		JFrame window = new JFrame("DCNet Java 教育");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800, 600);
		JButton btn = new JButton("hello world");
		window.getContentPane().add(btn);

		btn.addActionListener((ActionEvent e) -> {
			System.out.println("ボタンクリックしました。");
		});
	}
}
