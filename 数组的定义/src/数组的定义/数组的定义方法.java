package 数组的定义;

public class 数组的定义方法 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = new String("sdsada");  
		String[] b = new String[]{"bnbvdd","sbhj","ajkjj","hsdas"};      //数组初始化，以及字符串数组定义
		System.out.println(a);
		
		/*
		 * 遍历方法一
		 * for(int i=0;i<4;i++) {
			System.out.println(b[i]);
		}
		*/
		//方法二：
		for(String x : b) {
			System.out.println(x);
		}
		
		
	}

}
