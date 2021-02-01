package 数字格式化;      

import java.text.DecimalFormat;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Demo m = new Demo();
//用format		
		m.f_format("##,##.###",12345.123);
		m.f_format("###%",0.125);
		m.f_applyPattern("##,##.###",12345.123);
		m.f_applyPattern("###%",0.125);

//用setGroupingSize();		
		DecimalFormat a = new DecimalFormat();
		a.setGroupingSize(2);                     //两个一分组
		double s = 5646131.3;
		System.out.println(a.format(s));
		
		a.setGroupingUsed(false);                 //不允许分组
		System.out.println(a.format(s));
	}

	
	
/*法一*/	public void f_format(String std , double x ) {          
			DecimalFormat a = new DecimalFormat(std);          //用包中的构造方法实例化对象
			String o = a.format(x);
			System.out.println(x+"  "+std+"  "+o);
		}



/*法二*/	public void f_applyPattern(String std , double x ) {
			DecimalFormat a = new DecimalFormat();            
			a.applyPattern(std);                               //用成员方法实例化对象
			System.out.println(x+"  "+std+"  "+a.format(x));
		}


}
