package ��������;

import java.util.Arrays;

public class �������� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int arr1[] = new int[] {1,2,3,4,5,6};
		int arr2[] = Arrays.copyOf(arr1, 3);
		for(int x: arr1)
			System.out.print(x+" ");
		System.out.println();
		for(int y:arr2)
			System.out.print(y+" ");
	}

}
