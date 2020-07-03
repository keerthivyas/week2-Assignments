package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("KVK");
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("keerthivyas");
		
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("keerthivyas");
		
		//driver.findElementByXPath("//input[@value='Create Lead']").click();
		WebElement drop1 = driver.findElementById("createLeadForm_dataSourceId");
		Select opt1 = new Select (drop1);
		opt1.selectByValue("LEAD_EMPLOYEE");
		
		driver.findElementByXPath("//input[@name=\"annualRevenue\"]").sendKeys("40000");
		
		WebElement drop2 = driver.findElementById("createLeadForm_industryEnumId");
		Select opt2 = new Select(drop2);
		opt2.selectByValue("IND_SOFTWARE");
		
		WebElement drop3 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select opt3 = new Select(drop3);
		opt3.selectByVisibleText("S-Corporation");
		
		driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
		
		WebElement drop4 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select opt4 = new Select(drop4);
		opt4.selectByIndex(6);
		
		WebElement drop5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select opt5 = new Select(drop5);
		opt5.selectByValue("TX");
		
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("keerthivyask@gmail.com");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("6379094864");
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
	}

}
