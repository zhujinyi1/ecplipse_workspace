package 输入语句;
import java.util.*; 
public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Scanner s = new Scanner(System.in); 

        System.out.print("输入你的姓名："); 

        String name = s.nextLine(); 

        System.out.print("输入你的年龄："); 

        int age = s.nextInt(); 

        System.out.println("姓名：" + name + "  年龄：" + age ); 

        s.close();         //若没有关闭Scanner对象将会出现警告 
	}

}
