package �ȽϽ�ȡ���ַ���;

public class �ȽϽ�ȡ���ַ��� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String a = "sfdsfsd";
		String b = "sfddfsd";
		
		String c = a.substring(5);
		String d = b.substring(5);
		
		String e = a.substring(2);
		String f = b.substring(2);
		
		boolean y = c.equals(d);
		if(y==true)
		{
			System.out.println("��ȡ�������Ӵ���ͬ");
		}
		else 
		{
			System.out.println("��ȡ�������Ӵ���ͬ");
		}
		System.out.println(c);
		System.out.println(d);
		boolean x = e.equals(f);
		if(x==true)
		{
			System.out.println("��ȡ�������Ӵ���ͬ");
		}
		else
		{
			System.out.println("��ȡ�������Ӵ���ͬ");
		}
		System.out.println(e);
		System.out.println(f);
	}

}
