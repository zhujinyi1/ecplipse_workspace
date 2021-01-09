package 正则表达式;

public class 正则表达式 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			//正则表达式常用于判断语句中，判断其是否符合要求       详情请见书第96页
		//用match判断其是否符合标准
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";   //用正则表达式写标准的email地址
		String a = "sadasdasda";
		String b = "dsfdsfd@";
		String c = "2603698070@qq.com";
		
		if(a.matches(regex)) {                          //判断该字符串是否符合正则表达式标准
			System.out.println("a合法");
		}
		if(b.matches(regex)) {
			System.out.println("b合法");
		}
		if(c.matches(regex)) {
			System.out.println("c合法");
		}
	}

}
