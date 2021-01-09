package 用字典比较字符串;

public class 用字典比较字符串 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = new String("abcd");
		String b = new String("abce");
		String c = new String("abca");
		
		System.out.println(a.compareTo(b));   // a.compareTo(b)  输出的是字符串a与b按字典顺序的差值
		System.out.println(a.compareTo(c));
	}

}
