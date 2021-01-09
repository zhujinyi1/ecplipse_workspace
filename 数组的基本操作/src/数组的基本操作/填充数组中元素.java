package 数组的基本操作;

import java.util.Arrays;

public class 填充数组中元素 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int arr[] = new int[5];
		Arrays.fill(arr,8);
		for(int x: arr) {
			System.out.println(x);
		}
		
		int a[] = new int[] {1,2,3,4,5};
		Arrays.fill(a, 1,2,8);
		/*Arrays.fill(a, 1,2,8);该语句是对数组中某些元素进行赋值
		 * 意义：将数组a的从第1位置（包括）到第2位置（不包括）的值变为8*/
		
		for(int x: a) {
			System.out.println(x);
		}
	}

}
