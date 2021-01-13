package 替换数组中元素;

import java.util.Arrays;

public class 替换数组中元素 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String arr[] = new String[] {"1","2","3","4"};
		
		//方法1：直接替换
		//arr[2] = "bb";
		
		//方法2：Arrays.fill
		Arrays.fill(arr, 2,3,"bb");
		for(String x:arr) {
			System.out.println(x);
		}
	}

}
