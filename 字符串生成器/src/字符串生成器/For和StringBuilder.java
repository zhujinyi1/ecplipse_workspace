package �ַ���������;

public class For��StringBuilder {

	public static void main(String[] args) {                      //�Ƚ���forѭ����StringBuilder��ִ��ʱ��
		// TODO �Զ����ɵķ������
		String str = "";                                          //�������ַ���
		long starTime = System.currentTimeMillis();               //���忪ʼʱ��
		for( int i=0 ; i<10000 ; i++ ) {                          //��forѭ������10000�β���
			str=str+i;                                            //ѭ��׷���ַ���
		}
		long endTime = System.currentTimeMillis();                //������ַ����������ʱ��
		long time = endTime - starTime;                           //����ʱ���
		System.out.println("String����ʱ�� ��" + time);             
		StringBuilder builder = new StringBuilder("");            //�����ַ���������
		starTime = System.currentTimeMillis();                    //���忪ʼʱ��
		for(int j=0;j<10000;j++) {                                //ѭ��10000��
			builder.append(j);                                    //ѭ��׷���ַ�
		}
		endTime =System.currentTimeMillis();                      //����������ʱ��
		time = endTime - starTime;                                //����ʱ���
		System.out.println("stringBuilder����ʱ�� ��"+ time);
	}

}                                                                  //StringBuilder�ٶ�Զ����forѭ��
