package Tests;

import org.testng.annotations.Test;

import Lib.uihelper;

public class Flow_001_Launch_and_Close_Browser_test {
	
	@Test
	public void launchAndCloseBrowser() {
			
		uihelper.launchUrl("https://www.google.com ");
		uihelper.closer();
		
	}
}
