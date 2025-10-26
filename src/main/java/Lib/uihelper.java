package Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uihelper {
	
	static WebDriver driver;

	static {
	    ChromeOptions options = new ChromeOptions();
	
	    // Read headless property from Jenkins (or pom)
	    if ("true".equalsIgnoreCase(System.getProperty("headless"))) {
	        options.addArguments("--headless=new");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");
	        options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--window-size=1920,1080");
	    }
	
	    driver = new ChromeDriver(options);
	}
	
	//************* Luaunching the Browser (Url) ************************
	public static void launchUrl(String url, String expectedBrowserTitle) {
		try{
			
			driver.get(url);
			reporter.info("Browser launched successfully");
			String ActualTitle =driver.getTitle();
			reporter.info("Launched Browser Title - " +ActualTitle);
			
			if(expectedBrowserTitle !=null && !expectedBrowserTitle.isEmpty() ) {
				if (ActualTitle.equalsIgnoreCase(expectedBrowserTitle)) {
					reporter.pass("Browser Title Validation passed : Actual Title is '" + ActualTitle + "' and Expected Title is '"+expectedBrowserTitle+"'");
				}else {
					reporter.fail("Browser Title Validation failed : Actual Title is '" + ActualTitle +"' and Expected Title is '"+expectedBrowserTitle+"'");
				}
			}
			
		}catch (Exception e){
			System.out.println(e);
		}
		
	}
	
	public static void launchUrl(String url) {
		launchUrl(url,null);
	}
	
	public static void login() {
		
	}
	
	//********************* Closing the Browser ******************

	public static void closer() {
		try {
			driver.close();
			reporter.info("Browser closed successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//********************* click ******************
	
	/*
	 * Options for click any web Element in UI
	 * 1. With xpath
	 * 2. With label text
	 * 3. With other 
	 */
	
	public static void click() {
		
		
	}
	
	//********************* Set ******************
		
	public static void set() {
		
		
	}
	
	//********************* select ******************
	
	public static void select() {
		
		
	}
	
	//********************* clear Text ******************
	
	public static void clearText() {
		
		
	}
	
	//********************* clear Text ******************
	
	public static void check() {
		
		
	}
	
	
	public static void Uncheck() {
		
		
	}
	
   public static void wait(int time) {
		
		
	}
   
   public static void logout() {
	   
   }
	

}
