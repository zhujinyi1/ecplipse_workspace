package demo;

public class Demo {
	
	public double chang;    //�����Ա����
	public double kuan;
	
	
	public Demo(double a,double b) {    //���췽�����Գ�����г�ʼ��
		this.chang = a;
		this.kuan = b;
		
	}
	
	public void S() {                   //��Ա������������������
		
		double s = this.chang*this.kuan;
		System.out.println("����"+chang+"\n"+"��"+kuan+"\n"+"�����"+s);
		
	}
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo a = new Demo(3,4);
		a.S();
	}

}
