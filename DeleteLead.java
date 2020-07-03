package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElementByXPath("//span[text()='Email']").click();
		
		driver.findElementByXPath("//input[@name=\"emailAddress\"]").sendKeys("keerthivyask@gmail.com");
		
		driver.findElementByXPath("//button[text()=\"Find Leads\"]").click();
		
		driver.findElementByXPath("//a[text()=\"10073\"]").click();
		
		driver.findElementByClassName("subMenuButtonDangerous").click();
		
		Thread.sleep(4000);
		
		driver.findElementByXPath("//a[text()=\"Find Leads\"]").click();
		
		driver.findElementByXPath("//input[@name=\"id\"]").sendKeys("10073");
		
		driver.findElementByXPath("//button[text()=\"Find Leads\"]").click();
		
		String finalText = driver.findElementByXPath("//div[text()='No records to display']").getText();
		
		System.out.println(finalText);
		
		if (finalText.equalsIgnoreCase("No records to display")) {
			
			System.out.println("Verified Successfull - No records to display");
			
		} else {

			System.out.println("Lead still present");
		}

	}

}
