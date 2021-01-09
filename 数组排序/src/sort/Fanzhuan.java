package sort;           //反转排序

/*
 * 该排序法每次循环同时排好数组两边的值，因此其循环次数是数组长度的一半
 * 每次交换数组两边的值
*/

public class Fanzhuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[] = new int[] {1,2,3,4,5,6};
		Fanzhuan sorts = new Fanzhuan();   //创建排序类的对象
		sorts.sort(a);
	}
	
	public void sort(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			int t = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = t ;
		}
		display(arr);
	}
	
	public void display(int arr[]) {
		for(int x  : arr) {
			System.out.println(x);
		}
	}
}
