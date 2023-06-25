package ch10;

/**
 * 質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」
の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦
を取得してください。
1 public static String getFileType(String path) {
2 // return ??
3}
4public static void main(String...args) {
5 System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
6 System.out.println(getFileType("c://windows//a a.test")); // test
7 System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
8 System.out.println(getFileType("c://windows//aaaaa")); // Empty
9}
 * @author liton
 *
 */
public class Q2 {

}
