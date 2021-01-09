package 常规类型的格式化;

public class 常规类型的格式化 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str =String.format("%d",400/2);        //结果化为整形
		String str2 =String.format("%b",3>5);         //结果化为布尔型
		String str3 =String.format("%x",2000);        //结果化为十六进制数
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
	}

}
