package ����ıȽ�;

public class Demo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String a = new String("abc");//�ڶ��ڴ����¿��ٿռ䴴��һ��a����������ֵ��abc��
		String b = new String("abc");//�ڶ��ڴ����¿��ٿռ䴴��һ��b����������ֵ��abc�������ַ����ͬ��a��
		String c = a;                //ֱ�ӽ�a�ĵ�ַ����c
		
		System.out.println("��== :"+(b==c));     //�൱�ڱȽϵ�ַ����ַ��ͬ�����false 
		System.out.println("��equals() :"+b.equals(c));//�Ƚ��ַ�������ͬ�����true
	}

}
