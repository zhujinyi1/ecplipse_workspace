package 字符串截取;

public class 字符串截取 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char a[]={'a','s','d','f'};
		String b="dgfjhytyhgnkuiu";
		//String(char a[], int offset ,int length)截取字符串，offset表示截取位置，length表示截取长度
		String s= new String(a,2,2);
		// String s= new String(b,2,2);--------此语法为错误语法
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
	}

}
