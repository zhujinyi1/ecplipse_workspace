package 数组的定义;             //本代码包括一维，二维数组定义方法，初始化，遍历
                               //以及对二维数组每一维进行初始化
public class 数组的定义方法 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String m = new String("sdsada");  
		String[] b = new String[]{"bnbvdd","sbhj","ajkjj","hsdas"};      //数组初始化，以及字符串数组定义
		System.out.println(m);
		
		/*
		 * 遍历方法一：   for循环
		 * for(int n=0;n<4;n++) {
			System.out.println(b[i]);
		}
		*/
		//方法二：        foreach语句
		for(String x : b) {
			System.out.println(x);
		}
		
		//二维数组，定义方法同上，有一点与C语言不同，Java中二维数组可对每一维赋值
		
		int a[][];
		a = new int [2][];                  //定义列数
		a[0] = new int[3];    //这样二维数组a[][]的第一维就有三个值，
		a[1] = new int[2];    //第二维有两个值
		
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		
		//遍历二维数组
		for(int c[] : a) {               //遍历数组的每一维                              
			int j=0;
			for(int d : c) {             //遍历每一维中的元素
				j++;
				if(j==c.length)
					System.out.println(d);
				else
					System.out.print(d+" ");
			}
		}
		
		
		
		
	}

}
