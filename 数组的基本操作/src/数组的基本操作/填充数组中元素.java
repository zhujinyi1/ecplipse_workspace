package ����Ļ�������;

import java.util.Arrays;

public class ���������Ԫ�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int arr[] = new int[5];
		Arrays.fill(arr,8);
		for(int x: arr) {
			System.out.println(x);
		}
		
		int a[] = new int[] {1,2,3,4,5};
		Arrays.fill(a, 1,2,8);
		/*Arrays.fill(a, 1,2,8);������Ƕ�������ĳЩԪ�ؽ��и�ֵ
		 * ���壺������a�Ĵӵ�1λ�ã�����������2λ�ã�����������ֵ��Ϊ8*/
		
		for(int x: a) {
			System.out.println(x);
		}
	}

}
