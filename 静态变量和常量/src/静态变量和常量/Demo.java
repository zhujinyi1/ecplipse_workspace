package 静态变量和常量;

public class Demo {
		
	static int x = 5 ;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo a = new Demo();
		a.b();
	}
	
	private void b() {                                   //静态变量标志为static
		System.out.println("x的值为"+Demo.x);             //调用Demo类的静态变量x
														//静态变量可以被全局共享，其他类中只需要使用  类名.变量名  就可以调用
	}

}
