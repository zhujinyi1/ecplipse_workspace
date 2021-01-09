package foreach;

public class Foreach {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int arr[] = {1,2,3,4,5,6};
		System.out.println("一维数组中元素为:");
		
		for( int x : arr )           //x是引用变量，用来存放遍历时的值，最终输出
		{                             //arr是数组名
			                         //该语句用来遍历
			System.out.println(x);
		}
	}

}
