package �滻������Ԫ��;

import java.util.Arrays;

public class �滻������Ԫ�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String arr[] = new String[] {"1","2","3","4"};
		
		//����1��ֱ���滻
		//arr[2] = "bb";
		
		//����2��Arrays.fill
		Arrays.fill(arr, 2,3,"bb");
		for(String x:arr) {
			System.out.println(x);
		}
	}

}
