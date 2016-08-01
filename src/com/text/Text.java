package com.text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("可以了？更新一下！！。。。cbvbcv");
		System.out.println("为什么！！");
		
		
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		long now = Long.parseLong("1432285124000");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(now);
		System.out.println(calendar.getTime());
		System.out.println(now + " = " + formatter.format(calendar.getTime())); 
	}

}
