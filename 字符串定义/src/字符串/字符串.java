package �ַ���;

public class �ַ��� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			char a[]= {'ף','��','һ'};           //String Ϊ�ض����ַ������飬��char a[]�ȼ�
			String b="ף��һ";
			System.out.println(a);
			System.out.println(b);
			System.out.println();
			System.out.println();
			//String(char a[], int offset ,int length)��ȡ�ַ�����offset��ʾ��ȡλ�ã�length��ʾ��ȡ����
			String s= new String(a,2,1);
			
			System.out.println(a);
			System.out.println(s);
			
			//��ȡ�ַ�������
			System.out.println(b.length());
			//�����ַ�������ĸ���еĻ�������ĸ�����������ڵ����㣩���޷���-1
			if(b.indexOf("��")>-1)
				System.out.println("�ַ������н�");
	}

}
