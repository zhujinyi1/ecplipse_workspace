package demo;

public class Demo1 extends Demo2{    //继承，（类Demo1会继承类Demo2的非private的属性和方法）（单继承）
	/*
	 * 
	多重继承   public class a extends b;    
			  public class b extends c;
			  
	重复继承   public class a extends b;
				public class c extends b;
				
	java不支持“多继承”   即：public class a extends b,c;
	
	*/
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Demo1 a = new Demo1();
		
		a.setname("123");
		System.out.println(a.putname());
	}

}
