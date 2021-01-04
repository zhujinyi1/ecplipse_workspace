package 位运算;

public class 位运算 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=1024;
		int m=4;
		int b,c,d,e,f;
		b=a&m;  //位如果都是一取1
		c=a|m;  //位有1取1
		d=~a;   //按位取反
		e=a>>2; //右移2位   相当于除2的n次方
		f=a<<2; //左移2位   相当于乘2的n次方
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
