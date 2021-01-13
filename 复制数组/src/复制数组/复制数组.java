package 复制数组;

import java.util.Arrays;

public class 复制数组 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int arr1[] = new int[] {1,2,3,4,5,6};
		int arr2[] = Arrays.copyOf(arr1, 3);
		for(int x: arr1)
			System.out.print(x+" ");
		System.out.println();
		for(int y:arr2)
			System.out.print(y+" ");
	}

}
