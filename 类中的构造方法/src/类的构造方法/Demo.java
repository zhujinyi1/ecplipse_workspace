package ��Ĺ��췽��;

public class Demo {                           //Demo��

	int i;
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo a = new Demo();
		System.out.println();
		Demo b = new Demo(1);

	}
	
	public Demo() {                           	//���췽��������ͬ��������ĳ�Ա������
												//����ʵ��������
		this(1);
		System.out.println("�޲������췽��");
	}
	
	public Demo(int i) {
		this.i=i;
		if(i==1) {
			System.out.println("i=1");
		}
		else
			System.out.println("i!=1");
	}
	

}
