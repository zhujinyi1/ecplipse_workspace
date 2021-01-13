package 类的构造方法;

public class Demo {                           //Demo类

	int i;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo a = new Demo();
		System.out.println();
		Demo b = new Demo(1);

	}
	
	public Demo() {                           	//构造方法，与类同名（特殊的成员方法）
												//用于实例化对象
		this(1);
		System.out.println("无参数构造方法");
	}
	
	public Demo(int i) {
		this.i=i;
		if(i==1) {
			System.out.println("i=1");
		}
		else
			System.out.println("i!=1");
	}
	

}
