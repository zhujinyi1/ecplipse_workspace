package ��̬�����ͳ���;

public class Demo {
		
	static int x = 5 ;
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo a = new Demo();
		a.b();
	}
	
	private void b() {                                   //��̬������־Ϊstatic
		System.out.println("x��ֵΪ"+Demo.x);             //����Demo��ľ�̬����x
														//��̬�������Ա�ȫ�ֹ�����������ֻ��Ҫʹ��  ����.������  �Ϳ��Ե���
	}

}
