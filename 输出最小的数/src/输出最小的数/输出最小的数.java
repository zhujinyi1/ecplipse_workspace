package �����С����;

public class �����С���� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a[] = new int[] {43,54,32,76,98,85,25,74,12};
		int j=0;
		for(int i=0;i<a.length;i++)
			if(a[i]<a[j])
				j=i;
		System.out.println(a[j]);
	}

}
