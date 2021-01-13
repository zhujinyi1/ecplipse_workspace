package this的使用;

public class This的使用 {
	String name = new String("zjy");	
	
	public static void main(String[] args) {
		This的使用 b = new This的使用();
		b.Test ("123");
	}
	
	public void Test(String name){
		System.out.println(this.name);       //打印成员变量的值
		System.out.println(name);            //打印参数的值

	}
}
