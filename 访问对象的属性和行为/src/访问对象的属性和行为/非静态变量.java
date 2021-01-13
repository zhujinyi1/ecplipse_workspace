package 访问对象的属性和行为;

public class 非静态变量 {
	
	int i = 47;
	
	public void call() {                    //成员方法
		System.out.println("调用call方法");
		for(i = 0;i<3;i++) {
			System.out.println(i+" ");
			if(i==2) {
				System.out.println();
			}
		}
	}
	
	public 非静态变量() {                        //构造方法
		
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		非静态变量 a = new 非静态变量();               //创建一个对象
		非静态变量 b = new 非静态变量();               //
		
		a.i = 60;
		System.out.println("对象a的i的值："+a.i);
		a.call();                             //用a对象访问call方法
		System.out.println("对象b的i的值："+b.i);
		b.call();                             //用b对象访问call方法
		
	}

}
