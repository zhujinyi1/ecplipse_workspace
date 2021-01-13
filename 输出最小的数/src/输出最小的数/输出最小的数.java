package 输出最小的数;

public class 输出最小的数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[] = new int[] {43,54,32,76,98,85,25,74,12};
		int j=0;
		for(int i=0;i<a.length;i++)
			if(a[i]<a[j])
				j=i;
		System.out.println(a[j]);
	}

}
