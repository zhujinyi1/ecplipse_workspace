package demo;

public class Demo {
	
	public double chang;    //定义成员变量
	public double kuan;
	
	
	public Demo(double a,double b) {    //构造方法，对长宽进行初始化
		this.chang = a;
		this.kuan = b;
		
	}
	
	public void S() {                   //成员方法，求面积，并输出
		
		double s = this.chang*this.kuan;
		System.out.println("长："+chang+"\n"+"宽："+kuan+"\n"+"面积："+s);
		
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo a = new Demo(3,4);
		a.S();
	}

}
