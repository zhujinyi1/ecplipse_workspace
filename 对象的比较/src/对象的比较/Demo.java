package 对象的比较;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = new String("abc");//在堆内存中新开辟空间创建一个a变量，并赋值“abc”
		String b = new String("abc");//在堆内存中新开辟空间创建一个b变量，并赋值“abc”（其地址不等同于a）
		String c = a;                //直接将a的地址赋给c
		
		System.out.println("用== :"+(b==c));     //相当于比较地址，地址不同，输出false 
		System.out.println("用equals() :"+b.equals(c));//比较字符串，相同，输出true
	}

}
