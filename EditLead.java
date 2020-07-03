package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[contains(@class,'decorative')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		driver.findElementByXPath("//a[text()=\"Find Leads\"]").click();
		
		driver.findElementByXPath("(//input[@name=\"companyName\"])[2]").sendKeys("KVK1234");

		driver.findElementByXPath("//button[text()=\"Find Leads\"]").click();
		
		driver.findElementByXPath("//a[text()=\"10030\"]").click();
		
		driver.findElementByXPath("(//a[@class=\"subMenuButton\"])[3]").click();
		
		System.out.println(driver.findElementByXPath("(//input[@name=\'companyName\'])[2]").getAttribute("value"));
		
		driver.findElementByXPath("(//input[@name=\'companyName\'])[2]").clear();
		
		driver.findElementByXPath("(//input[@name=\'companyName\'])[2]").sendKeys("KVK789798");
		
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
		
		driver.close();
		
		
	}

}
