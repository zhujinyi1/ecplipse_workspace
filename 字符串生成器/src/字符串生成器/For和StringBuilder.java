package 字符串生成器;

public class For和StringBuilder {

	public static void main(String[] args) {                      //比较用for循环和StringBuilder的执行时间
		// TODO 自动生成的方法存根
		String str = "";                                          //创建空字符串
		long starTime = System.currentTimeMillis();               //定义开始时间
		for( int i=0 ; i<10000 ; i++ ) {                          //用for循环进行10000次操作
			str=str+i;                                            //循环追加字符串
		}
		long endTime = System.currentTimeMillis();                //定义对字符串操作后的时间
		long time = endTime - starTime;                           //计算时间差
		System.out.println("String消耗时间 ：" + time);             
		StringBuilder builder = new StringBuilder("");            //创建字符串生成器
		starTime = System.currentTimeMillis();                    //定义开始时间
		for(int j=0;j<10000;j++) {                                //循环10000次
			builder.append(j);                                    //循环追加字符
		}
		endTime =System.currentTimeMillis();                      //定义操作后的时间
		time = endTime - starTime;                                //计算时间差
		System.out.println("stringBuilder消耗时间 ："+ time);
	}

}                                                                  //StringBuilder速度远大于for循环
