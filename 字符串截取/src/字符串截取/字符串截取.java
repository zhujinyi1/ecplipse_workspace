package �ַ�����ȡ;

public class �ַ�����ȡ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		char a[]={'a','s','d','f'};
		String b="dgfjhytyhgnkuiu";
		//String(char a[], int offset ,int length)��ȡ�ַ�����offset��ʾ��ȡλ�ã�length��ʾ��ȡ����
		String s= new String(a,2,2);
		// String s= new String(b,2,2);--------���﷨Ϊ�����﷨
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
	}

}
