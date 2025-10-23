package Tests;

import org.testng.annotations.Test;

import Lib.uihelper;

public class Test_001_Launch_and_Close_Browser_flow {
	
	@Test
	public static void main(String[] args) {
			
		uihelper.launchUrl("https://www.google.com");
		uihelper.closer();
		
	}
}
