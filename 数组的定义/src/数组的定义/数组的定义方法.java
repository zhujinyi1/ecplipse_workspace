package ����Ķ���;             //���������һά����ά���鶨�巽������ʼ��������
                               //�Լ��Զ�ά����ÿһά���г�ʼ��
public class ����Ķ��巽�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String m = new String("sdsada");  
		String[] b = new String[]{"bnbvdd","sbhj","ajkjj","hsdas"};      //�����ʼ�����Լ��ַ������鶨��
		System.out.println(m);
		
		/*
		 * ��������һ��   forѭ��
		 * for(int n=0;n<4;n++) {
			System.out.println(b[i]);
		}
		*/
		//��������        foreach���
		for(String x : b) {
			System.out.println(x);
		}
		
		//��ά���飬���巽��ͬ�ϣ���һ����C���Բ�ͬ��Java�ж�ά����ɶ�ÿһά��ֵ
		
		int a[][];
		a = new int [2][];                  //��������
		a[0] = new int[3];    //������ά����a[][]�ĵ�һά��������ֵ��
		a[1] = new int[2];    //�ڶ�ά������ֵ
		
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		
		//������ά����
		for(int c[] : a) {               //���������ÿһά                              
			int j=0;
			for(int d : c) {             //����ÿһά�е�Ԫ��
				j++;
				if(j==c.length)
					System.out.println(d);
				else
					System.out.print(d+" ");
			}
		}
		
		
		
		
	}

}
