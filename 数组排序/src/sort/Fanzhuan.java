package sort;           //��ת����

/*
 * ������ÿ��ѭ��ͬʱ�ź��������ߵ�ֵ�������ѭ�����������鳤�ȵ�һ��
 * ÿ�ν����������ߵ�ֵ
*/

public class Fanzhuan {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a[] = new int[] {1,2,3,4,5,6};
		Fanzhuan sorts = new Fanzhuan();   //����������Ķ���
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
