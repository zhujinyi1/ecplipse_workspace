package 字符串中查找特定字符;

public class 查找 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			String a="fdsdsfdsfdsf";
			if(a.indexOf("d")>=0)
			{
				//查找字符串中字母，有的话返回第一个该字符的位置（大于等于零），无返回-1
				System.out.println(a.indexOf("d"));
				System.out.println("有d这个字符");
			}
			if(a.lastIndexOf("d")>=0)
			{
				//查找字符串中字母，有的话返回最后一个该字符的位置（大于等于零），无返回-1
				System.out.println(a.lastIndexOf("d"));
				System.out.println("有d这个字符");
			}
	}

}
