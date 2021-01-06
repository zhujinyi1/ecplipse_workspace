package 字符串;

public class 字符串 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			char a[]= {'祝','津','一'};           //String 为特定的字符串数组，与char a[]等价
			String b="祝津一";
			System.out.println(a);
			System.out.println(b);
			System.out.println();
			System.out.println();
			//String(char a[], int offset ,int length)截取字符串，offset表示截取位置，length表示截取长度
			String s= new String(a,2,1);
			
			System.out.println(a);
			System.out.println(s);
			
			//获取字符串长度
			System.out.println(b.length());
			//查找字符串中字母，有的话返回字母的索引（大于等于零），无返回-1
			if(b.indexOf("津")>-1)
				System.out.println("字符串中有津");
	}

}
