package com.cumulus.ui.automation.common.test;
import java.time.Instant;
public class TestTime {
	
	
	public static void main(String[] args) {
		
		
		String epocTime=String.valueOf(Instant.now().getEpochSecond());
		System.out.println(epocTime);
		
		
	}

}
