package �ַ����ָ�;

public class �ַ����ָ� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String a = new String ("122.204.83.250");
		
		String[] b = a.split("\\.");                 //���ա�.���ָ��ַ���a��ʹ��ת���ַ�"\\.",������������ַ�������b��
		
		String[] c = a.split("\\.",2);               //���ա�.���ָ��ַ���a���Σ�ʹ��ת���ַ�"\\."�������������ַ�������c��
		
		System.out.println(a);
		System.out.println();
		
		for(String x : b) {
			System.out.print("["+x+"]"+",");        //�����ַ�������b
		}
		System.out.println();
		
		for(String y : c) {
			System.out.print("["+y+"]"+",");       //�����ַ�������c
		}
		System.out.println();
	}

}
