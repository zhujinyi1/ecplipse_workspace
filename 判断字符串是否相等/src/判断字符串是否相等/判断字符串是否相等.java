package 判断字符串是否相等;

public class 判断字符串是否相等 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			String a="CCC";
			String b="ccc";
			String c="ccc";
			boolean d = a.equals(b);  //判断字符串是否相等，是输出yes，否输出no
			boolean e = b.equals(c);  
			boolean f = a.equalsIgnoreCase(b);
			
			/*
			         equals（） 与 equalsIgnoreCase（）
			         
			         区别在于前者区分大小写而后者不区分大小写
			         
			 */
			
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
	}

}
