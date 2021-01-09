package 手机号是否合法;

public class 手机号是否合法 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String std = "1[358]\\d{9}";
		String a = "18162697659";
		
		boolean x = a.matches(std);
		
		if(x==true)
		{
			System.out.println(a+"是标准手机号");
		}
		else
		{
			System.out.println(a+"不是标准手机号");
		}
	}

}
