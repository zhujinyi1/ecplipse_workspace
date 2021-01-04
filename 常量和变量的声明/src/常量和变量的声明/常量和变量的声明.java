package 常量和变量的声明;

public class 常量和变量的声明 {
	
	static final double PI =3.14;   //赋值后不会被改变的量，用final定义
	static int age = 23;            //static表示全局变量，可以在其他子涵数中使用或者引用
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final int number;   
		number = 12345;
		age = 22;            //赋值语句
		//number =12346;
		System.out.println("PI的值为："+PI);
		System.out.println("赋值后number的值为："+number);
		System.out.println("int型变量age的值为："+age);
	}

}
