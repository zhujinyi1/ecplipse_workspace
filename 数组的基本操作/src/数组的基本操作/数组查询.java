package ����Ļ�������;

import java.util.Arrays;

public class �����ѯ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		//���������ͨ�����ֲ��ң���δ�ȶ�������������޷��õ���ȷ���
		int a[] = new int[] {12,43,76,54,56,98,23};
		Arrays.sort(a);                             //����
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		
		int m = Arrays.binarySearch(a, 43);         // ��������򷵻��������������
		System.out.println(m);
		
		int index = Arrays.binarySearch(a, 47);    //û���򷵻ص�һ���������������������ĸ�ֵ
		System.out.println(index);
		
		int n = Arrays.binarySearch(a,99);
		System.out.println(n);                     //��ȫ���������С��Ϊa.length
		System.out.println(a.length);            
		
		//��ָ����Χ�ڽ��в���
		int y = Arrays.binarySearch(a,0,5,34);     //��0~5�ķ�Χ�ڲ���34
		System.out.println(y);
		  
		//�÷��������ַ�������ͬ����Ч
		
	}

}
