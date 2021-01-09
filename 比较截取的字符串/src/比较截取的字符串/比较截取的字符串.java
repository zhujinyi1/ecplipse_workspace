package 比较截取的字符串;

public class 比较截取的字符串 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = "sfdsfsd";
		String b = "sfddfsd";
		
		String c = a.substring(5);
		String d = b.substring(5);
		
		String e = a.substring(2);
		String f = b.substring(2);
		
		boolean y = c.equals(d);
		if(y==true)
		{
			System.out.println("截取的两个子串相同");
		}
		else 
		{
			System.out.println("截取的两个子串不同");
		}
		System.out.println(c);
		System.out.println(d);
		boolean x = e.equals(f);
		if(x==true)
		{
			System.out.println("截取的两个子串相同");
		}
		else
		{
			System.out.println("截取的两个子串不同");
		}
		System.out.println(e);
		System.out.println(f);
	}

}
