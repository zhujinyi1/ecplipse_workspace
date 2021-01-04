package 复合语句;

public class 复合语句 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=10;
		{
			int b=5;
			{
				boolean c;
				c=a<b?true:false;
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);//复合语句可以嵌套，复合语句中定义的变量只能在其中显示
			}
		}
	}

}
