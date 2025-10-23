package Tests;

import Lib.uihelper;

public class Test_001_Launch_and_Close_Browser_flow {
	
	public static void main(String[] args) {
			
		uihelper.launchUrl("https://www.google.com");
		uihelper.closer();
		
	}
}
