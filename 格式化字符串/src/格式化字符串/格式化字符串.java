package ��ʽ���ַ���;
		import java.util.Date;
public class ��ʽ���ַ��� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       /*
      		ע��format��ʹ�ã��Լ�Date �ͱ����Ĵ���      ��������÷�����92ҳ���Ժ�
      */
		//format ����ʱ��
		
		Date date =new Date();
		
		//System.out.println(date);
		
		String year = String.format("%tY",date);
		String month = String.format("%tb",date);
		String day = String.format("%td", date);
		String hour = String.format("%tH", date);
		String minutes = String.format("%tM", date);
		String seconds = String.format("%tS", date);
		
		System.out.println("������"+year+"��,"+month+","+day+"��,"+hour+"ʱ,"+minutes+"��,"+seconds+"��");
	}

}
