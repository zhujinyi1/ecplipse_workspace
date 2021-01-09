package 格式化字符串;
		import java.util.Date;
public class 格式化字符串 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       /*
      		注重format的使用，以及Date 型变量的创建      具体符号用法见书92页及以后
      */
		//format 处理时间
		
		Date date =new Date();
		
		//System.out.println(date);
		
		String year = String.format("%tY",date);
		String month = String.format("%tb",date);
		String day = String.format("%td", date);
		String hour = String.format("%tH", date);
		String minutes = String.format("%tM", date);
		String seconds = String.format("%tS", date);
		
		System.out.println("现在是"+year+"年,"+month+","+day+"日,"+hour+"时,"+minutes+"分,"+seconds+"秒");
	}

}
