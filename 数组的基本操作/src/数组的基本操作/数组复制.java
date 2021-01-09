package 数组的基本操作;

import java.util.Arrays;

public class 数组复制 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//方法一：从头复制
		int a[] = new int[] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("数组a：");
		for(int n: a) {
		System.out.print(n+" ");
		}
		System.out.println();
		
		int b[] = Arrays.copyOf(a,10);    //将a复制到b中，使新生成的数组长度为10，多出来的用0补全
		int c[] = Arrays.copyOf(a, 5);
		System.out.println("数组b：");
		for(int x:b)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("数组c：");
		for(int y:c) {
			System.out.print(y+" ");
		}
		System.out.println();
		//方法二：选择复制
		int d[] = Arrays.copyOfRange(a, 2,7);//从2位置复制到7位置，（包括2位置，不包括7位置）
		
		System.out.println("数组d：");
		for(int m : d) {
			System.out.print(m+" ");
		}
	}

}
