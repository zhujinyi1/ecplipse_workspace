package this��ʹ��;

public class This��ʹ�� {
	String name = new String("zjy");	
	
	public static void main(String[] args) {
		This��ʹ�� b = new This��ʹ��();
		b.Test ("123");
	}
	
	public void Test(String name){
		System.out.println(this.name);       //��ӡ��Ա������ֵ
		System.out.println(name);            //��ӡ������ֵ

	}
}
