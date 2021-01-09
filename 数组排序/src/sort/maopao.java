package sort;            //冒泡排序

public class maopao {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[] = new int[]{23,54,67,45,65,32,40};
		maopao sorter = new maopao();
		sorter.sort(a);
	}
	
	public void sort(int[] array )
	{
		for(int i=1 ; i<array.length ; i++)
			for(int j=0 ; j<array.length - i ; j++) {
				if(array[j]>=array[j+1])
				{
					int t = array[j];
					array[j] = array[j+1];
					array[j+1] = t;
				}
			}
		display(array);
	}
	
	public void display(int[] array)
	{
		for(int x : array)
		{
			System.out.println(x);
		}
	}

}
