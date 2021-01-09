package sort;                    //直接选择排序

public class ZhijieXuanze {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[] = new int[] {23,54,34,65,99,66,44,62};
		ZhijieXuanze sorts = new ZhijieXuanze();
		sorts.sort(a);
	}
	
	public void sort(int arr[])
	{
		for(int i=1;i<arr.length;i++) {
			int k=0;
			for(int j=1;j<=arr.length-i;j++) {
				if(arr[j]>arr[k])
					k=j;
			}
			int t = arr[arr.length-i];
			arr[arr.length-i] = arr[k];
			arr[k] = t;
		}
		display(arr);
	}
	
	public void display(int arr[]) {
		for(int x : arr) {
			System.out.println(x);
		}
	}
}
