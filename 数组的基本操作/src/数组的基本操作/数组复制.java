package ����Ļ�������;

import java.util.Arrays;

public class ���鸴�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����һ����ͷ����
		int a[] = new int[] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("����a��");
		for(int n: a) {
		System.out.print(n+" ");
		}
		System.out.println();
		
		int b[] = Arrays.copyOf(a,10);    //��a���Ƶ�b�У�ʹ�����ɵ����鳤��Ϊ10�����������0��ȫ
		int c[] = Arrays.copyOf(a, 5);
		System.out.println("����b��");
		for(int x:b)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("����c��");
		for(int y:c) {
			System.out.print(y+" ");
		}
		System.out.println();
		//��������ѡ����
		int d[] = Arrays.copyOfRange(a, 2,7);//��2λ�ø��Ƶ�7λ�ã�������2λ�ã�������7λ�ã�
		
		System.out.println("����d��");
		for(int m : d) {
			System.out.print(m+" ");
		}
	}

}
