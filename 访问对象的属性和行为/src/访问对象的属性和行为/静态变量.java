package ���ʶ�������Ժ���Ϊ;

public class ��̬���� {
	
	static int i = 47;          //�ñ�����֮����ı�����ָ��ͬһ���ڴ棬
	
	public void call() {                    //��Ա����
		System.out.println("����call����");
		for(i = 0;i<3;i++) {
			System.out.println(i+" ");
			if(i==2) {
				System.out.println();
			}
		}
	}
	
	public ��̬����() {                        //���췽��
		
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		��̬���� a = new ��̬����();               //����һ������
		��̬���� b = new ��̬����();               //
		
		b.i = 60;
		System.out.println("����a��i��ֵ��"+a.i);  //����b�޸ĺ���a����Ҳ��60������֮�󻹲���forѭ��
		a.call();                             //��a�������call����
		System.out.println("����b��i��ֵ��"+b.i);
		b.call();                             //��b�������call����
		
	}

}
