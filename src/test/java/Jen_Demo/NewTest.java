package Jen_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void NewTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIVALLIPAVANAGAYATH\\Downloads\\chromedriver_win32");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("www.google.com");
	  System.out.println(driver.getTitle());
  }
}
