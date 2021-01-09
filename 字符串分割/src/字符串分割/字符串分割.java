package 字符串分割;

public class 字符串分割 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = new String ("122.204.83.250");
		
		String[] b = a.split("\\.");                 //按照“.”分割字符串a，使用转义字符"\\.",将结果保存在字符串数组b中
		
		String[] c = a.split("\\.",2);               //按照“.”分割字符串a两次，使用转义字符"\\."，将结果存放在字符串数组c中
		
		System.out.println(a);
		System.out.println();
		
		for(String x : b) {
			System.out.print("["+x+"]"+",");        //遍历字符串数组b
		}
		System.out.println();
		
		for(String y : c) {
			System.out.print("["+y+"]"+",");       //遍历字符串数组c
		}
		System.out.println();
	}

}
