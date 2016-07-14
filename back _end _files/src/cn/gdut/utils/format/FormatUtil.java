package cn.gdut.utils.format;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*
*数据格式化
*/
public class FormatUtil
{
	public static String formatDate(Long time)
	{
		if(time  == null ) return "";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(new Date(time));
	}
	
	public static String formatMoney(Double money)
	{
		if(money  == null ) return "";
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(money);
	}
}
