package ��̬�����;

public class Demo {
	
	  //��������ʱ��ͬһ����Ĵ�������˳��Ϊ����̬����飬�Ǿ�̬����飬���췽������Ա����
	//��̬�����һ�����ڶ�����г�ʼ��
	//���췽���ڴ�������ʱ���Զ�����
	
	
	public static void main(String[] args) {
		
		Demo a = new Demo();
		
		a.a();
		
		
	}
	
	public Demo() {
		System.out.println("���췽��");
	}
	
	public void a() {
		System.out.println("��Ա����");
	}
	
	static {
		System.out.println("��̬�����");
	}
	
	{
		System.out.println("�Ǿ�̬�����");
	}
	
	
	
	
}
