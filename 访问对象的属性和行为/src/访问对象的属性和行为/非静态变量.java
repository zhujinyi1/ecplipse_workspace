package ���ʶ�������Ժ���Ϊ;

public class �Ǿ�̬���� {
	
	int i = 47;
	
	public void call() {                    //��Ա����
		System.out.println("����call����");
		for(i = 0;i<3;i++) {
			System.out.println(i+" ");
			if(i==2) {
				System.out.println();
			}
		}
	}
	
	public �Ǿ�̬����() {                        //���췽��
		
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		�Ǿ�̬���� a = new �Ǿ�̬����();               //����һ������
		�Ǿ�̬���� b = new �Ǿ�̬����();               //
		
		a.i = 60;
		System.out.println("����a��i��ֵ��"+a.i);
		a.call();                             //��a�������call����
		System.out.println("����b��i��ֵ��"+b.i);
		b.call();                             //��b�������call����
		
	}

}
