package demo;

public class Demo1 extends Demo2{    //�̳У�����Demo1��̳���Demo2�ķ�private�����Ժͷ����������̳У�
	/*
	 * 
	���ؼ̳�   public class a extends b;    
			  public class b extends c;
			  
	�ظ��̳�   public class a extends b;
				public class c extends b;
				
	java��֧�֡���̳С�   ����public class a extends b,c;
	
	*/
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Demo1 a = new Demo1();
		
		a.setname("123");
		System.out.println(a.putname());
	}

}
