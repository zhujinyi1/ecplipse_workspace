package �ַ���������;

public class �ַ��������� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		StringBuilder b = new StringBuilder("a s");
		System.out.println(b);
		b.append("j");
		System.out.println(b);                           //׷��
		
		StringBuilder c = new StringBuilder("asdfg");
		System.out.println(c);
		c.insert(3, " hello ");
		System.out.println(c);                           //����
		
		StringBuilder d = new StringBuilder("sdsfsa");
		System.out.println(d);
		d.delete(2, 5);
		System.out.println(d);                           //ɾ��
		
	}
}
