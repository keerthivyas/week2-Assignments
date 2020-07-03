package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps");
	driver.findElementById("username").sendKeys("Demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("KVK");
	driver.findElementById("createLeadForm_firstName").sendKeys("keerthivyas");
	driver.findElementById("createLeadForm_lastName").sendKeys("Kishore");
	driver.findElementByClassName("smallSubmit").click();
}
}