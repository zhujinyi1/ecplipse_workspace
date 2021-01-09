package 去除空格;

public class 去空格 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			String a="  dasas sad dsas  ddfd    fd		dsfsdds    ";
			System.out.println(a.length());				
			System.out.println(a.trim());                          //去首空格
			System.out.println(a.trim().length());
			System.out.println(a.replaceAll("\\s",""));            //去全部空格，用字符替换，将空格替换为空
	}

}
