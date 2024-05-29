package com.ShoppersStack_Sanju.GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {

	public int generateRandomNumber() {
		Random r = new Random();
		int value = r.nextInt(1000);
		return value;
		
	}
	
	public String localDate()
	{
		return LocalDate.now().toString().replace("-","");
		
	}
	public String locaDateTime() {
		return LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
	}

}
