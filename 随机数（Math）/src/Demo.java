//random������ʹ�ã�����һ��0-1֮��ĸ�����������Math�ࣩ
//Random��ʹ�ã�next+����(����ĸ��д)������ʱ���������ޣ�Ĭ�ϴ���0����ֻ�������ֺͲ����ͱ���

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		/*Math�࣬random����*/
		System.out.println(Math.random());             //Math.random�������ɵ���һ��0-1֮������������
		System.out.println("����һ��2~32֮��������ż��:"+a(2,32));
		System.out.println("����һ��a~z֮����ַ�:"+b('a','z'));

	    /*Random��*/
		Random a = new Random();
		System.out.println(a.nextInt(10));
		System.out.println(a.nextBoolean());
		
	}
	
	public static int a(double m,double n) {         //m���ޣ�n����   //���������
		int s = (int)m+(int)(Math.random()*(n-m));       //���������
		if(s%2 == 0) {
			return s;
		}
		else {
			return s+1;
		}
	}
	
	public static char b(char m,char n) {           //��������ַ�
		char x = (char)(m+Math.random()*(n-m));
		return x;
	}
}
