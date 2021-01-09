package 判断字符串开始与结尾;

public class 判断字符串开始与结尾 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a="ndndsfdsnvkdsk";
		
		boolean m=a.startsWith("n");
		boolean n= a.startsWith("m");    //定义布尔型变量接收是否以次字符开头
		boolean p=a.endsWith("k");
		boolean q=a.endsWith("d");       //定义布尔型变量接收是否以此字符结尾
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
		System.out.println(q);
	}

}
