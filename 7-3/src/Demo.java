
public class Demo {       //根据运行参数（String[] args）个数打印i的次数

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		if(args.length == 0) {
			System.out.println("参数为0个，无法打印");
		}
		else {
			for(int i = 0;i <= args.length;i++) {
				System.out.println(i);
			}
		}
	}

}
