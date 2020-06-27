package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	  System.setProperty("webdriver.chrome.driver","chromedrivercvbvc.exe");

	   driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	//Assert.assertEquals(text, search_text, "Text not found!");
  }}