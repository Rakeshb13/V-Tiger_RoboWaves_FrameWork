package com.vtiger.genericlibrary;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * 
 * @author [Rakesh B]
 */
public class JavaUtility {
	
	public static int getRandomNumber() {
		return new Random().nextInt(2000);
	}

	public static String getTimeStamp() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
}
