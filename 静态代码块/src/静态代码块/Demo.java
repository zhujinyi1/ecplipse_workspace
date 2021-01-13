package 静态代码块;

public class Demo {
	
	  //代码运行时。同一个类的代码运行顺序为：静态代码块，非静态代码块，构造方法，成员方法
	//静态代码快一般用于对类进行初始化
	//构造方法在创建对象时就自动运行
	
	
	public static void main(String[] args) {
		
		Demo a = new Demo();
		
		a.a();
		
		
	}
	
	public Demo() {
		System.out.println("构造方法");
	}
	
	public void a() {
		System.out.println("成员方法");
	}
	
	static {
		System.out.println("静态代码块");
	}
	
	{
		System.out.println("非静态代码块");
	}
	
	
	
	
}
