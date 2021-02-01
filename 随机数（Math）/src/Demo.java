//random函数的使用：产生一个0-1之间的浮点数（属于Math类）
//Random类使用，next+类型(首字母大写)（数字时可输入上限，默认大于0），只限于数字和布尔型变量

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		/*Math类，random函数*/
		System.out.println(Math.random());             //Math.random函数生成的是一个0-1之间的随机浮点数
		System.out.println("生成一个2~32之间的随机数偶数:"+a(2,32));
		System.out.println("生成一个a~z之间的字符:"+b('a','z'));

	    /*Random类*/
		Random a = new Random();
		System.out.println(a.nextInt(10));
		System.out.println(a.nextBoolean());
		
	}
	
	public static int a(double m,double n) {         //m下限，n上限   //生成随机数
		int s = (int)m+(int)(Math.random()*(n-m));       //生成随机数
		if(s%2 == 0) {
			return s;
		}
		else {
			return s+1;
		}
	}
	
	public static char b(char m,char n) {           //生成随机字符
		char x = (char)(m+Math.random()*(n-m));
		return x;
	}
}
