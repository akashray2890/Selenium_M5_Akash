package com.ShoppersStack_genericutility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_utility {
	public int generateRandomNumber() {
		Random r1=new Random();
		int num=r1.nextInt(1000);
		return num;
	}
	public String localDate() {
		return LocalDate.now().toString().replace("_", "");
	}
	
	public String localDateTime() {
		return LocalDateTime.now().toString().replace("-", "").replace(".", "").replace(":", "");
	}
	
}
