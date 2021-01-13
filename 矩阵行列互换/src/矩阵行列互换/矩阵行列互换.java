package 矩阵行列互换;

public class 矩阵行列互换 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[][] = new int[3][3];
		int x=1;
		for(int i=1;i<=3;i++)
			for(int j=1;j<=3;j++) {
				
				a[i-1][j-1]=x;
				x++;
			}
		for(int b[]:a)
		{
			for(int c : b)
				System.out.print(c+" ");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}			    
	}

}
