package ������ʽ;

public class ������ʽ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			//������ʽ�������ж�����У��ж����Ƿ����Ҫ��       ����������96ҳ
		//��match�ж����Ƿ���ϱ�׼
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";   //��������ʽд��׼��email��ַ
		String a = "sadasdasda";
		String b = "dsfdsfd@";
		String c = "2603698070@qq.com";
		
		if(a.matches(regex)) {                          //�жϸ��ַ����Ƿ����������ʽ��׼
			System.out.println("a�Ϸ�");
		}
		if(b.matches(regex)) {
			System.out.println("b�Ϸ�");
		}
		if(c.matches(regex)) {
			System.out.println("c�Ϸ�");
		}
	}

}
