package ���ָ�ʽ��;      

import java.text.DecimalFormat;

public class Demo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Demo m = new Demo();
//��format		
		m.f_format("##,##.###",12345.123);
		m.f_format("###%",0.125);
		m.f_applyPattern("##,##.###",12345.123);
		m.f_applyPattern("###%",0.125);

//��setGroupingSize();		
		DecimalFormat a = new DecimalFormat();
		a.setGroupingSize(2);                     //����һ����
		double s = 5646131.3;
		System.out.println(a.format(s));
		
		a.setGroupingUsed(false);                 //���������
		System.out.println(a.format(s));
	}

	
	
/*��һ*/	public void f_format(String std , double x ) {          
			DecimalFormat a = new DecimalFormat(std);          //�ð��еĹ��췽��ʵ��������
			String o = a.format(x);
			System.out.println(x+"  "+std+"  "+o);
		}



/*����*/	public void f_applyPattern(String std , double x ) {
			DecimalFormat a = new DecimalFormat();            
			a.applyPattern(std);                               //�ó�Ա����ʵ��������
			System.out.println(x+"  "+std+"  "+a.format(x));
		}


}
