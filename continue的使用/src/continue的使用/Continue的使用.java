package continue的使用;

public class Continue的使用 {
		
	public static void main(String[] args) {
		for(int i=1;i<20;i++) {
			if(i%2==0) {
				continue;             //直接进入下一层循环
			}
			System.out.println(i);
		}
		
	}
}
