package 计算式子;

public class 计算公式 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i,j=1;
		double s=0.0;
		for(i=1;i<=20;i++) {
			j=j*i;
			s=s+1.0/(double)j;
		}
		System.out.println(s);
	}

}
