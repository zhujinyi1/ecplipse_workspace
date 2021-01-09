package 数组的基本操作;

import java.util.Arrays;

public class 数组查询 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//数组查找是通过二分查找，若未先对其进行排序，则无法得到正确结果
		int a[] = new int[] {12,43,76,54,56,98,23};
		Arrays.sort(a);                             //排序
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		
		int m = Arrays.binarySearch(a, 43);         // 有这个数则返回这个数的索引，
		System.out.println(m);
		
		int index = Arrays.binarySearch(a, 47);    //没有则返回第一个比这个数大的数的索引的负值
		System.out.println(index);
		
		int n = Arrays.binarySearch(a,99);
		System.out.println(n);                     //若全都比这个数小则为a.length
		System.out.println(a.length);            
		
		//在指定范围内进行查找
		int y = Arrays.binarySearch(a,0,5,34);     //在0~5的范围内查找34
		System.out.println(y);
		  
		//该方法对于字符串数组同样有效
		
	}

}
