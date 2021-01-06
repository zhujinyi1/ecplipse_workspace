package 非字符串连接;

public class 非字符串连接 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a="我今天学习";
		int b=2;
		String c="小时,";
		String d="玩了";
		float e=4;
		String f="小时";
		String g="总共";
		
		//字符串连接时，会自动将非字符类型转化为字符类型，
		//因此要谨慎的将其他数据与字符串进行连接
		System.out.println(a+b+c+d+e+f+b+e+f);       
		System.out.println(a+b+c+d+e+f+g+(b+e)+f);
	}

}
