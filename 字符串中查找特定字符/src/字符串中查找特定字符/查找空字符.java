package 字符串中查找特定字符;

public class 查找空字符 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a="ddsfdsfdsf";
		System.out.println(a.indexOf(""));
		System.out.println(a.lastIndexOf(""));  //最后一个空字符的位置
		System.out.println(a.length());          //字符串长度
	}

}
//可以得出，最后一个空字符的位置和字符串长度相等，因此，字符串结尾为空