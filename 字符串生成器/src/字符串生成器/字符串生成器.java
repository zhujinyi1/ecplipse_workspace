package 字符串生成器;

public class 字符串生成器 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		StringBuilder b = new StringBuilder("a s");
		System.out.println(b);
		b.append("j");
		System.out.println(b);                           //追加
		
		StringBuilder c = new StringBuilder("asdfg");
		System.out.println(c);
		c.insert(3, " hello ");
		System.out.println(c);                           //插入
		
		StringBuilder d = new StringBuilder("sdsfsa");
		System.out.println(d);
		d.delete(2, 5);
		System.out.println(d);                           //删除
		
	}
}
