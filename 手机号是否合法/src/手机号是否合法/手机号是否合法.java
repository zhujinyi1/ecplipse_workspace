package �ֻ����Ƿ�Ϸ�;

public class �ֻ����Ƿ�Ϸ� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String std = "1[358]\\d{9}";
		String a = "18162697659";
		
		boolean x = a.matches(std);
		
		if(x==true)
		{
			System.out.println(a+"�Ǳ�׼�ֻ���");
		}
		else
		{
			System.out.println(a+"���Ǳ�׼�ֻ���");
		}
	}

}
