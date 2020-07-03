package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@class,'decorative')]").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("KVK");
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("keerthivyas");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("keerthivyas");
		driver.findElementByXPath("//input[@value='Create Lead']").click();
	}
}
