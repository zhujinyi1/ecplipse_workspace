package 字符串替换;

public class 字符串替换 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a="asadafagahajakal";
		
		System.out.println(a);
		
		System.out.println(   a.replace("a", "A")    );     //将a替换为A
		System.out.println(   a.replaceAll("a", "A")    );   //与上等价
		
		
		System.out.println(   a.replaceFirst("a","A"));     //只替换第一个     
 
	}

}
