package 跳出指定循环;

public class 跳出指定循环 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a,i;
		Loop: for(a=1;a<=10;a++) {
				
				for(i=1;i<=10;i++)
				{
					
					if(a>5) {
						break Loop;           //当a=5时结束外层循环
					}
					System.out.println("a*i="+a+"*"+i+"="+a*i);
					
				}
		}
	}

}
